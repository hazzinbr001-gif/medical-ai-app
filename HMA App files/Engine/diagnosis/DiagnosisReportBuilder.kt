package com.yourapp.medassist.engine.diagnosis

import com.yourapp.medassist.engine.triage.RedFlagTriageEngine
import com.yourapp.medassist.source.diseases.DiseaseInvestigations
import com.yourapp.medassist.source.diseases.DiseaseTreatment

object DiagnosisReportBuilder {

    data class DiagnosisReport(
        val emergency: Boolean,
        val emergencyDisease: String?,
        val rankedDiseases: List<DifferentialDiagnosisEngine.DiagnosisResult>,
        val explanations: List<DiagnosisExplainer.Explanation>,
        val investigations: Map<String, List<String>>,
        val treatments: Map<String, List<String>>
    )

    fun build(case: DifferentialDiagnosisEngine.PatientCase): DiagnosisReport {

        val triage = RedFlagTriageEngine.evaluate(case.symptoms)

        val ranked = DifferentialDiagnosisEngine.evaluate(case)

        val explanations = ranked.take(3).map {
            DiagnosisExplainer.explain(it.diseaseId, case.symptoms)
        }

        val investigations = mutableMapOf<String, List<String>>()
        val treatments = mutableMapOf<String, List<String>>()

        for (result in ranked.take(3)) {

            val inv = DiseaseInvestigations.map[result.diseaseId]
            val treat = DiseaseTreatment.map[result.diseaseId]

            if (inv != null) {
                investigations[result.diseaseId] =
                    inv.bedsideTests + inv.laboratoryTests + inv.imaging + inv.confirmatoryTests
            }

            if (treat != null) {
                treatments[result.diseaseId] =
                    treat.firstLine + treat.secondLine
            }

        }

        return DiagnosisReport(
            emergency = triage.emergency,
            emergencyDisease = triage.possibleDisease,
            rankedDiseases = ranked,
            explanations = explanations,
            investigations = investigations,
            treatments = treatments
        )

    }

}