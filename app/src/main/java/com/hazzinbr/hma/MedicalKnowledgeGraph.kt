package com.yourapp.medassist.source.knowledge

import com.yourapp.medassist.source.diseases.DiseaseIndex
import com.yourapp.medassist.source.symptoms.SymptomIndex

object MedicalKnowledgeGraph {

    data class DiseaseNode(

        val diseaseId: String,

        val symptoms: List<String>,

        val riskFactors: List<String> = emptyList(),

        val complications: List<String> = emptyList(),

        val relatedDiseases: List<String> = emptyList()

    )

    val graph = mapOf(

        DiseaseIndex.MYOCARDIAL_INFARCTION to DiseaseNode(

            diseaseId = DiseaseIndex.MYOCARDIAL_INFARCTION,

            symptoms = listOf(
                SymptomIndex.CHEST_PAIN,
                SymptomIndex.SHORTNESS_OF_BREATH,
                SymptomIndex.SWEATING,
                SymptomIndex.NAUSEA,
                SymptomIndex.RADIATING_ARM_PAIN
            ),

            riskFactors = listOf(
                "RF_SMOKING",
                "RF_HYPERTENSION",
                "RF_DIABETES",
                "RF_OBESITY"
            ),

            complications = listOf(
                "Heart Failure",
                "Arrhythmia",
                "Cardiogenic Shock"
            ),

            relatedDiseases = listOf(
                DiseaseIndex.ANGINA,
                DiseaseIndex.HEART_FAILURE
            )

        ),

        DiseaseIndex.ASTHMA to DiseaseNode(

            diseaseId = DiseaseIndex.ASTHMA,

            symptoms = listOf(
                SymptomIndex.WHEEZING,
                SymptomIndex.SHORTNESS_OF_BREATH,
                SymptomIndex.COUGH,
                SymptomIndex.CHEST_TIGHTNESS
            ),

            riskFactors = listOf(
                "RF_ALLERGIES",
                "RF_SMOKING",
                "RF_AIR_POLLUTION"
            ),

            complications = listOf(
                "Respiratory Failure",
                "Severe Asthma Attack"
            ),

            relatedDiseases = listOf(
                DiseaseIndex.COPD,
                DiseaseIndex.PNEUMONIA
            )

        ),

        DiseaseIndex.PNEUMONIA to DiseaseNode(

            diseaseId = DiseaseIndex.PNEUMONIA,

            symptoms = listOf(
                SymptomIndex.FEVER,
                SymptomIndex.COUGH,
                SymptomIndex.SHORTNESS_OF_BREATH,
                SymptomIndex.CHEST_PAIN
            ),

            riskFactors = listOf(
                "RF_SMOKING",
                "RF_IMMUNOCOMPROMISED",
                "RF_AGE_ELDERLY"
            ),

            complications = listOf(
                "Sepsis",
                "Respiratory Failure",
                "Pleural Effusion"
            ),

            relatedDiseases = listOf(
                DiseaseIndex.BRONCHITIS,
                DiseaseIndex.COVID19
            )

        ),

        DiseaseIndex.DIABETES_TYPE_2 to DiseaseNode(

            diseaseId = DiseaseIndex.DIABETES_TYPE_2,

            symptoms = listOf(
                SymptomIndex.FATIGUE,
                SymptomIndex.POLYURIA,
                SymptomIndex.POLYDIPSIA,
                SymptomIndex.BLURRED_VISION
            ),

            riskFactors = listOf(
                "RF_OBESITY",
                "RF_SEDENTARY_LIFESTYLE",
                "RF_FAMILY_HISTORY"
            ),

            complications = listOf(
                "Neuropathy",
                "Nephropathy",
                "Retinopathy"
            ),

            relatedDiseases = listOf(
                DiseaseIndex.HYPERTENSION,
                DiseaseIndex.HEART_FAILURE
            )

        ),

        DiseaseIndex.STROKE to DiseaseNode(

            diseaseId = DiseaseIndex.STROKE,

            symptoms = listOf(
                SymptomIndex.WEAKNESS,
                SymptomIndex.NUMBNESS,
                SymptomIndex.SPEECH_DIFFICULTY,
                SymptomIndex.VISION_LOSS
            ),

            riskFactors = listOf(
                "RF_HYPERTENSION",
                "RF_SMOKING",
                "RF_DIABETES"
            ),

            complications = listOf(
                "Paralysis",
                "Speech Impairment",
                "Cognitive Decline"
            ),

            relatedDiseases = listOf(
                DiseaseIndex.TRANSIENT_ISCHEMIC_ATTACK
            )

        )

    )

}