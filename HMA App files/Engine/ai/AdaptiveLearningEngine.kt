package com.yourapp.medassist.engine.ai

object AdaptiveLearningEngine {

    private val learnedPatterns = mutableMapOf<String, Int>()

    fun recordCase(symptoms: List<String>, diagnosis: String) {

        val key = symptoms.sorted().joinToString("-") + "->$diagnosis"

        learnedPatterns[key] = learnedPatterns.getOrDefault(key, 0) + 1
    }

    fun getLearnedPatterns(): Map<String, Int> {

        return learnedPatterns
    }

}