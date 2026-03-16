package com.yourapp.medassist.engine.core

import com.yourapp.medassist.engine.ai.BayesianDiagnosticEngine
import com.yourapp.medassist.engine.treatment.TreatmentProtocolEngine
import com.yourapp.medassist.engine.drugs.DrugRecommendationEngine

object ClinicalDecisionOrchestrator {

    fun processCase(

        symptoms: List<String>

    ): String {

        // Step 1: Diagnose
        val diagnosis = BayesianDiagnosticEngine.diagnose(symptoms)

        // Step 2: Recommend drugs
        val drugs = DrugRecommendationEngine.recommendDrugs(diagnosis)

        // Step 3: Build treatment plan
        val treatment = TreatmentProtocolEngine.buildTreatmentPlan(diagnosis)

        return """
            Diagnosis: $diagnosis
            
            Recommended Drugs:
            ${drugs.map { it.name }}
            
            Treatment Plan:
            ${treatment.map { it.name }}
        """.trimIndent()

    }

}