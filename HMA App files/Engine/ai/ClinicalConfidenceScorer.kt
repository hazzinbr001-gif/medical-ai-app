package com.yourapp.medassist.engine.ai

object ClinicalConfidenceScorer {

    data class DiagnosisScore(

        val disease: String,
        val confidence: Int,
        val matchedSymptoms: Int,
        val totalSymptoms: Int

    )

    fun scoreDiagnoses(

        patientSymptoms: List<String>,
        diseaseSymptomMap: Map<String, List<String>>

    ): List<DiagnosisScore> {

        val results = mutableListOf<DiagnosisScore>()

        for ((disease, symptoms) in diseaseSymptomMap) {

            val matches = symptoms.count {

                patientSymptoms.contains(it)

            }

            if (matches > 0) {

                val confidence =
                    ((matches.toDouble() / symptoms.size) * 100).toInt()

                results.add(

                    DiagnosisScore(
                        disease = disease,
                        confidence = confidence,
                        matchedSymptoms = matches,
                        totalSymptoms = symptoms.size
                    )

                )

            }

        }

        return results.sortedByDescending { it.confidence }

    }

}