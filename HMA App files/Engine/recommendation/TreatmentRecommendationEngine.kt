package com.yourapp.medassist.engine.recommendation

import com.yourapp.medassist.engine.diagnosis.DifferentialDiagnosisEngine
import com.yourapp.medassist.source.diseases.DiseaseTreatment

object TreatmentRecommendationEngine {

    data class TreatmentPlan(

        val diseaseId: String,

        val firstLine: List<String>,

        val secondLine: List<String>,

        val supportiveCare: List<String>

    )

    fun recommend(
        rankedDiseases: List<DifferentialDiagnosisEngine.DiagnosisResult>
    ): List<TreatmentPlan> {

        val plans = mutableListOf<TreatmentPlan>()

        for (result in rankedDiseases.take(3)) {

            val treatment = DiseaseTreatment.map[result.diseaseId]

            if (treatment != null) {

                plans.add(

                    TreatmentPlan(

                        diseaseId = result.diseaseId,

                        firstLine = treatment.firstLine,

                        secondLine = treatment.secondLine,

                        supportiveCare = treatment.supportiveCare

                    )

                )

            }

        }

        return plans

    }

}