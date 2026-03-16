package com.yourapp.medassist.engine.ai

object ClinicalPatternLibrary {

    data class ClinicalPattern(

        val name: String,
        val symptoms: List<String>,
        val suspectedDiseases: List<String>

    )

    private val patterns = listOf(

        ClinicalPattern(

            name = "CARDIAC_EVENT",

            symptoms = listOf(
                "SYM_CHEST_PAIN",
                "SYM_SHORTNESS_OF_BREATH",
                "SYM_SWEATING"
            ),

            suspectedDiseases = listOf(
                "Myocardial Infarction",
                "Unstable Angina",
                "Acute Coronary Syndrome"
            )

        ),

        ClinicalPattern(

            name = "RESPIRATORY_INFECTION",

            symptoms = listOf(
                "SYM_FEVER",
                "SYM_COUGH",
                "SYM_SHORTNESS_OF_BREATH"
            ),

            suspectedDiseases = listOf(
                "Pneumonia",
                "Bronchitis",
                "COVID-like Illness"
            )

        ),

        ClinicalPattern(

            name = "STROKE_PATTERN",

            symptoms = listOf(
                "SYM_WEAKNESS",
                "SYM_SPEECH_DIFFICULTY",
                "SYM_CONFUSION"
            ),

            suspectedDiseases = listOf(
                "Ischemic Stroke",
                "Hemorrhagic Stroke",
                "Transient Ischemic Attack"
            )

        ),

        ClinicalPattern(

            name = "MENINGITIS_PATTERN",

            symptoms = listOf(
                "SYM_FEVER",
                "SYM_HEADACHE",
                "SYM_PHOTOPHOBIA"
            ),

            suspectedDiseases = listOf(
                "Bacterial Meningitis",
                "Viral Meningitis"
            )

        ),

        ClinicalPattern(

            name = "GASTROENTERITIS_PATTERN",

            symptoms = listOf(
                "SYM_NAUSEA",
                "SYM_VOMITING",
                "SYM_ABDOMINAL_PAIN"
            ),

            suspectedDiseases = listOf(
                "Viral Gastroenteritis",
                "Food Poisoning"
            )

        )

    )

    fun matchPatterns(

        patientSymptoms: List<String>

    ): List<ClinicalPattern> {

        val matches = mutableListOf<ClinicalPattern>()

        for (pattern in patterns) {

            val matchCount = pattern.symptoms.count {

                patientSymptoms.contains(it)

            }

            if (matchCount >= 2) {

                matches.add(pattern)

            }

        }

        return matches

    }

}