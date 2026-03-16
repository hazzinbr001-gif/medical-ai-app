package com.yourapp.medassist.engine.diagnostic

import com.yourapp.medassist.source.symptoms.SymptomWeights

object DiagnosticExplanationEngine {

    data class ExplanationResult(

        val diseaseId: String,
        val explanation: List<String>

    )

    fun explain(

        diseaseId: String,
        patientSymptoms: List<String>,
        diseaseSymptomMap: Map<String, List<String>>,
        age: Int

    ): ExplanationResult {

        val explanation = mutableListOf<String>()

        val relatedSymptoms = diseaseSymptomMap[diseaseId] ?: emptyList()

        for (symptom in patientSymptoms) {

            if (relatedSymptoms.contains(symptom)) {

                val weight = SymptomWeights.weights[symptom] ?: 1

                explanation.add(
                    "$symptom matched (weight $weight)"
                )

            }

        }

        if (age >= 60) {

            explanation.add("Age risk factor (60+)")

        }

        if (explanation.isEmpty()) {

            explanation.add("General probability based on disease prevalence")

        }

        return ExplanationResult(

            diseaseId = diseaseId,
            explanation = explanation

        )

    }

}