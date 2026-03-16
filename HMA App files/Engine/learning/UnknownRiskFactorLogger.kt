package com.yourapp.medassist.engine.learning

object UnknownRiskFactorLogger {

    private val unknownRiskFactors = mutableSetOf<String>()

    fun log(riskFactor: String) {

        val normalized = riskFactor.lowercase().trim()

        if (normalized.isNotEmpty()) {

            unknownRiskFactors.add(normalized)

        }

    }

    fun getAll(): List<String> {

        return unknownRiskFactors.toList()

    }

    fun clear() {

        unknownRiskFactors.clear()

    }

}