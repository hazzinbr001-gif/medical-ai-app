package com.yourapp.medassist.source.symptoms

object SymptomOntology {

    private val synonymMap = mapOf(

        // Fever
        "fever" to "SYM_FEVER",
        "pyrexia" to "SYM_FEVER",
        "high temperature" to "SYM_FEVER",

        // Shortness of breath
        "shortness of breath" to "SYM_SHORTNESS_OF_BREATH",
        "dyspnea" to "SYM_SHORTNESS_OF_BREATH",
        "breathlessness" to "SYM_SHORTNESS_OF_BREATH",

        // Chest pain
        "chest pain" to "SYM_CHEST_PAIN",
        "chest tightness" to "SYM_CHEST_PAIN",
        "chest pressure" to "SYM_CHEST_PAIN",

        // Headache
        "headache" to "SYM_HEADACHE",
        "head pain" to "SYM_HEADACHE",

        // Dizziness
        "dizziness" to "SYM_DIZZINESS",
        "lightheadedness" to "SYM_DIZZINESS",
        "vertigo" to "SYM_DIZZINESS",

        // Nausea
        "nausea" to "SYM_NAUSEA",
        "feeling sick" to "SYM_NAUSEA",

        // Vomiting
        "vomiting" to "SYM_VOMITING",
        "throwing up" to "SYM_VOMITING",

        // Fatigue
        "fatigue" to "SYM_FATIGUE",
        "tiredness" to "SYM_FATIGUE",
        "weakness" to "SYM_FATIGUE"

    )

    private val dynamicSynonyms = mutableMapOf<String, String>()

    fun normalize(symptomText: String): String? {

        val key = symptomText.lowercase()

        return dynamicSynonyms[key]
            ?: synonymMap[key]

    }

    fun normalizeList(symptoms: List<String>): List<String> {

        val normalized = mutableListOf<String>()

        for (symptom in symptoms) {

            val mapped = normalize(symptom)

            if (mapped != null) {
                normalized.add(mapped)
            }

        }

        return normalized
    }

    fun addSynonym(
        term: String,
        symptomId: String
    ) {

        dynamicSynonyms[term.lowercase()] = symptomId

    }

}