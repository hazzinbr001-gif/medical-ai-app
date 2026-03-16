package com.yourapp.medassist.engine.nlp

object SymptomContextExtractor {

    data class SymptomContext(

        val symptomId: String,
        val severity: String?,
        val duration: String?

    )

    private val severityKeywords = mapOf(

        "mild" to "MILD",
        "moderate" to "MODERATE",
        "severe" to "SEVERE",
        "intense" to "SEVERE",
        "slight" to "MILD"

    )

    fun extractContext(

        sentence: String,
        detectedSymptoms: List<String>

    ): List<SymptomContext> {

        val text = sentence.lowercase()

        val contexts = mutableListOf<SymptomContext>()

        for (symptom in detectedSymptoms) {

            var severity: String? = null
            var duration: String? = null

            // detect severity
            for ((key, value) in severityKeywords) {

                if (text.contains(key)) {

                    severity = value
                    break

                }

            }

            // detect duration patterns
            when {

                text.contains("today") -> duration = "TODAY"
                text.contains("yesterday") -> duration = "1_DAY"
                text.contains("for 2 days") -> duration = "2_DAYS"
                text.contains("for 3 days") -> duration = "3_DAYS"
                text.contains("for a week") -> duration = "1_WEEK"

            }

            contexts.add(

                SymptomContext(

                    symptomId = symptom,
                    severity = severity,
                    duration = duration

                )

            )

        }

        return contexts

    }

}