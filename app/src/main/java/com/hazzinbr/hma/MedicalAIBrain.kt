package com.yourapp.medassist.engine.core

import com.yourapp.medassist.engine.intelligence.DifferentialDiagnosisRanker
import com.yourapp.medassist.engine.intelligence.DiagnosisCandidate

object MedicalAIBrain {

    fun runDiagnosis(
        symptoms: List<String>
    ): String {

        // Example candidates (later these come from reasoning engine)
        val candidates = listOf(
            DiagnosisCandidate("Influenza", 0.62),
            DiagnosisCandidate("COVID-19", 0.21),
            DiagnosisCandidate("Malaria", 0.12)
        )

        val ranked = DifferentialDiagnosisRanker.rank(candidates)

        return ranked.firstOrNull()?.disease ?: "Unknown condition"

    }

}