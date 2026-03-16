package com.yourapp.medassist.engine.intelligence

object ClinicalUncertaintyEngine {

    fun evaluateConfidence(probability: Double): String {

        return when {

            probability >= 0.8 -> "High confidence diagnosis"

            probability >= 0.5 -> "Moderate confidence diagnosis"

            probability >= 0.3 -> "Low confidence diagnosis"

            else -> "Uncertain diagnosis — more information required"

        }

    }

    fun recommendNextStep(probability: Double): String {

        return when {

            probability >= 0.8 -> "Proceed with treatment protocol"

            probability >= 0.5 -> "Recommend confirmatory tests"

            else -> "Request more symptoms or diagnostics"

        }

    }

}