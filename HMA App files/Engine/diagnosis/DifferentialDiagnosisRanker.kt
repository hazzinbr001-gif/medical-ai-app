package com.yourapp.medassist.engine.diagnostic

import com.yourapp.medassist.source.diseases.Disease
import com.yourapp.medassist.source.symptoms.SymptomWeights
import com.yourapp.medassist.engine.analytics.AgeRiskModifier

object DifferentialDiagnosisRanker {

    data class RankedDisease(

        val diseaseId: String,
        val score: Int

    )

    fun rankDiseases(

        symptoms: List<String>,
        diseases: List<Disease>,
        diseaseSymptomMap: Map<String, List<String>>,
        age: Int

    ): List<RankedDisease> {

        val ranked = mutableListOf<RankedDisease>()

        val ageModifier = AgeRiskModifier.modifiers(age)

        for (disease in diseases) {

            val relatedSymptoms = diseaseSymptomMap[disease.id] ?: emptyList()

            var score = 0

            for (symptom in symptoms) {

                if (relatedSymptoms.contains(symptom)) {

                    val weight = SymptomWeights.weights[symptom] ?: 1
                    score += weight

                }

            }

            val ageBonus = ageModifier.riskModifiers[disease.id] ?: 0

            score += ageBonus

            score += disease.commonality

            ranked.add(

                RankedDisease(
                    diseaseId = disease.id,
                    score = score
                )

            )

        }

        return ranked.sortedByDescending { it.score }

    }

}