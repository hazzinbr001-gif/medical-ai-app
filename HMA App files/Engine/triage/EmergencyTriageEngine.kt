package com.yourapp.medassist.engine.analytics

object EmergencyTriageEngine {

    data class TriageResult(

        val emergency: Boolean,
        val level: TriageLevel,
        val triggeredSymptoms: List<String>

    )

    enum class TriageLevel {

        ROUTINE,
        URGENT,
        EMERGENCY,
        CRITICAL

    }

    private val emergencySymptoms = mapOf(

        "SYM_CHEST_PAIN" to TriageLevel.EMERGENCY,
        "SYM_SHORTNESS_OF_BREATH" to TriageLevel.EMERGENCY,
        "SYM_HEMOPTYSIS" to TriageLevel.EMERGENCY,
        "SYM_CONFUSION" to TriageLevel.URGENT,
        "SYM_SEIZURE" to TriageLevel.CRITICAL,
        "SYM_UNCONSCIOUSNESS" to TriageLevel.CRITICAL,
        "SYM_PARALYSIS" to TriageLevel.CRITICAL,
        "SYM_SPEECH_DIFFICULTY" to TriageLevel.EMERGENCY,
        "SYM_SEVERE_HEADACHE" to TriageLevel.URGENT,
        "SYM_VISION_LOSS" to TriageLevel.URGENT

    )

    fun evaluate(symptoms: List<String>): TriageResult {

        var highestLevel = TriageLevel.ROUTINE
        val triggered = mutableListOf<String>()

        for (symptom in symptoms) {

            val level = emergencySymptoms[symptom]

            if (level != null) {

                triggered.add(symptom)

                if (level.ordinal > highestLevel.ordinal) {
                    highestLevel = level
                }

            }

        }

        val emergency = highestLevel == TriageLevel.EMERGENCY ||
                        highestLevel == TriageLevel.CRITICAL

        return TriageResult(

            emergency = emergency,
            level = highestLevel,
            triggeredSymptoms = triggered

        )

    }

}