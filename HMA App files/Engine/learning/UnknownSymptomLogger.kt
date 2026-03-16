package com.yourapp.medassist.engine.learning

object UnknownSymptomLogger {

    private val unknownSymptoms = mutableSetOf<String>()

    fun log(symptom: String) {

        val normalized = symptom.lowercase().trim()

        if (normalized.isNotEmpty()) {

            unknownSymptoms.add(normalized)

        }

    }

    fun getAll(): List<String> {

        return unknownSymptoms.toList()

    }

    fun clear() {

        unknownSymptoms.clear()

    }

}