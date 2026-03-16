package com.yourapp.medassist.source.risk

object RiskFactorDatabase {

    private val riskFactors = mapOf(

        "Smoking" to listOf(
            "Lung Cancer",
            "Chronic Bronchitis",
            "COPD",
            "Heart Disease"
        ),

        "Obesity" to listOf(
            "Type 2 Diabetes",
            "Hypertension",
            "Heart Disease"
        ),

        "Diabetes" to listOf(
            "Kidney Disease",
            "Neuropathy",
            "Cardiovascular Disease"
        ),

        "Hypertension" to listOf(
            "Stroke",
            "Heart Failure",
            "Kidney Disease"
        ),

        "Alcohol Use" to listOf(
            "Liver Disease",
            "Pancreatitis",
            "Hypertension"
        )

    )

    fun getRiskDiseases(riskFactor: String): List<String> {

        return riskFactors[riskFactor] ?: emptyList()

    }

    fun getAllRiskFactors(): List<String> {

        return riskFactors.keys.toList()

    }

}