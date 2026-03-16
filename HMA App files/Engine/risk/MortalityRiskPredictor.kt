package com.yourapp.medassist.engine.risk

object MortalityRiskPredictor {

    fun predictRisk(
        age: Int,
        chronicDiseases: Int,
        severeSymptoms: Boolean
    ): String {

        val score = age / 20 + chronicDiseases * 2 + if (severeSymptoms) 3 else 0

        return when {

            score >= 10 -> "High mortality risk. Immediate medical care required."

            score >= 6 -> "Moderate mortality risk."

            else -> "Low mortality risk."

        }

    }

}