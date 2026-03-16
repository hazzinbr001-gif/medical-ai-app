package com.yourapp.medassist.engine.ai

import com.yourapp.medassist.source.symptoms.SymptomOntology

object FuzzySymptomMatcher {

    fun findClosest(symptomText: String): String? {

        val input = symptomText.lowercase()

        val knownTerms = getKnownTerms()

        var bestMatch: String? = null
        var bestScore = Int.MAX_VALUE

        for (term in knownTerms) {

            val distance = levenshtein(input, term)

            if (distance < bestScore) {
                bestScore = distance
                bestMatch = term
            }

        }

        // Only accept if similarity is reasonable
        if (bestScore <= 3) {
            return SymptomOntology.normalize(bestMatch!!)
        }

        return null
    }

    private fun getKnownTerms(): List<String> {

        return listOf(

            "fever",
            "pyrexia",
            "high temperature",

            "shortness of breath",
            "dyspnea",
            "breathlessness",

            "chest pain",
            "chest tightness",
            "chest pressure",

            "headache",
            "head pain",

            "dizziness",
            "lightheadedness",
            "vertigo",

            "nausea",
            "feeling sick",

            "vomiting",
            "throwing up",

            "fatigue",
            "tiredness",
            "weakness"

        )

    }

    private fun levenshtein(a: String, b: String): Int {

        val dp = Array(a.length + 1) { IntArray(b.length + 1) }

        for (i in 0..a.length) dp[i][0] = i
        for (j in 0..b.length) dp[0][j] = j

        for (i in 1..a.length) {

            for (j in 1..b.length) {

                val cost = if (a[i - 1] == b[j - 1]) 0 else 1

                dp[i][j] = minOf(
                    dp[i - 1][j] + 1,
                    dp[i][j - 1] + 1,
                    dp[i - 1][j - 1] + cost
                )

            }

        }

        return dp[a.length][b.length]
    }

}