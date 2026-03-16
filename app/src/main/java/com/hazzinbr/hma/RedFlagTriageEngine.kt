package com.yourapp.medassist.engine.triage

import com.yourapp.medassist.source.diseases.DiseaseEmergencyRules

object RedFlagTriageEngine {

    data class TriageResult(
        val emergency: Boolean,
        val possibleDisease: String?,
        val matchedSymptoms: List<String>
    )

    fun evaluate(patientSymptoms: List<String>): TriageResult {

        for ((disease, emergencySymptoms) in DiseaseEmergencyRules.emergencySymptoms) {

            val matched = patientSymptoms.filter { emergencySymptoms.contains(it) }

            if (matched.size >= 2) {

                return TriageResult(
                    emergency = true,
                    possibleDisease = disease,
                    matchedSymptoms = matched
                )

            }

        }

        return TriageResult(
            emergency = false,
            possibleDisease = null,
            matchedSymptoms = emptyList()
        )

    }

}