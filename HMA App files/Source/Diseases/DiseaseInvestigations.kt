package com.yourapp.medassist.source.diseases

data class DiseaseInvestigations(

    val diseaseId: String,

    val bedsideTests: List<String> = emptyList(),

    val laboratoryTests: List<String> = emptyList(),

    val imaging: List<String> = emptyList(),

    val confirmatoryTests: List<String> = emptyList()

)package com.yourapp.medassist.source.diseases

val hypertensionInvestigations = DiseaseInvestigations(

    diseaseId = DiseaseIndex.HYPERTENSION,

    bedsideTests = listOf(
        "Blood pressure measurement"
    ),

    laboratoryTests = listOf(
        "Serum creatinine",
        "Serum electrolytes",
        "Fasting blood glucose",
        "Lipid profile"
    ),

    imaging = listOf(
        "ECG",
        "Echocardiogram"
    ),

    confirmatoryTests = listOf(
        "Ambulatory blood pressure monitoring"
    )

)


val myocardialInfarctionInvestigations = DiseaseInvestigations(

    diseaseId = DiseaseIndex.MYOCARDIAL_INFARCTION,

    bedsideTests = listOf(
        "ECG"
    ),

    laboratoryTests = listOf(
        "Troponin",
        "CK-MB"
    ),

    imaging = listOf(
        "Chest X-ray",
        "Echocardiogram"
    ),

    confirmatoryTests = listOf(
        "Coronary angiography"
    )

)


val asthmaInvestigations = DiseaseInvestigations(

    diseaseId = DiseaseIndex.ASTHMA,

    bedsideTests = listOf(
        "Peak flow measurement"
    ),

    laboratoryTests = listOf(
        "Blood eosinophil count"
    ),

    imaging = listOf(
        "Chest X-ray"
    ),

    confirmatoryTests = listOf(
        "Spirometry"
    )

)


val pneumoniaInvestigations = DiseaseInvestigations(

    diseaseId = DiseaseIndex.PNEUMONIA,

    bedsideTests = listOf(
        "Pulse oximetry"
    ),

    laboratoryTests = listOf(
        "Complete blood count",
        "Blood cultures"
    ),

    imaging = listOf(
        "Chest X-ray"
    ),

    confirmatoryTests = listOf(
        "Sputum culture"
    )

)


val diabetesType2Investigations = DiseaseInvestigations(

    diseaseId = DiseaseIndex.DIABETES_TYPE_2,

    bedsideTests = listOf(
        "Random blood glucose"
    ),

    laboratoryTests = listOf(
        "Fasting blood glucose",
        "HbA1c"
    ),

    imaging = listOf(),

    confirmatoryTests = listOf(
        "Oral glucose tolerance test"
    )

)


val migraineInvestigations = DiseaseInvestigations(

    diseaseId = DiseaseIndex.MIGRAINE,

    bedsideTests = listOf(),

    laboratoryTests = listOf(),

    imaging = listOf(
        "CT scan brain",
        "MRI brain"
    ),

    confirmatoryTests = listOf()

)


val strokeInvestigations = DiseaseInvestigations(

    diseaseId = DiseaseIndex.STROKE,

    bedsideTests = listOf(
        "Neurological examination"
    ),

    laboratoryTests = listOf(
        "Blood glucose",
        "Coagulation profile"
    ),

    imaging = listOf(
        "CT scan brain",
        "MRI brain"
    ),

    confirmatoryTests = listOf(
        "CT angiography"
    )

)


val diseaseInvestigationsList = listOf(

    hypertensionInvestigations,
    myocardialInfarctionInvestigations,
    asthmaInvestigations,
    pneumoniaInvestigations,
    diabetesType2Investigations,
    migraineInvestigations,
    strokeInvestigations

)
