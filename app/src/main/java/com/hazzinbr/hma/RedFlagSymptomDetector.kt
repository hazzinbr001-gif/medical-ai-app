package com.yourapp.medassist.engine.analytics

object RedFlagSymptomDetector {

    data class RedFlagResult(

        val redFlagsDetected: List<String>,
        val emergencyLevel: EmergencyLevel

    )

    enum class EmergencyLevel {

        NONE,
        CAUTION,
        URGENT,
        EMERGENCY

    }

    private val redFlagSymptoms = mapOf(

        "SYM_CHEST_PAIN" to EmergencyLevel.EMERGENCY,
        "SYM_SHORTNESS_OF_BREATH" to EmergencyLevel.URGENT,
        "SYM_HEMOPTYSIS" to EmergencyLevel.EMERGENCY,
        "SYM_CONFUSION" to EmergencyLevel.URGENT,
        "SYM_SPEECH_DIFFICULTY" to EmergencyLevel.EMERGENCY,
        "SYM_WEAKNESS" to EmergencyLevel.URGENT,
        "SYM_NUMBNESS" to EmergencyLevel.URGENT,
        "SYM_VISION_LOSS" to EmergencyLevel.EMERGENCY,
        "SYM_SEIZURE" to EmergencyLevel.EMERGENCY,
        "SYM_HIGH_FEVER" to EmergencyLevel.URGENT,
        "SYM_RIGORS" to EmergencyLevel.URGENT,
        "SYM_HEMATEMESIS" to EmergencyLevel.EMERGENCY,
        "SYM_HEMATURIA" to EmergencyLevel.CAUTION,
        "SYM_MELENA" to EmergencyLevel.EMERGENCY

    )

    fun detect(symptoms: List<String>): RedFlagResult {

        val detected = mutableListOf<String>()
        var level = EmergencyLevel.NONE

        for (symptom in symptoms) {

            val severity = redFlagSymptoms[symptom]

            if (severity != null) {

                detected.add(symptom)

                if (severity.ordinal > level.ordinal) {

                    level = severity

                }

            }

        }

        return RedFlagResult(

            redFlagsDetected = detected,
            emergencyLevel = level

        )

    }

}