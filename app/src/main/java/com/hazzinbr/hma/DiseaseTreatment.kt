package com.yourapp.medassist.source.diseases

data class DiseaseTreatment(

    val diseaseId: String,

    val firstLine: List<String> = emptyList(),

    val secondLine: List<String> = emptyList(),

    val emergencyManagement: List<String> = emptyList(),

    val lifestyleManagement: List<String> = emptyList()

)
val hypertensionTreatment = DiseaseTreatment(

    diseaseId = DiseaseIndex.HYPERTENSION,

    firstLine = listOf(
        "Thiazide diuretics",
        "ACE inhibitors",
        "Calcium channel blockers"
    ),

    secondLine = listOf(
        "Beta blockers",
        "Angiotensin receptor blockers"
    ),

    emergencyManagement = listOf(),

    lifestyleManagement = listOf(
        "Reduce salt intake",
        "Weight loss",
        "Regular physical exercise",
        "Stop smoking",
        "Limit alcohol intake"
    )

)


val myocardialInfarctionTreatment = DiseaseTreatment(

    diseaseId = DiseaseIndex.MYOCARDIAL_INFARCTION,

    firstLine = listOf(
        "Aspirin",
        "Nitroglycerin",
        "Oxygen"
    ),

    secondLine = listOf(
        "Beta blockers",
        "ACE inhibitors",
        "Statins"
    ),

    emergencyManagement = listOf(
        "Immediate hospital admission",
        "Percutaneous coronary intervention",
        "Thrombolysis"
    ),

    lifestyleManagement = listOf(
        "Smoking cessation",
        "Diet modification",
        "Cardiac rehabilitation"
    )

)


val asthmaTreatment = DiseaseTreatment(

    diseaseId = DiseaseIndex.ASTHMA,

    firstLine = listOf(
        "Short acting beta agonists",
        "Inhaled corticosteroids"
    ),

    secondLine = listOf(
        "Long acting beta agonists",
        "Leukotriene receptor antagonists"
    ),

    emergencyManagement = listOf(
        "Nebulized bronchodilators",
        "Systemic corticosteroids",
        "Oxygen therapy"
    ),

    lifestyleManagement = listOf(
        "Avoid allergens",
        "Smoking cessation",
        "Air pollution avoidance"
    )

)


val pneumoniaTreatment = DiseaseTreatment(

    diseaseId = DiseaseIndex.PNEUMONIA,

    firstLine = listOf(
        "Empiric antibiotics",
        "Antipyretics"
    ),

    secondLine = listOf(
        "Targeted antibiotics"
    ),

    emergencyManagement = listOf(
        "Oxygen therapy",
        "IV antibiotics",
        "Hospital admission if severe"
    ),

    lifestyleManagement = listOf(
        "Adequate hydration",
        "Rest",
        "Vaccination prevention"
    )

)


val diabetesType2Treatment = DiseaseTreatment(

    diseaseId = DiseaseIndex.DIABETES_TYPE_2,

    firstLine = listOf(
        "Metformin"
    ),

    secondLine = listOf(
        "Sulfonylureas",
        "SGLT2 inhibitors",
        "Insulin therapy"
    ),

    emergencyManagement = listOf(),

    lifestyleManagement = listOf(
        "Weight reduction",
        "Dietary modification",
        "Regular exercise"
    )

)


val migraineTreatment = DiseaseTreatment(

    diseaseId = DiseaseIndex.MIGRAINE,

    firstLine = listOf(
        "NSAIDs",
        "Triptans"
    ),

    secondLine = listOf(
        "Beta blockers",
        "Topiramate"
    ),

    emergencyManagement = listOf(),

    lifestyleManagement = listOf(
        "Adequate sleep",
        "Stress management",
        "Trigger avoidance"
    )

)


val strokeTreatment = DiseaseTreatment(

    diseaseId = DiseaseIndex.STROKE,

    firstLine = listOf(
        "Aspirin",
        "Blood pressure control"
    ),

    secondLine = listOf(
        "Anticoagulants",
        "Statins"
    ),

    emergencyManagement = listOf(
        "Immediate hospital admission",
        "Thrombolysis if eligible",
        "Mechanical thrombectomy"
    ),

    lifestyleManagement = listOf(
        "Smoking cessation",
        "Blood pressure control",
        "Healthy diet",
        "Regular exercise"
    )

)


val diseaseTreatmentList = listOf(

    hypertensionTreatment,
    myocardialInfarctionTreatment,
    asthmaTreatment,
    pneumoniaTreatment,
    diabetesType2Treatment,
    migraineTreatment,
    strokeTreatment

)
