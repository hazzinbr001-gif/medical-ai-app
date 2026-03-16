package com.yourapp.medassist.engine.triage

object SymptomTriageLevel {

    enum class TriageLevel {

        EMERGENCY,      // Immediate care required
        URGENT,         // See doctor within hours
        SEMI_URGENT,    // See doctor within 24–48 hours
        ROUTINE,        // Normal appointment
        SELF_CARE       // Home care likely sufficient

    }

    data class TriageAssessment(

        val level: TriageLevel,
        val reason: String,
        val matchedSymptoms: List<String>

    )

    fun assess(symptoms: List<String>): TriageAssessment {

        // Emergency indicators
        val emergencySymptoms = listOf(
            "SYM_CHEST_PAIN",
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_CONFUSION",
            "SYM_SPEECH_DIFFICULTY",
            "SYM_VISION_LOSS",
            "SYM_SEIZURE"
        )

        val urgentSymptoms = listOf(
            "SYM_HIGH_FEVER",
            "SYM_SEVERE_ABDOMINAL_PAIN",
            "SYM_HEMATEMESIS",
            "SYM_HEMATURIA",
            "SYM_HEMOPTYSIS"
        )

        val semiUrgentSymptoms = listOf(
            "SYM_PERSISTENT_COUGH",
            "SYM_MODERATE_FEVER",
            "SYM_BACK_PAIN",
            "SYM_DIZZINESS"
        )

        val matchedEmergency = symptoms.filter { emergencySymptoms.contains(it) }

        if (matchedEmergency.isNotEmpty()) {

            return TriageAssessment(
                level = TriageLevel.EMERGENCY,
                reason = "Potential life‑threatening symptoms detected",
                matchedSymptoms = matchedEmergency
            )

        }

        val matchedUrgent = symptoms.filter { urgentSymptoms.contains(it) }

        if (matchedUrgent.isNotEmpty()) {

            return TriageAssessment(
                level = TriageLevel.URGENT,
                reason = "Symptoms require prompt medical evaluation",
                matchedSymptoms = matchedUrgent
            )

        }

        val matchedSemi = symptoms.filter { semiUrgentSymptoms.contains(it) }

        if (matchedSemi.isNotEmpty()) {

            return TriageAssessment(
                level = TriageLevel.SEMI_URGENT,
                reason = "Symptoms should be checked by a doctor soon",
                matchedSymptoms = matchedSemi
            )

        }

        return TriageAssessment(
            level = TriageLevel.ROUTINE,
            reason = "Symptoms appear non‑urgent",
            matchedSymptoms = emptyList()
        )

    }

}