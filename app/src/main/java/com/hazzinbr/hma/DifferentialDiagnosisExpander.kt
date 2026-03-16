package com.yourapp.medassist.engine.ai

object DifferentialDiagnosisExpander {

    data class DifferentialGroup(

        val symptomFocus: String,
        val diseaseCategories: Map<String, List<String>>

    )

    private val groups = listOf(

        DifferentialGroup(

            symptomFocus = "SYM_CHEST_PAIN",

            diseaseCategories = mapOf(

                "Cardiac Causes" to listOf(
                    "Myocardial Infarction",
                    "Unstable Angina",
                    "Pericarditis"
                ),

                "Pulmonary Causes" to listOf(
                    "Pulmonary Embolism",
                    "Pneumonia",
                    "Pneumothorax"
                ),

                "Gastrointestinal Causes" to listOf(
                    "GERD",
                    "Esophageal Spasm"
                ),

                "Musculoskeletal Causes" to listOf(
                    "Costochondritis",
                    "Muscle Strain"
                )

            )

        ),

        DifferentialGroup(

            symptomFocus = "SYM_HEADACHE",

            diseaseCategories = mapOf(

                "Primary Headache" to listOf(
                    "Migraine",
                    "Tension Headache",
                    "Cluster Headache"
                ),

                "Neurological Causes" to listOf(
                    "Stroke",
                    "Brain Tumor"
                ),

                "Infectious Causes" to listOf(
                    "Meningitis",
                    "Encephalitis"
                )

            )

        ),

        DifferentialGroup(

            symptomFocus = "SYM_ABDOMINAL_PAIN",

            diseaseCategories = mapOf(

                "Gastrointestinal Causes" to listOf(
                    "Appendicitis",
                    "Gastritis",
                    "Peptic Ulcer"
                ),

                "Hepatobiliary Causes" to listOf(
                    "Cholecystitis",
                    "Gallstones"
                ),

                "Other Causes" to listOf(
                    "Kidney Stones",
                    "Pancreatitis"
                )

            )

        )

    )

    fun expand(symptoms: List<String>): List<DifferentialGroup> {

        val results = mutableListOf<DifferentialGroup>()

        for (group in groups) {

            if (symptoms.contains(group.symptomFocus)) {

                results.add(group)

            }

        }

        return results

    }

}