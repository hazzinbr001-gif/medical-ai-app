package com.yourapp.medassist.engine.treatment

object SeverityTreatmentAdjuster {

    fun adjustTreatment(

        disease: String,
        severity: String

    ): String {

        return when (severity.lowercase()) {

            "mild" ->
                "Outpatient treatment recommended for $disease"

            "moderate" ->
                "Consider stronger therapy or observation for $disease"

            "severe" ->
                "Hospital treatment recommended for $disease"

            "critical" ->
                "Emergency intervention required for $disease"

            else ->
                "Severity not recognized"

        }

    }

}