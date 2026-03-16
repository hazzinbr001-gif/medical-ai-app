package com.yourapp.medassist.engine.analytics

object SymptomProgressionAnalyzer {

    data class SymptomProgression(

        val symptom: String,
        val durationHours: Int,
        val worsening: Boolean

    )

    data class ProgressionResult(

        val rapidProgression: Boolean,
        val flaggedSymptoms: List<String>,
        val progressionScore: Int

    )

    fun analyze(symptoms: List<SymptomProgression>): ProgressionResult {

        var score = 0
        val flagged = mutableListOf<String>()

        for (s in symptoms) {

            if (s.worsening) {

                score += 5
                flagged.add(s.symptom)

            }

            if (s.durationHours <= 6 && s.worsening) {

                score += 5

            }

        }

        val rapid = score >= 10

        return ProgressionResult(

            rapidProgression = rapid,
            flaggedSymptoms = flagged,
            progressionScore = score

        )

    }

}