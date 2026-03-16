package com.yourapp.medassist.engine.diagnosis

import com.yourapp.medassist.source.diseases.DiseaseSymptomMap
import com.yourapp.medassist.source.symptoms.SymptomWeights

object DiagnosisExplainer {

    data class Explanation(
        val diseaseId: String,
        val matchedSymptoms: List<String>,
        val scoreBreakdown: Map<String, Int>,
        val totalScore: Int
    )

    fun explain(diseaseId: String, patientSymptoms: List<String>): Explanation {

        val diseaseSymptoms = DiseaseSymptomMap.map[diseaseId] ?: emptyList()

        val matched = patientSymptoms.filter { diseaseSymptoms.contains(it) }

        val breakdown = mutableMapOf<String, Int>()

        var total = 0

        for (symptom in matched) {

            val weight = SymptomWeights.weights[symptom] ?: 5
            breakdown[symptom] = weight
            total += weight

        }

        return Explanation(
            diseaseId = diseaseId,
            matchedSymptoms = matched,
            scoreBreakdown = breakdown,
            totalScore = total
        )

    }

}