package com.yourapp.medassist.source.diseases

data class DiseaseRiskFactors(

    val diseaseId: String,

    val majorRiskFactors: List<String> = emptyList(),

    val minorRiskFactors: List<String> = emptyList()

)
package com.yourapp.medassist.source.diseases

val hypertensionRiskFactors = DiseaseRiskFactors(

    diseaseId = DiseaseIndex.HYPERTENSION,

    majorRiskFactors = listOf(
        "RF_FAMILY_HISTORY_HYPERTENSION",
        "RF_OBESITY",
        "RF_HIGH_SALT_DIET",
        "RF_SMOKING",
        "RF_SEDENTARY_LIFESTYLE"
    ),

    minorRiskFactors = listOf(
        "RF_STRESS",
        "RF_ALCOHOL_USE",
        "RF_OLDER_AGE"
    )

)


val myocardialInfarctionRiskFactors = DiseaseRiskFactors(

    diseaseId = DiseaseIndex.MYOCARDIAL_INFARCTION,

    majorRiskFactors = listOf(
        "RF_SMOKING",
        "RF_DIABETES",
        "RF_HYPERTENSION",
        "RF_HIGH_CHOLESTEROL",
        "RF_FAMILY_HISTORY_CARDIOVASCULAR"
    ),

    minorRiskFactors = listOf(
        "RF_OBESITY",
        "RF_STRESS",
        "RF_SEDENTARY_LIFESTYLE"
    )

)


val asthmaRiskFactors = DiseaseRiskFactors(

    diseaseId = DiseaseIndex.ASTHMA,

    majorRiskFactors = listOf(
        "RF_FAMILY_HISTORY_ASTHMA",
        "RF_ALLERGIES"
    ),

    minorRiskFactors = listOf(
        "RF_SMOKING",
        "RF_AIR_POLLUTION",
        "RF_OCCUPATIONAL_EXPOSURE"
    )

)


val pneumoniaRiskFactors = DiseaseRiskFactors(

    diseaseId = DiseaseIndex.PNEUMONIA,

    majorRiskFactors = listOf(
        "RF_SMOKING",
        "RF_IMMUNOCOMPROMISED",
        "RF_CHRONIC_LUNG_DISEASE"
    ),

    minorRiskFactors = listOf(
        "RF_OLDER_AGE",
        "RF_RECENT_RESPIRATORY_INFECTION"
    )

)


val diabetesType2RiskFactors = DiseaseRiskFactors(

    diseaseId = DiseaseIndex.DIABETES_TYPE_2,

    majorRiskFactors = listOf(
        "RF_OBESITY",
        "RF_FAMILY_HISTORY_DIABETES",
        "RF_SEDENTARY_LIFESTYLE"
    ),

    minorRiskFactors = listOf(
        "RF_OLDER_AGE",
        "RF_POOR_DIET"
    )

)


val migraineRiskFactors = DiseaseRiskFactors(

    diseaseId = DiseaseIndex.MIGRAINE,

    majorRiskFactors = listOf(
        "RF_FAMILY_HISTORY_MIGRAINE"
    ),

    minorRiskFactors = listOf(
        "RF_STRESS",
        "RF_SLEEP_DEPRIVATION",
        "RF_HORMONAL_CHANGES"
    )

)


val strokeRiskFactors = DiseaseRiskFactors(

    diseaseId = DiseaseIndex.STROKE,

    majorRiskFactors = listOf(
        "RF_HYPERTENSION",
        "RF_DIABETES",
        "RF_SMOKING",
        "RF_HEART_DISEASE"
    ),

    minorRiskFactors = listOf(
        "RF_HIGH_CHOLESTEROL",
        "RF_OBESITY",
        "RF_SEDENTARY_LIFESTYLE"
    )

)


val diseaseRiskFactorsList = listOf(

    hypertensionRiskFactors,
    myocardialInfarctionRiskFactors,
    asthmaRiskFactors,
    pneumoniaRiskFactors,
    diabetesType2RiskFactors,
    migraineRiskFactors,
    strokeRiskFactors

)
