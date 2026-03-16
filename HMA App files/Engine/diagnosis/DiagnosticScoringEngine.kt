package com.yourapp.medassist.engine.diagnosis

import com.yourapp.medassist.source.diseases.DiseaseSymptomMap

object DiagnosticScoringEngine {

    fun scoreDiseases(patientSymptoms: List<String>): Map<String, Int> {

        val diseaseScores = mutableMapOf<String, Int>()

        for ((disease, symptoms) in DiseaseSymptomMap.map) {

            var score = 0

            for (symptom in patientSymptoms) {

                if (symptoms.contains(symptom)) {
                    score += 10
                }

            }

            if (score > 0) {
                diseaseScores[disease] = score
            }

        }

        return diseaseScores.toList()
            .sortedByDescending { it.second }
            .toMap()
    }

}