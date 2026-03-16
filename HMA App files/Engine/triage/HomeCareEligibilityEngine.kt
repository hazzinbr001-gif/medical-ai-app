package com.yourapp.medassist.engine.triage

object HomeCareEligibilityEngine {

    fun canManageAtHome(

        triageLevel: String

    ): Boolean {

        return when (triageLevel) {

            "SELF-CARE" -> true

            "NON-URGENT" -> true

            else -> false

        }

    }

    fun homeCareAdvice(): String {

        return """
            Home care recommended:
            
            • Rest adequately
            • Maintain hydration
            • Eat balanced meals
            • Monitor symptoms
            • Seek medical care if symptoms worsen
        """.trimIndent()

    }

}