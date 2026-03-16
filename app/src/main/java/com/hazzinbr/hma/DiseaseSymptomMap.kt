package com.yourapp.medassist.source.diseases

object DiseaseSymptomMap {

    val map = mapOf(

        DiseaseIndex.HYPERTENSION to listOf(
            "SYM_HEADACHE",
            "SYM_DIZZINESS",
            "SYM_BLURRED_VISION",
            "SYM_FATIGUE"
        ),

        DiseaseIndex.MYOCARDIAL_INFARCTION to listOf(
            "SYM_CHEST_PAIN",
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_SWEATING",
            "SYM_NAUSEA",
            "SYM_DIZZINESS",
            "SYM_RADIATING_ARM_PAIN"
        ),

        DiseaseIndex.ASTHMA to listOf(
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_WHEEZING",
            "SYM_CHEST_TIGHTNESS",
            "SYM_COUGH"
        ),

        DiseaseIndex.PNEUMONIA to listOf(
            "SYM_FEVER",
            "SYM_COUGH",
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_CHEST_PAIN",
            "SYM_FATIGUE"
        ),

        DiseaseIndex.DIABETES_TYPE_2 to listOf(
            "SYM_FREQUENT_URINATION",
            "SYM_EXCESSIVE_THIRST",
            "SYM_FATIGUE",
            "SYM_WEIGHT_LOSS_UNINTENTIONAL",
            "SYM_BLURRED_VISION"
        ),

        DiseaseIndex.MIGRAINE to listOf(
            "SYM_HEADACHE",
            "SYM_NAUSEA",
            "SYM_VOMITING",
            "SYM_PHOTOPHOBIA",
            "SYM_DIZZINESS"
        ),

        DiseaseIndex.STROKE to listOf(
            "SYM_WEAKNESS",
            "SYM_NUMBNESS",
            "SYM_CONFUSION",
            "SYM_VISION_LOSS",
            "SYM_HEADACHE",
            "SYM_SPEECH_DIFFICULTY"
        ),

        DiseaseIndex.ANGINA to listOf(
            "SYM_CHEST_PAIN",
            "SYM_CHEST_TIGHTNESS",
            "SYM_SHORTNESS_OF_BREATH"
        ),

        DiseaseIndex.COPD to listOf(
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_CHRONIC_COUGH",
            "SYM_WHEEZING",
            "SYM_FATIGUE"
        ),

        DiseaseIndex.BRONCHITIS to listOf(
            "SYM_COUGH",
            "SYM_PRODUCTIVE_COUGH",
            "SYM_CHEST_DISCOMFORT",
            "SYM_FATIGUE"
        ),

        DiseaseIndex.TUBERCULOSIS to listOf(
            "SYM_COUGH",
            "SYM_HEMOPTYSIS",
            "SYM_FEVER",
            "SYM_NIGHT_SWEATS",
            "SYM_WEIGHT_LOSS_UNINTENTIONAL"
        ),

        DiseaseIndex.GERD to listOf(
            "SYM_HEARTBURN",
            "SYM_CHEST_PAIN",
            "SYM_DYSPHAGIA",
            "SYM_BELCHING"
        ),

        DiseaseIndex.APPENDICITIS to listOf(
            "SYM_ABDOMINAL_PAIN",
            "SYM_NAUSEA",
            "SYM_VOMITING",
            "SYM_FEVER"
        ),

        DiseaseIndex.UTI to listOf(
            "SYM_DYSURIA",
            "SYM_FREQUENT_URINATION",
            "SYM_HEMATURIA",
            "SYM_LOWER_ABDOMINAL_PAIN"
        ),

        DiseaseIndex.KIDNEY_STONES to listOf(
            "SYM_FLANK_PAIN",
            "SYM_HEMATURIA",
            "SYM_NAUSEA",
            "SYM_VOMITING"
        ),

        DiseaseIndex.MALARIA to listOf(
            "SYM_FEVER",
            "SYM_CHILLS",
            "SYM_HEADACHE",
            "SYM_FATIGUE",
            "SYM_VOMITING"
        ),

        DiseaseIndex.TYPHOID to listOf(
            "SYM_FEVER",
            "SYM_ABDOMINAL_PAIN",
            "SYM_DIARRHEA",
            "SYM_FATIGUE"
        ),

        DiseaseIndex.SEPSIS to listOf(
            "SYM_FEVER",
            "SYM_CONFUSION",
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_LOW_BLOOD_PRESSURE"
        )

    )

}