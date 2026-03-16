package com.yourapp.medassist.engine.diagnosis

import com.yourapp.medassist.engine.triage.RedFlagTriageEngine
import com.yourapp.medassist.source.symptoms.SymptomWeights

object ClinicalDecisionEngine {

    data class ClinicalCase(

        val symptoms: List<String>,

        val riskFactors: List<String> = emptyList(),

        val age: Int? = null,

        val sex: String? = null,

        val durationDays: Int? = null,

        val severity: Int? = null   // 1–10
    )

    data class ClinicalDecision(

        val emergency: Boolean,

        val emergencyDisease: String?,

        val rankedDiagnosis: List<DifferentialDiagnosisEngine.DiagnosisResult>,

        val topExplanation: DiagnosisExplainer.Explanation?

    )

    fun evaluate(case: ClinicalCase): ClinicalDecision {

        val triage = RedFlagTriageEngine.evaluate(case.symptoms)

        val patient = DifferentialDiagnosisEngine.PatientCase(

            symptoms = case.symptoms,

            riskFactors = case.riskFactors,

            age = case.age,

            sex = case.sex

        )

        val ranked = DifferentialDiagnosisEngine.evaluate(patient)

        val adjustedRanked = ranked.map {

            var score = it.score

            // severity adjustment
            if (case.severity != null) {

                if (case.severity >= 8) {
                    score += 5
                }

                if (case.severity >= 9) {
                    score += 3
                }

            }

            // duration adjustment
            if (case.durationDays != null) {

                if (case.durationDays > 14) {
                    score += 2
                }

                if (case.durationDays > 30) {
                    score += 3
                }

            }

            DifferentialDiagnosisEngine.DiagnosisResult(
                diseaseId = it.diseaseId,
                score = score
            )

        }.sortedByDescending { it.score }

        val explanation = if (adjustedRanked.isNotEmpty()) {

            DiagnosisExplainer.explain(
                adjustedRanked.first().diseaseId,
                case.symptoms
            )

        } else null

        return ClinicalDecision(

            emergency = triage.emergency,

            emergencyDisease = triage.possibleDisease,

            rankedDiagnosis = adjustedRanked,

            topExplanation = explanation

        )

    }

}