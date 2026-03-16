package com.yourapp.medassist.engine.risk

object SepsisRiskCalculator {

    fun calculateRisk(
        fever: Boolean,
        heartRateHigh: Boolean,
        respiratoryDistress: Boolean,
        confusion: Boolean,
        lowBloodPressure: Boolean
    ): Int {

        var score = 0

        if (fever) score++
        if (heartRateHigh) score++
        if (respiratoryDistress) score++
        if (confusion) score++
        if (lowBloodPressure) score++

        return score
    }

    fun interpret(score: Int): String {

        return when {

            score >= 4 -> "High risk of sepsis. Immediate hospital care required."

            score >= 2 -> "Possible sepsis. Urgent medical evaluation needed."

            else -> "Low sepsis probability."

        }

    }

}