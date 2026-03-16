package com.yourapp.medassist.engine.ai

object ClinicalReasoningEngine {

    data class ReasoningStep(

        val observation: String,
        val inference: String

    )

    data class ClinicalReasoningResult(

        val diseaseId: String,
        val reasoningSteps: List<ReasoningStep>

    )

    fun explain(

        diseaseId: String,
        symptoms: List<String>,
        age: Int,
        riskFactors: List<String>

    ): ClinicalReasoningResult {

        val steps = mutableListOf<ReasoningStep>()

        // Symptom reasoning
        if (symptoms.contains("SYM_CHEST_PAIN")) {

            steps.add(
                ReasoningStep(
                    observation = "Chest pain detected",
                    inference = "Possible cardiac or respiratory cause"
                )
            )

        }

        if (symptoms.contains("SYM_SHORTNESS_OF_BREATH")) {

            steps.add(
                ReasoningStep(
                    observation = "Shortness of breath detected",
                    inference = "Possible respiratory or cardiac involvement"
                )
            )

        }

        if (symptoms.contains("SYM_SWEATING")) {

            steps.add(
                ReasoningStep(
                    observation = "Sweating present",
                    inference = "Autonomic response often seen in acute illness"
                )
            )

        }

        if (symptoms.contains("SYM_FEVER")) {

            steps.add(
                ReasoningStep(
                    observation = "Fever detected",
                    inference = "Possible infection or inflammatory process"
                )
            )

        }

        // Age reasoning
        if (age >= 60) {

            steps.add(
                ReasoningStep(
                    observation = "Age above 60",
                    inference = "Higher risk for cardiovascular and chronic diseases"
                )
            )

        }

        // Risk factor reasoning
        if (riskFactors.contains("RF_SMOKING")) {

            steps.add(
                ReasoningStep(
                    observation = "Smoking history",
                    inference = "Increased risk of cardiovascular and lung diseases"
                )
            )

        }

        if (riskFactors.contains("RF_HYPERTENSION")) {

            steps.add(
                ReasoningStep(
                    observation = "History of hypertension",
                    inference = "Increased cardiovascular risk"
                )
            )

        }

        // Final reasoning
        steps.add(
            ReasoningStep(
                observation = "Symptom pattern analyzed",
                inference = "Symptoms and risk profile support consideration of $diseaseId"
            )
        )

        return ClinicalReasoningResult(

            diseaseId = diseaseId,
            reasoningSteps = steps

        )

    }

}