package com.yourapp.medassist.engine.core

object ConfidenceScoringEngine {

    fun calculateConfidence(

        matchedSymptoms: Int,
        totalSymptoms: Int

    ): Double {

        if (totalSymptoms == 0) return 0.0

        val score = matchedSymptoms.toDouble() / totalSymptoms.toDouble()

        return score * 100

    }

}