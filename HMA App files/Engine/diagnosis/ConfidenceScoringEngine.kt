package com.yourapp.medassist.engine.diagnosis

object ConfidenceScoringEngine {

    data class ConfidenceResult(

        val diseaseId: String,
        val rawScore: Int,
        val confidencePercent: Int

    )

    fun calculate(
        ranked: List<DifferentialDiagnosisEngine.DiagnosisResult>
    ): List<ConfidenceResult> {

        if (ranked.isEmpty()) return emptyList()

        val maxScore = ranked.maxOf { it.score }.toDouble()

        return ranked.map {

            val confidence =
                ((it.score / maxScore) * 100).toInt().coerceIn(1, 100)

            ConfidenceResult(
                diseaseId = it.diseaseId,
                rawScore = it.score,
                confidencePercent = confidence
            )

        }.sortedByDescending { it.confidencePercent }

    }

}