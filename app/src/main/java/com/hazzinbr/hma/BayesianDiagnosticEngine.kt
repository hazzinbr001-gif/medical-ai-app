package com.yourapp.medassist.engine.ai

import com.yourapp.medassist.source.diseases.Disease

object BayesianDiagnosticEngine {

    data class BayesianResult(

        val diseaseId: String,
        val probability: Double

    )

    data class SymptomLikelihood(

        val symptomId: String,
        val likelihood: Double

    )

    fun compute(

        symptoms: List<String>,
        diseases: List<Disease>,
        diseaseSymptomLikelihoods: Map<String, List<SymptomLikelihood>>

    ): List<BayesianResult> {

        val results = mutableListOf<BayesianResult>()

        for (disease in diseases) {

            // Prior probability based on disease commonality
            var probability = disease.commonality / 10.0

            val likelihoods = diseaseSymptomLikelihoods[disease.id] ?: emptyList()

            for (symptom in symptoms) {

                val match = likelihoods.find { it.symptomId == symptom }

                if (match != null) {

                    probability *= match.likelihood

                } else {

                    // small penalty for missing expected symptom
                    probability *= 0.5

                }

            }

            results.add(
                BayesianResult(
                    diseaseId = disease.id,
                    probability = probability
                )
            )

        }

        return normalize(results)
    }

    private fun normalize(results: List<BayesianResult>): List<BayesianResult> {

        val total = results.sumOf { it.probability }

        if (total == 0.0) return results

        return results
            .map {

                BayesianResult(
                    diseaseId = it.diseaseId,
                    probability = (it.probability / total) * 100
                )

            }
            .sortedByDescending { it.probability }

    }

}