package com.yourapp.medassist.engine.epidemiology

object OutbreakPredictionEngine {

    fun detectOutbreak(
        casesReported: Int,
        historicalAverage: Int
    ): Boolean {

        if (historicalAverage == 0) return false

        val ratio = casesReported.toDouble() / historicalAverage

        return ratio >= 2.0
    }

    fun outbreakLevel(
        casesReported: Int,
        historicalAverage: Int
    ): String {

        val ratio = casesReported.toDouble() / historicalAverage

        return when {

            ratio >= 5 -> "Severe outbreak"

            ratio >= 3 -> "Major outbreak"

            ratio >= 2 -> "Possible outbreak"

            else -> "Normal levels"

        }

    }

}