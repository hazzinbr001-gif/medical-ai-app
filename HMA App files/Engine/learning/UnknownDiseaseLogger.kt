package com.yourapp.medassist.engine.learning

object UnknownDiseaseLogger {

    private val unknownDiseases = mutableSetOf<String>()

    fun log(disease: String) {

        val normalized = disease.lowercase().trim()

        if (normalized.isNotEmpty()) {

            unknownDiseases.add(normalized)

        }

    }

    fun getAll(): List<String> {

        return unknownDiseases.toList()

    }

    fun clear() {

        unknownDiseases.clear()

    }

}