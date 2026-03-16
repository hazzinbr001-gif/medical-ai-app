package com.yourapp.medassist.source.diseases

data class DiseaseSymptoms(

    val diseaseId: String,

    val keySymptoms: List<String> = emptyList(),

    val supportingSymptoms: List<String> = emptyList(),

    val redFlagSymptoms: List<String> = emptyList(),

    val exclusionSymptoms: List<String> = emptyList()

)
val hypertensionSymptoms = DiseaseSymptoms(

    diseaseId = DiseaseIndex.HYPERTENSION,

    keySymptoms = listOf(
        "SYM_HEADACHE"
    ),

    supportingSymptoms = listOf(
        "SYM_DIZZINESS",
        "SYM_BLURRED_VISION",
        "SYM_FATIGUE"
    ),

    redFlagSymptoms = listOf(),

    exclusionSymptoms = listOf()

)


val myocardialInfarctionSymptoms = DiseaseSymptoms(

    diseaseId = DiseaseIndex.MYOCARDIAL_INFARCTION,

    keySymptoms = listOf(
        "SYM_CHEST_PAIN"
    ),

    supportingSymptoms = listOf(
        "SYM_SHORTNESS_OF_BREATH",
        "SYM_SWEATING",
        "SYM_NAUSEA",
        "SYM_DIZZINESS"
    ),

    redFlagSymptoms = listOf(
        "SYM_RADIATING_ARM_PAIN"
    ),

    exclusionSymptoms = listOf()

)


val asthmaSymptoms = DiseaseSymptoms(

    diseaseId = DiseaseIndex.ASTHMA,

    keySymptoms = listOf(
        "SYM_SHORTNESS_OF_BREATH",
        "SYM_WHEEZING"
    ),

    supportingSymptoms = listOf(
        "SYM_CHEST_TIGHTNESS",
        "SYM_COUGH"
    ),

    redFlagSymptoms = listOf(),

    exclusionSymptoms = listOf()

)


val pneumoniaSymptoms = DiseaseSymptoms(

    diseaseId = DiseaseIndex.PNEUMONIA,

    keySymptoms = listOf(
        "SYM_FEVER",
        "SYM_COUGH"
    ),

    supportingSymptoms = listOf(
        "SYM_SHORTNESS_OF_BREATH",
        "SYM_CHEST_PAIN",
        "SYM_FATIGUE"
    ),

    redFlagSymptoms = listOf(),

    exclusionSymptoms = listOf()

)


val diabetesType2Symptoms = DiseaseSymptoms(

    diseaseId = DiseaseIndex.DIABETES_TYPE_2,

    keySymptoms = listOf(
        "SYM_FREQUENT_URINATION",
        "SYM_EXCESSIVE_THIRST"
    ),

    supportingSymptoms = listOf(
        "SYM_FATIGUE",
        "SYM_WEIGHT_LOSS_UNINTENTIONAL",
        "SYM_BLURRED_VISION"
    ),

    redFlagSymptoms = listOf(),

    exclusionSymptoms = listOf()

)


val migraineSymptoms = DiseaseSymptoms(

    diseaseId = DiseaseIndex.MIGRAINE,

    keySymptoms = listOf(
        "SYM_HEADACHE"
    ),

    supportingSymptoms = listOf(
        "SYM_NAUSEA",
        "SYM_VOMITING",
        "SYM_PHOTOPHOBIA",
        "SYM_DIZZINESS"
    ),

    redFlagSymptoms = listOf(),

    exclusionSymptoms = listOf()

)


val strokeSymptoms = DiseaseSymptoms(

    diseaseId = DiseaseIndex.STROKE,

    keySymptoms = listOf(
        "SYM_WEAKNESS",
        "SYM_NUMBNESS"
    ),

    supportingSymptoms = listOf(
        "SYM_CONFUSION",
        "SYM_VISION_LOSS",
        "SYM_HEADACHE"
    ),

    redFlagSymptoms = listOf(
        "SYM_SPEECH_DIFFICULTY"
    ),

    exclusionSymptoms = listOf()

)

val diseaseSymptomsList = listOf(

    hypertensionSymptoms,
    myocardialInfarctionSymptoms,
    asthmaSymptoms,
    pneumoniaSymptoms,
    diabetesType2Symptoms,
    migraineSymptoms,
    strokeSymptoms

)