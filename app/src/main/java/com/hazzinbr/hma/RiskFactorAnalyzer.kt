package com.yourapp.medassist.engine.analytics

object RiskFactorAnalyzer {

    data class RiskProfile(

        val riskFactors: List<String>,
        val riskScore: Int,
        val riskLevel: RiskLevel

    )

    enum class RiskLevel {

        LOW,
        MODERATE,
        HIGH,
        VERY_HIGH

    }

    private val riskWeights = mapOf(

        "RF_SMOKING" to 5,
        "RF_ALCOHOL" to 3,
        "RF_DIABETES" to 6,
        "RF_HYPERTENSION" to 6,
        "RF_OBESITY" to 5,
        "RF_SEDENTARY_LIFESTYLE" to 4,
        "RF_FAMILY_HISTORY" to 4,
        "RF_IMMUNOCOMPROMISED" to 7,
        "RF_RECENT_SURGERY" to 5,
        "RF_PREGNANCY" to 4,
        "RF_AGE_ELDERLY" to 6

    )

    fun analyze(riskFactors: List<String>): RiskProfile {

        var score = 0

        for (rf in riskFactors) {

            val weight = riskWeights[rf] ?: 0
            score += weight

        }

        val level = when {

            score >= 20 -> RiskLevel.VERY_HIGH
            score >= 12 -> RiskLevel.HIGH
            score >= 6 -> RiskLevel.MODERATE
            else -> RiskLevel.LOW

        }

        return RiskProfile(

            riskFactors = riskFactors,
            riskScore = score,
            riskLevel = level

        )

    }

}