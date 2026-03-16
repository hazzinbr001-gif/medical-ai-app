package com.yourapp.medassist.engine.safety

object ContraindicationSafetyEngine {

    data class SafetyAlert(

        val diseaseId: String,
        val contraindicatedItems: List<String>,
        val warningMessage: String

    )

    private val contraindicationMap = mapOf(

        "DIS_ASTHMA" to SafetyAlert(
            diseaseId = "DIS_ASTHMA",
            contraindicatedItems = listOf(
                "Non‑selective beta blockers",
                "Aspirin (in aspirin‑sensitive asthma)"
            ),
            warningMessage =
                "Some medications may worsen asthma symptoms"
        ),

        "DIS_CHRONIC_KIDNEY_DISEASE" to SafetyAlert(
            diseaseId = "DIS_CHRONIC_KIDNEY_DISEASE",
            contraindicatedItems = listOf(
                "NSAIDs",
                "High dose contrast imaging"
            ),
            warningMessage =
                "Avoid medications that can worsen kidney function"
        ),

        "DIS_HEART_FAILURE" to SafetyAlert(
            diseaseId = "DIS_HEART_FAILURE",
            contraindicatedItems = listOf(
                "NSAIDs",
                "Excess IV fluids"
            ),
            warningMessage =
                "These may worsen fluid overload in heart failure"
        ),

        "DIS_PEPTIC_ULCER" to SafetyAlert(
            diseaseId = "DIS_PEPTIC_ULCER",
            contraindicatedItems = listOf(
                "NSAIDs",
                "High dose steroids"
            ),
            warningMessage =
                "These medications may worsen gastric bleeding risk"
        ),

        "DIS_PREGNANCY" to SafetyAlert(
            diseaseId = "DIS_PREGNANCY",
            contraindicatedItems = listOf(
                "ACE inhibitors",
                "Warfarin",
                "Certain antibiotics"
            ),
            warningMessage =
                "Some drugs are unsafe during pregnancy"
        )

    )

    fun check(diseases: List<String>): List<SafetyAlert> {

        val alerts = mutableListOf<SafetyAlert>()

        for (disease in diseases) {

            val alert = contraindicationMap[disease]

            if (alert != null) {

                alerts.add(alert)

            }

        }

        return alerts

    }

}