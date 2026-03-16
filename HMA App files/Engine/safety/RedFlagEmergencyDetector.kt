package com.yourapp.medassist.engine.safety

object RedFlagEmergencyDetector {

    data class EmergencyAlert(

        val alertName: String,
        val severity: String,
        val message: String

    )

    private val redFlagRules = listOf(

        // Possible Heart Attack
        Rule(
            symptoms = listOf(
                "SYM_CHEST_PAIN",
                "SYM_SHORTNESS_OF_BREATH",
                "SYM_SWEATING"
            ),
            alertName = "Possible Heart Attack",
            severity = "CRITICAL",
            message = "Chest pain with shortness of breath and sweating may indicate a heart attack. Seek emergency care immediately."
        ),

        // Possible Stroke
        Rule(
            symptoms = listOf(
                "SYM_WEAKNESS",
                "SYM_SPEECH_DIFFICULTY",
                "SYM_CONFUSION"
            ),
            alertName = "Possible Stroke",
            severity = "CRITICAL",
            message = "Weakness with speech difficulty or confusion may indicate stroke. Immediate emergency care required."
        ),

        // Possible Meningitis
        Rule(
            symptoms = listOf(
                "SYM_FEVER",
                "SYM_HEADACHE",
                "SYM_PHOTOPHOBIA"
            ),
            alertName = "Possible Meningitis",
            severity = "HIGH",
            message = "Fever with severe headache and light sensitivity may indicate meningitis."
        ),

        // Severe Respiratory Distress
        Rule(
            symptoms = listOf(
                "SYM_SHORTNESS_OF_BREATH",
                "SYM_CHEST_TIGHTNESS"
            ),
            alertName = "Severe Breathing Problem",
            severity = "CRITICAL",
            message = "Serious breathing difficulty detected. Emergency evaluation recommended."
        )

    )

    data class Rule(

        val symptoms: List<String>,
        val alertName: String,
        val severity: String,
        val message: String

    )

    fun detect(symptoms: List<String>): List<EmergencyAlert> {

        val alerts = mutableListOf<EmergencyAlert>()

        for (rule in redFlagRules) {

            val matches = rule.symptoms.count {

                symptoms.contains(it)

            }

            if (matches >= rule.symptoms.size - 1) {

                alerts.add(

                    EmergencyAlert(
                        alertName = rule.alertName,
                        severity = rule.severity,
                        message = rule.message
                    )

                )

            }

        }

        return alerts

    }

}