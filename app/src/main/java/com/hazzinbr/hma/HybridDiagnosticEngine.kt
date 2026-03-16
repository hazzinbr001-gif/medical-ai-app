package com.yourapp.medassist.engine.ai

import com.yourapp.medassist.engine.diagnostic.DifferentialDiagnosisRanker
import com.yourapp.medassist.engine.learning.CaseLearningEngine

object HybridDiagnosticEngine {

    data class HybridResult(

        val diseaseId: String,
        val finalScore: Double,
        val weightedScore: Int,
        val bayesianProbability: Double,
        val caseSupport: Int

    )

    fun combine(

        weightedResults: List<DifferentialDiagnosisRanker.RankedDisease>,
        bayesianResults: List<BayesianDiagnosticEngine.BayesianResult>,
        symptoms: List<String>

    ): List<HybridResult> {

        val caseMatches = CaseLearningEngine.similarCases(symptoms)

        val caseFrequency = caseMatches
            .groupingBy { it.diagnosedDisease }
            .eachCount()

        val results = mutableListOf<HybridResult>()

        for (weighted in weightedResults) {

            val bayesian = bayesianResults.find {
                it.diseaseId == weighted.diseaseId
            }

            val bayesProb = bayesian?.probability ?: 0.0

            val caseSupport = caseFrequency[weighted.diseaseId] ?: 0

            val finalScore =
                (weighted.score * 0.5) +
                (bayesProb * 0.4) +
                (caseSupport * 2.0)

            results.add(

                HybridResult(

                    diseaseId = weighted.diseaseId,
                    finalScore = finalScore,
                    weightedScore = weighted.score,
                    bayesianProbability = bayesProb,
                    caseSupport = caseSupport

                )

            )

        }

        return results.sortedByDescending { it.finalScore }

    }

}