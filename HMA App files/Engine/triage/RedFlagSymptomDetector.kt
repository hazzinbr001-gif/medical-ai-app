package com.yourapp.medassist.engine.triage

object RedFlagSymptomDetector {

    private val redFlagSymptoms = listOf(

        "chest pain",
        "severe shortness of breath",
        "loss of consciousness",
        "seizure",
        "uncontrolled bleeding",
        "severe head injury",
        "confusion",
        "bluish lips",
        "stroke symptoms",
        "paralysis"

    )

    fun detect(symptoms: List<String>): List<String> {

        return symptoms.filter { symptom ->

            redFlagSymptoms.any {

                it.equals(symptom, ignoreCase = true)

            }

        }

    }

}