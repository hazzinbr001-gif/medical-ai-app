package com.yourapp.medassist.engine.recommendation

object InvestigationRecommendationEngine {

    data class InvestigationPlan(

        val diseaseId: String,
        val bedsideTests: List<String>,
        val laboratoryTests: List<String>,
        val imagingTests: List<String>,
        val confirmatoryTests: List<String>

    )

    private val investigationMap = mapOf(

        "DIS_MYOCARDIAL_INFARCTION" to InvestigationPlan(
            diseaseId = "DIS_MYOCARDIAL_INFARCTION",
            bedsideTests = listOf("ECG", "Blood pressure monitoring"),
            laboratoryTests = listOf("Troponin", "CK-MB"),
            imagingTests = listOf("Echocardiogram"),
            confirmatoryTests = listOf("Coronary angiography")
        ),

        "DIS_PNEUMONIA" to InvestigationPlan(
            diseaseId = "DIS_PNEUMONIA",
            bedsideTests = listOf("Pulse oximetry"),
            laboratoryTests = listOf("CBC", "CRP"),
            imagingTests = listOf("Chest X-ray"),
            confirmatoryTests = listOf("Sputum culture")
        ),

        "DIS_STROKE" to InvestigationPlan(
            diseaseId = "DIS_STROKE",
            bedsideTests = listOf("Neurological examination"),
            laboratoryTests = listOf("Blood glucose", "Coagulation profile"),
            imagingTests = listOf("CT Brain", "MRI Brain"),
            confirmatoryTests = listOf("CT Angiography")
        ),

        "DIS_DIABETES_TYPE_2" to InvestigationPlan(
            diseaseId = "DIS_DIABETES_TYPE_2",
            bedsideTests = listOf("Random blood glucose"),
            laboratoryTests = listOf("Fasting glucose", "HbA1c"),
            imagingTests = emptyList(),
            confirmatoryTests = listOf("Oral glucose tolerance test")
        ),

        "DIS_GASTRITIS" to InvestigationPlan(
            diseaseId = "DIS_GASTRITIS",
            bedsideTests = listOf("Abdominal exam"),
            laboratoryTests = listOf("H. pylori test"),
            imagingTests = listOf("Upper GI endoscopy"),
            confirmatoryTests = listOf("Biopsy if needed")
        )

    )

    fun recommend(diseaseId: String): InvestigationPlan? {

        return investigationMap[diseaseId]

    }

}