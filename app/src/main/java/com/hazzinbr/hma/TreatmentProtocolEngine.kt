package com.yourapp.medassist.engine.treatment

import com.yourapp.medassist.source.drugs.Drug
import com.yourapp.medassist.engine.drugs.DrugRecommendationEngine

object TreatmentProtocolEngine {

    fun buildTreatmentPlan(
        disease: String
    ): List<Drug> {

        // Step 1: find recommended drugs
        val recommended = DrugRecommendationEngine.recommendDrugs(disease)

        // Step 2: return treatment protocol
        return recommended

    }

}