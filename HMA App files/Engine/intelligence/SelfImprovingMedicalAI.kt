package com.yourapp.medassist.engine.intelligence

object SelfImprovingMedicalAI {

    private val learningLog = mutableListOf<String>()

    fun recordCase(
        symptoms: List<String>,
        diagnosis: String
    ) {

        val case = "Symptoms: ${symptoms.joinToString()} → Diagnosis: $diagnosis"

        learningLog.add(case)

    }

    fun getLearningHistory(): List<String> {

        return learningLog

    }

}