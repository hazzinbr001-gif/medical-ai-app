package com.yourapp.medassist.engine.report

import com.yourapp.medassist.engine.diagnostic.DiagnosticConfidenceCalculator
import com.yourapp.medassist.engine.analytics.RedFlagSymptomDetector
import com.yourapp.medassist.engine.recommendation.InvestigationRecommendationEngine
import com.yourapp.medassist.engine.recommendation.LifestyleRecommendationEngine

object ClinicalReportGenerator {

    data class ClinicalReport(

        val topDiagnosis: String,
        val probability: Int,
        val possibleConditions: List<String>,
        val redFlags: List<String>,
        val investigations: List<String>,
        val lifestyleAdvice: List<String>

    )

    fun generate(

        confidence: List<DiagnosticConfidenceCalculator.DiseaseConfidence>,
        redFlags: RedFlagSymptomDetector.RedFlagResult

    ): ClinicalReport {

        if (confidence.isEmpty()) {

            return ClinicalReport(
                topDiagnosis = "Unknown",
                probability = 0,
                possibleConditions = emptyList(),
                redFlags = redFlags.redFlagsDetected,
                investigations = emptyList(),
                lifestyleAdvice = emptyList()
            )

        }

        val top = confidence.first()

        val investigation =
            InvestigationRecommendationEngine.recommend(top.diseaseId)

        val lifestyle =
            LifestyleRecommendationEngine.recommend(top.diseaseId)

        return ClinicalReport(

            topDiagnosis = top.diseaseId,

            probability = top.probability,

            possibleConditions =
                confidence.drop(1).take(3).map { it.diseaseId },

            redFlags = redFlags.redFlagsDetected,

            investigations =
                investigation?.laboratoryTests.orEmpty() +
                investigation?.imagingTests.orEmpty(),

            lifestyleAdvice =
                lifestyle?.diet.orEmpty() +
                lifestyle?.activity.orEmpty() +
                lifestyle?.habits.orEmpty()

        )

    }

}