package com.yourapp.medassist.source.diseases

data class DiseaseExamFindings(

    val diseaseId: String,

    val inspectionFindings: List<String> = emptyList(),

    val palpationFindings: List<String> = emptyList(),

    val percussionFindings: List<String> = emptyList(),

    val auscultationFindings: List<String> = emptyList(),

    val generalFindings: List<String> = emptyList()

)

val hypertensionExam = DiseaseExamFindings(

    diseaseId = DiseaseIndex.HYPERTENSION,

    inspectionFindings = listOf(),

    palpationFindings = listOf(),

    percussionFindings = listOf(),

    auscultationFindings = listOf(),

    generalFindings = listOf(
        "Elevated blood pressure",
        "Possible retinal changes",
        "Possible left ventricular hypertrophy"
    )

)