package com.yourapp.medassist.engine.system

object MedicalAuditLogger {

    private val logs = mutableListOf<String>()

    fun logCase(
        symptoms: List<String>,
        diagnosis: String
    ) {

        val entry =
            "Symptoms: ${symptoms.joinToString()} | Diagnosis: $diagnosis"

        logs.add(entry)

    }

    fun getLogs(): List<String> {

        return logs

    }

}