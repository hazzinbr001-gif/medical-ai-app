package com.yourapp.medassist.engine.risk

object CardiacRiskScore {

    fun calculateRisk(
        chestPain: Boolean,
        shortnessOfBreath: Boolean,
        sweating: Boolean,
        nausea: Boolean,
        historyHeartDisease: Boolean
    ): Int {

        var score = 0

        if (chestPain) score += 3
        if (shortnessOfBreath) score += 2
        if (sweating) score += 1
        if (nausea) score += 1
        if (historyHeartDisease) score += 3

        return score
    }

    fun interpret(score: Int): String {

        return when {

            score >= 6 -> "High cardiac event risk. Emergency evaluation recommended."

            score >= 3 -> "Moderate cardiac risk. Medical assessment required."

            else -> "Low cardiac risk."

        }

    }

}