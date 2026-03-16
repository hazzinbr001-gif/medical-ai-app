package com.yourapp.medassist.source.diseases

data class Disease(

    val id: String,

    val name: String,

    val description: String,

    val category: String,

    val bodySystem: String,

    val acuteOrChronic: String,

    val commonality: Int,   // 1–10 (10 very common)

    val emergency: Boolean

)



val hypertension = Disease(

    id = DiseaseIndex.HYPERTENSION,

    name = "Hypertension",

    description = "A chronic medical condition in which the blood pressure in the arteries is persistently elevated.",

    category = "Cardiovascular",

    bodySystem = "Cardiovascular",

    acuteOrChronic = "Chronic",

    commonality = 10,

    emergency = false

)
val myocardialInfarction = Disease(

    id = DiseaseIndex.MYOCARDIAL_INFARCTION,

    name = "Myocardial Infarction",

    description = "Acute injury of heart muscle due to interruption of coronary blood supply.",

    category = "Cardiovascular",

    bodySystem = "Cardiovascular",

    acuteOrChronic = "Acute",

    commonality = 8,

    emergency = true

)


val asthma = Disease(

    id = DiseaseIndex.ASTHMA,

    name = "Asthma",

    description = "Chronic inflammatory disease of the airways causing reversible airflow obstruction.",

    category = "Respiratory",

    bodySystem = "Respiratory",

    acuteOrChronic = "Chronic",

    commonality = 8,

    emergency = false

)


val pneumonia = Disease(

    id = DiseaseIndex.PNEUMONIA,

    name = "Pneumonia",

    description = "Infection that inflames the air sacs in one or both lungs.",

    category = "Respiratory",

    bodySystem = "Respiratory",

    acuteOrChronic = "Acute",

    commonality = 7,

    emergency = false

)


val diabetesType2 = Disease(

    id = DiseaseIndex.DIABETES_TYPE_2,

    name = "Type 2 Diabetes Mellitus",

    description = "A metabolic disorder characterized by insulin resistance and high blood glucose.",

    category = "Endocrine",

    bodySystem = "Endocrine",

    acuteOrChronic = "Chronic",

    commonality = 10,

    emergency = false

)


val migraine = Disease(

    id = DiseaseIndex.MIGRAINE,

    name = "Migraine",

    description = "A neurological disorder characterized by recurrent headaches often associated with nausea and sensitivity to light.",

    category = "Neurological",

    bodySystem = "Neurological",

    acuteOrChronic = "Chronic",

    commonality = 7,

    emergency = false

)


val stroke = Disease(

    id = DiseaseIndex.STROKE,

    name = "Stroke",

    description = "A medical emergency where blood supply to part of the brain is interrupted or reduced.",

    category = "Neurological",

    bodySystem = "Neurological",

    acuteOrChronic = "Acute",

    commonality = 6,

    emergency = true

)


val diseases = listOf(

    hypertension,
    myocardialInfarction,
    asthma,
    pneumonia,
    diabetesType2,
    migraine,
    stroke

)

val angina = Disease(
    id = DiseaseIndex.ANGINA,
    name = "Angina",
    description = "Chest pain caused by reduced blood flow to heart muscles.",
    category = "Cardiovascular",
    bodySystem = "Cardiovascular",
    acuteOrChronic = "Chronic",
    commonality = 7,
    emergency = false
)

val arrhythmia = Disease(
    id = DiseaseIndex.ARRHYTHMIA,
    name = "Cardiac Arrhythmia",
    description = "Irregular heartbeat due to abnormal electrical activity in the heart.",
    category = "Cardiovascular",
    bodySystem = "Cardiovascular",
    acuteOrChronic = "Chronic",
    commonality = 6,
    emergency = true
)

val copd = Disease(
    id = DiseaseIndex.COPD,
    name = "Chronic Obstructive Pulmonary Disease",
    description = "Chronic inflammatory lung disease that obstructs airflow.",
    category = "Respiratory",
    bodySystem = "Respiratory",
    acuteOrChronic = "Chronic",
    commonality = 7,
    emergency = false
)

val bronchitis = Disease(
    id = DiseaseIndex.BRONCHITIS,
    name = "Bronchitis",
    description = "Inflammation of the bronchial tubes causing cough and mucus production.",
    category = "Respiratory",
    bodySystem = "Respiratory",
    acuteOrChronic = "Acute",
    commonality = 8,
    emergency = false
)

val tuberculosis = Disease(
    id = DiseaseIndex.TUBERCULOSIS,
    name = "Tuberculosis",
    description = "A bacterial infection primarily affecting the lungs.",
    category = "Respiratory",
    bodySystem = "Respiratory",
    acuteOrChronic = "Chronic",
    commonality = 6,
    emergency = false
)

val gerd = Disease(
    id = DiseaseIndex.GERD,
    name = "Gastroesophageal Reflux Disease",
    description = "Chronic reflux of stomach acid into the esophagus.",
    category = "Gastrointestinal",
    bodySystem = "Gastrointestinal",
    acuteOrChronic = "Chronic",
    commonality = 9,
    emergency = false
)

val appendicitis = Disease(
    id = DiseaseIndex.APPENDICITIS,
    name = "Appendicitis",
    description = "Inflammation of the appendix causing abdominal pain.",
    category = "Gastrointestinal",
    bodySystem = "Gastrointestinal",
    acuteOrChronic = "Acute",
    commonality = 7,
    emergency = true
)

val hepatitis = Disease(
    id = DiseaseIndex.HEPATITIS,
    name = "Hepatitis",
    description = "Inflammation of the liver usually caused by viral infection.",
    category = "Gastrointestinal",
    bodySystem = "Hepatic",
    acuteOrChronic = "Acute",
    commonality = 6,
    emergency = false
)

val meningitis = Disease(
    id = DiseaseIndex.MENINGITIS,
    name = "Meningitis",
    description = "Inflammation of the membranes surrounding brain and spinal cord.",
    category = "Neurological",
    bodySystem = "Neurological",
    acuteOrChronic = "Acute",
    commonality = 5,
    emergency = true
)

val epilepsy = Disease(
    id = DiseaseIndex.EPILEPSY,
    name = "Epilepsy",
    description = "Neurological disorder characterized by recurrent seizures.",
    category = "Neurological",
    bodySystem = "Neurological",
    acuteOrChronic = "Chronic",
    commonality = 6,
    emergency = false
)

val hypothyroidism = Disease(
    id = DiseaseIndex.HYPOTHYROIDISM,
    name = "Hypothyroidism",
    description = "Underactive thyroid gland producing insufficient hormones.",
    category = "Endocrine",
    bodySystem = "Endocrine",
    acuteOrChronic = "Chronic",
    commonality = 7,
    emergency = false
)

val hyperthyroidism = Disease(
    id = DiseaseIndex.HYPERTHYROIDISM,
    name = "Hyperthyroidism",
    description = "Overactive thyroid gland producing excessive hormones.",
    category = "Endocrine",
    bodySystem = "Endocrine",
    acuteOrChronic = "Chronic",
    commonality = 6,
    emergency = false
)

val uti = Disease(
    id = DiseaseIndex.UTI,
    name = "Urinary Tract Infection",
    description = "Bacterial infection affecting urinary system.",
    category = "Genitourinary",
    bodySystem = "Genitourinary",
    acuteOrChronic = "Acute",
    commonality = 9,
    emergency = false
)

val pyelonephritis = Disease(
    id = DiseaseIndex.PYELONEPHRITIS,
    name = "Pyelonephritis",
    description = "Kidney infection usually resulting from untreated UTI.",
    category = "Genitourinary",
    bodySystem = "Renal",
    acuteOrChronic = "Acute",
    commonality = 6,
    emergency = true
)

val kidneyStones = Disease(
    id = DiseaseIndex.KIDNEY_STONES,
    name = "Nephrolithiasis",
    description = "Formation of stones in kidneys causing severe pain.",
    category = "Genitourinary",
    bodySystem = "Renal",
    acuteOrChronic = "Acute",
    commonality = 7,
    emergency = false
)

val malaria = Disease(
    id = DiseaseIndex.MALARIA,
    name = "Malaria",
    description = "Parasitic infection transmitted by mosquitoes.",
    category = "Infectious",
    bodySystem = "Systemic",
    acuteOrChronic = "Acute",
    commonality = 9,
    emergency = true
)

val typhoid = Disease(
    id = DiseaseIndex.TYPHOID,
    name = "Typhoid Fever",
    description = "Bacterial infection caused by Salmonella typhi.",
    category = "Infectious",
    bodySystem = "Systemic",
    acuteOrChronic = "Acute",
    commonality = 7,
    emergency = false
)

val sepsis = Disease(
    id = DiseaseIndex.SEPSIS,
    name = "Sepsis",
    description = "Life‑threatening organ dysfunction caused by infection.",
    category = "Infectious",
    bodySystem = "Systemic",
    acuteOrChronic = "Acute",
    commonality = 5,
    emergency = true
)

val eczema = Disease(
    id = DiseaseIndex.ECZEMA,
    name = "Eczema",
    description = "Inflammatory skin condition causing itching and rash.",
    category = "Dermatology",
    bodySystem = "Skin",
    acuteOrChronic = "Chronic",
    commonality = 7,
    emergency = false
)

val psoriasis = Disease(
    id = DiseaseIndex.PSORIASIS,
    name = "Psoriasis",
    description = "Chronic autoimmune skin disease causing red scaly patches.",
    category = "Dermatology",
    bodySystem = "Skin",
    acuteOrChronic = "Chronic",
    commonality = 6,
    emergency = false
)


val diseases = listOf(

    hypertension,
    myocardialInfarction,
    asthma,
    pneumonia,
    diabetesType2,
    migraine,
    stroke,

    angina,
    arrhythmia,
    copd,
    bronchitis,
    tuberculosis,

    gerd,
    appendicitis,
    hepatitis,

    meningitis,
    epilepsy,

    hypothyroidism,
    hyperthyroidism,

    uti,
    pyelonephritis,
    kidneyStones,

    malaria,
    typhoid,
    sepsis,

    eczema,
    psoriasis

)