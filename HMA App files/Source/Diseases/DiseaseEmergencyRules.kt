package com.yourapp.medassist.source.diseases

object DiseaseEmergencyRules {

    val emergencySymptoms = mapOf(

        DiseaseIndex.MYOCARDIAL_INFARCTION to listOf(
            "SYM_CHEST_PAIN",
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_SWEATING",
            "SYM_RADIATING_ARM_PAIN"
        ),

        DiseaseIndex.STROKE to listOf(
            "SYM_WEAKNESS",
            "SYM_NUMBNESS",
            "SYM_SPEECH_DIFFICULTY",
            "SYM_VISION_LOSS",
            "SYM_CONFUSION"
        ),

        DiseaseIndex.SEPSIS to listOf(
            "SYM_FEVER",
            "SYM_CONFUSION",
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_LOW_BLOOD_PRESSURE"
        ),

        DiseaseIndex.APPENDICITIS to listOf(
            "SYM_ABDOMINAL_PAIN",
            "SYM_FEVER",
            "SYM_VOMITING"
        ),

        DiseaseIndex.PYELONEPHRITIS to listOf(
            "SYM_FEVER",
            "SYM_FLANK_PAIN",
            "SYM_VOMITING"
        ),

        DiseaseIndex.MENINGITIS to listOf(
            "SYM_FEVER",
            "SYM_HEADACHE",
            "SYM_NECK_STIFFNESS",
            "SYM_CONFUSION"
        ),

        DiseaseIndex.PNEUMONIA to listOf(
            "SYM_FEVER",
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_CHEST_PAIN"
        ),

        DiseaseIndex.MALARIA to listOf(
            "SYM_FEVER",
            "SYM_CHILLS",
            "SYM_CONFUSION",
            "SYM_VOMITING"
        )

    )

}