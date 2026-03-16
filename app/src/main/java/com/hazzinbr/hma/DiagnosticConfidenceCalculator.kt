package com.yourapp.medassist.engine.diagnostic

object DiagnosticConfidenceCalculator {

    data class DiseaseConfidence(

        val diseaseId: String,
        val probability: Int

    )

    fun calculate(

        rankedDiseases: List<DifferentialDiagnosisRanker.RankedDisease>

    ): List<DiseaseConfidence> {

        if (rankedDiseases.isEmpty()) return emptyList()

        val maxScore = rankedDiseases.maxOf { it.score }

        val results = mutableListOf<DiseaseConfidence>()

        for (disease in rankedDiseases) {

            val probability = ((disease.score.toDouble() / maxScore) * 100).toInt()

            results.add(

                DiseaseConfidence(
                    diseaseId = disease.diseaseId,
                    probability = probability
                )

            )

        }

        return results

    }

}