package com.yourapp.medassist.engine.treatment

object TreatmentRecommendationEngine {

    data class TreatmentPlan(

        val disease: String,
        val medications: List<String>,
        val lifestyleAdvice: List<String>,
        val urgency: String

    )

    private val treatmentDatabase = mapOf(

        "Pneumonia" to TreatmentPlan(
            disease = "Pneumonia",
            medications = listOf(
                "Antibiotics (if bacterial)",
                "Fever reducers",
                "Cough medication"
            ),
            lifestyleAdvice = listOf(
                "Rest",
                "Drink plenty of fluids",
                "Avoid smoking"
            ),
            urgency = "MEDIUM"
        ),

        "Bronchitis" to TreatmentPlan(
            disease = "Bronchitis",
            medications = listOf(
                "Cough suppressants",
                "Pain relievers",
                "Bronchodilators if needed"
            ),
            lifestyleAdvice = listOf(
                "Hydration",
                "Avoid cold air",
                "Rest"
            ),
            urgency = "LOW"
        ),

        "Myocardial Infarction" to TreatmentPlan(
            disease = "Myocardial Infarction",
            medications = listOf(
                "Aspirin",
                "Nitroglycerin",
                "Anticoagulants"
            ),
            lifestyleAdvice = listOf(
                "Immediate emergency care",
                "Cardiology follow‑up"
            ),
            urgency = "CRITICAL"
        ),

        "Migraine" to TreatmentPlan(
            disease = "Migraine",
            medications = listOf(
                "Triptans",
                "Pain relievers",
                "Anti‑nausea medication"
            ),
            lifestyleAdvice = listOf(
                "Rest in dark quiet room",
                "Avoid trigger foods",
                "Maintain hydration"
            ),
            urgency = "LOW"
        ),

        "Gastroenteritis" to TreatmentPlan(
            disease = "Gastroenteritis",
            medications = listOf(
                "Oral rehydration solution",
                "Anti‑nausea medication"
            ),
            lifestyleAdvice = listOf(
                "Drink electrolyte fluids",
                "Eat bland foods",
                "Avoid dairy temporarily"
            ),
            urgency = "LOW"
        )

    )

    fun recommend(disease: String): TreatmentPlan? {

        return treatmentDatabase[disease]

    }

}