package com.yourapp.medassist.engine.risk

object NEWS2ScoreEngine {

    fun calculateScore(
        respiratoryRate: Int,
        oxygenSaturation: Int,
        temperature: Double,
        systolicBP: Int,
        heartRate: Int,
        consciousness: String
    ): Int {

        var score = 0

        if (respiratoryRate <= 8 || respiratoryRate >= 25) score += 3
        else if (respiratoryRate in 21..24) score += 2
        else if (respiratoryRate in 9..11) score += 1

        if (oxygenSaturation <= 91) score += 3
        else if (oxygenSaturation <= 93) score += 2
        else if (oxygenSaturation <= 95) score += 1

        if (temperature <= 35.0) score += 3
        else if (temperature >= 39.1) score += 2
        else if (temperature in 38.1..39.0) score += 1

        if (systolicBP <= 90 || systolicBP >= 220) score += 3
        else if (systolicBP in 91..100) score += 2
        else if (systolicBP in 101..110) score += 1

        if (heartRate <= 40 || heartRate >= 131) score += 3
        else if (heartRate in 111..130) score += 2
        else if (heartRate in 91..110) score += 1
        else if (heartRate in 41..50) score += 1

        if (consciousness.lowercase() != "alert") score += 3

        return score
    }

    fun interpretScore(score: Int): String {

        return when {

            score >= 7 -> "High clinical risk. Emergency response required."

            score >= 5 -> "Urgent medical review required."

            score >= 1 -> "Monitor patient closely."

            else -> "Patient stable."

        }

    }

}