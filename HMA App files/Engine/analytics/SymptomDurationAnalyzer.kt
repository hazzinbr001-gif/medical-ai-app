package com.yourapp.medassist.engine.analytics

object SymptomDurationAnalyzer {

    data class SymptomDuration(

        val symptom: String,
        val durationDays: Int

    )

    data class DurationAnalysisResult(

        val acuteSymptoms: List<String>,
        val subacuteSymptoms: List<String>,
        val chronicSymptoms: List<String>

    )

    fun analyze(symptoms: List<SymptomDuration>): DurationAnalysisResult {

        val acute = mutableListOf<String>()
        val subacute = mutableListOf<String>()
        val chronic = mutableListOf<String>()

        for (entry in symptoms) {

            when {

                entry.durationDays <= 7 -> acute.add(entry.symptom)

                entry.durationDays in 8..30 -> subacute.add(entry.symptom)

                entry.durationDays > 30 -> chronic.add(entry.symptom)

            }

        }

        return DurationAnalysisResult(

            acuteSymptoms = acute,
            subacuteSymptoms = subacute,
            chronicSymptoms = chronic

        )

    }

}