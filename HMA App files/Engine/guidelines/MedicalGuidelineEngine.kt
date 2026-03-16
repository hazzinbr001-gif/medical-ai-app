package com.yourapp.medassist.engine.guidelines

object MedicalGuidelineEngine {

    data class GuidelineResult(

        val guidelineName: String,
        val triggered: Boolean,
        val recommendation: String

    )

    fun evaluate(symptoms: List<String>): List<GuidelineResult> {

        val results = mutableListOf<GuidelineResult>()

        // HEART ATTACK (CHEST PAIN RULE)
        val chestPainRule = symptoms.contains("SYM_CHEST_PAIN") &&
                symptoms.contains("SYM_SHORTNESS_OF_BREATH") &&
                symptoms.contains("SYM_SWEATING")

        results.add(

            GuidelineResult(
                guidelineName = "Possible Myocardial Infarction",
                triggered = chestPainRule,
                recommendation =
                    if (chestPainRule)
                        "Immediate emergency evaluation recommended (possible heart attack)"
                    else
                        "Rule not triggered"
            )

        )

        // STROKE (FAST RULE)
        val strokeRule = symptoms.contains("SYM_WEAKNESS") ||
                symptoms.contains("SYM_SPEECH_DIFFICULTY") ||
                symptoms.contains("SYM_VISION_LOSS")

        results.add(

            GuidelineResult(
                guidelineName = "Possible Stroke (FAST)",
                triggered = strokeRule,
                recommendation =
                    if (strokeRule)
                        "Urgent stroke evaluation recommended"
                    else
                        "Rule not triggered"
            )

        )

        // SEPSIS SCREEN
        val sepsisRule = symptoms.contains("SYM_FEVER") &&
                symptoms.contains("SYM_CONFUSION") &&
                symptoms.contains("SYM_SHORTNESS_OF_BREATH")

        results.add(

            GuidelineResult(
                guidelineName = "Possible Sepsis",
                triggered = sepsisRule,
                recommendation =
                    if (sepsisRule)
                        "Urgent hospital assessment recommended"
                    else
                        "Rule not triggered"
            )

        )

        // PNEUMONIA SCREEN
        val pneumoniaRule = symptoms.contains("SYM_COUGH") &&
                symptoms.contains("SYM_FEVER") &&
                symptoms.contains("SYM_SHORTNESS_OF_BREATH")

        results.add(

            GuidelineResult(
                guidelineName = "Possible Pneumonia",
                triggered = pneumoniaRule,
                recommendation =
                    if (pneumoniaRule)
                        "Medical evaluation recommended for possible pneumonia"
                    else
                        "Rule not triggered"
            )

        )

        // MIGRAINE SCREEN
        val migraineRule = symptoms.contains("SYM_HEADACHE") &&
                symptoms.contains("SYM_PHOTOPHOBIA") &&
                symptoms.contains("SYM_NAUSEA")

        results.add(

            GuidelineResult(
                guidelineName = "Possible Migraine",
                triggered = migraineRule,
                recommendation =
                    if (migraineRule)
                        "Symptoms consistent with migraine"
                    else
                        "Rule not triggered"
            )

        )

        return results
    }

}