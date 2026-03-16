package com.yourapp.medassist.engine.analytics

import com.yourapp.medassist.source.symptoms.SymptomWeights

object SymptomSeverityAnalyzer {

    data class SeverityResult(

        val totalScore: Int,
        val severityLevel: SeverityLevel,
        val highRiskSymptoms: List<String>

    )

    enum class SeverityLevel {

        LOW,
        MODERATE,
        HIGH,
        CRITICAL

    }

    fun analyze(symptoms: List<String>): SeverityResult {

        var score = 0
        val highRisk = mutableListOf<String>()

        for (symptom in symptoms) {

            val weight = SymptomWeights.weights[symptom] ?: 0

            score += weight

            if (weight >= 8) {
                highRisk.add(symptom)
            }

        }

        val level = when {

            score >= 40 -> SeverityLevel.CRITICAL
            score >= 25 -> SeverityLevel.HIGH
            score >= 15 -> SeverityLevel.MODERATE
            else -> SeverityLevel.LOW

        }

        return SeverityResult(

            totalScore = score,
            severityLevel = level,
            highRiskSymptoms = highRisk

        )

    }

}