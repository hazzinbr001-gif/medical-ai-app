package com.yourapp.medassist.engine.intelligence

data class DiagnosisCandidate(
    val disease: String,
    val probability: Double
)

object DifferentialDiagnosisRanker {

    fun rank(candidates: List<DiagnosisCandidate>): List<DiagnosisCandidate> {

        return candidates.sortedByDescending { it.probability }

    }

    fun topDiagnosis(candidates: List<DiagnosisCandidate>): DiagnosisCandidate? {

        return rank(candidates).firstOrNull()

    }

}