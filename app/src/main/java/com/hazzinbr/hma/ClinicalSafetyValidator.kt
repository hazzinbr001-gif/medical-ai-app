package com.yourapp.medassist.engine.validation

import com.yourapp.medassist.engine.diagnosis.DifferentialDiagnosisEngine

object ClinicalSafetyValidator {

    data class SafetyWarning(

        val message: String,
        val severity: String

    )

    fun validate(case: DifferentialDiagnosisEngine.PatientCase): List<SafetyWarning> {

        val warnings = mutableListOf<SafetyWarning>()

        // Age related checks
        if (case.age != null) {

            if (case.age < 5 && case.symptoms.contains("SYM_FEVER")) {

                warnings.add(
                    SafetyWarning(
                        message = "Fever in very young children requires medical evaluation.",
                        severity = "HIGH"
                    )
                )

            }

            if (case.age > 65 && case.symptoms.contains("SYM_CONFUSION")) {

                warnings.add(
                    SafetyWarning(
                        message = "Confusion in elderly patients may indicate serious illness.",
                        severity = "HIGH"
                    )
                )

            }

        }

        // Dangerous symptom combinations
        if (
            case.symptoms.contains("SYM_CHEST_PAIN") &&
            case.symptoms.contains("SYM_SHORTNESS_OF_BREATH")
        ) {

            warnings.add(
                SafetyWarning(
                    message = "Chest pain with shortness of breath may indicate a serious heart or lung condition.",
                    severity = "CRITICAL"
                )
            )

        }

        if (
            case.symptoms.contains("SYM_FEVER") &&
            case.symptoms.contains("SYM_CONFUSION")
        ) {

            warnings.add(
                SafetyWarning(
                    message = "Fever with confusion may indicate severe infection.",
                    severity = "CRITICAL"
                )
            )

        }

        if (
            case.symptoms.contains("SYM_WEAKNESS") &&
            case.symptoms.contains("SYM_SPEECH_DIFFICULTY")
        ) {

            warnings.add(
                SafetyWarning(
                    message = "Weakness with speech difficulty may indicate stroke.",
                    severity = "CRITICAL"
                )
            )

        }

        // Severe symptom flag
        if (case.symptoms.contains("SYM_SEIZURE")) {

            warnings.add(
                SafetyWarning(
                    message = "Seizures require immediate medical attention.",
                    severity = "CRITICAL"
                )
            )

        }

        return warnings

    }

}