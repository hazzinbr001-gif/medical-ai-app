package com.yourapp.medassist.engine.analytics

object SymptomTimelineAnalyzer {

    data class SymptomEvent(

        val symptomId: String,
        val day: Int

    )

    data class TimelineAnalysis(

        val orderedSymptoms: List<SymptomEvent>,
        val progressionType: String

    )

    fun analyze(events: List<SymptomEvent>): TimelineAnalysis {

        val ordered = events.sortedBy { it.day }

        val progression = detectProgression(ordered)

        return TimelineAnalysis(

            orderedSymptoms = ordered,
            progressionType = progression

        )

    }

    private fun detectProgression(events: List<SymptomEvent>): String {

        val symptoms = events.map { it.symptomId }

        if (
            symptoms.contains("SYM_FEVER") &&
            symptoms.contains("SYM_COUGH") &&
            symptoms.contains("SYM_SHORTNESS_OF_BREATH")
        ) {
            return "RESPIRATORY_INFECTION_PATTERN"
        }

        if (
            symptoms.contains("SYM_CHEST_PAIN") &&
            symptoms.contains("SYM_SHORTNESS_OF_BREATH") &&
            symptoms.contains("SYM_SWEATING")
        ) {
            return "CARDIAC_EVENT_PATTERN"
        }

        if (
            symptoms.contains("SYM_HEADACHE") &&
            symptoms.contains("SYM_PHOTOPHOBIA")
        ) {
            return "MENINGEAL_PATTERN"
        }

        return "NON_SPECIFIC_PATTERN"

    }

}