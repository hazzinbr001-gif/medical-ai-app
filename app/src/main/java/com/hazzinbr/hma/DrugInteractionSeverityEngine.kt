package com.yourapp.medassist.engine.drugs

object DrugInteractionSeverityEngine {

    fun getSeverity(

        interactionText: String

    ): String {

        val text = interactionText.lowercase()

        return when {

            text.contains("avoid") -> "SEVERE"

            text.contains("contraindicated") -> "SEVERE"

            text.contains("major") -> "HIGH"

            text.contains("moderate") -> "MODERATE"

            text.contains("minor") -> "LOW"

            else -> "UNKNOWN"

        }

    }

}