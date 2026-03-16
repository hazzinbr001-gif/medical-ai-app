package com.yourapp.medassist.engine.diagnosis

import com.yourapp.medassist.source.diseases.DiseaseSymptomMap
import com.yourapp.medassist.source.diseases.DiseaseRiskFactors
import com.yourapp.medassist.source.symptoms.SymptomWeights

object DifferentialDiagnosisEngine {

    data class PatientCase(
        val symptoms: List<String>,
        val riskFactors: List<String> = emptyList(),
        val age: Int? = null,
        val sex: String? = null
    )

    data class DiagnosisResult(
        val diseaseId: String,
        val score: Int
    )

    fun evaluate(case: PatientCase): List<DiagnosisResult> {

        val results = mutableListOf<DiagnosisResult>()

        for ((disease, diseaseSymptoms) in DiseaseSymptomMap.map) {

            var score = 0

            // Symptom scoring
            for (symptom in case.symptoms) {

                if (diseaseSymptoms.contains(symptom)) {

                    val weight = SymptomWeights.weights[symptom] ?: 5
                    score += weight

                }

            }

            // Risk factor scoring
            val riskData = DiseaseRiskFactors.map[disease]

            if (riskData != null) {

                for (risk in case.riskFactors) {

                    if (riskData.majorRiskFactors.contains(risk)) {
                        score += 6
                    }

                    if (riskData.minorRiskFactors.contains(risk)) {
                        score += 3
                    }

                }

            }

            // Age adjustment (basic example)
            if (case.age != null) {

                if (case.age > 60 && disease == "DIS_STROKE") {
                    score += 5
                }

                if (case.age > 50 && disease == "DIS_MYOCARDIAL_INFARCTION") {
                    score += 5
                }

            }

            if (score > 0) {
                results.add(DiagnosisResult(disease, score))
            }

        }

        return results.sortedByDescending { it.score }

    }

}