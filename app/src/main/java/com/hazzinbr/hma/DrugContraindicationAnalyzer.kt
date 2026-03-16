package com.yourapp.medassist.engine.drugs

import com.yourapp.medassist.source.drugs.Drug

object DrugContraindicationAnalyzer {

    fun analyze(
        drug: Drug,
        patientConditions: List<String>
    ): List<String> {

        val warnings = mutableListOf<String>()

        patientConditions.forEach { condition ->

            if (drug.contraindications.lowercase()
                    .contains(condition.lowercase())
            ) {

                warnings.add(
                    "⚠ ${drug.name} contraindicated for $condition"
                )

            }

        }

        return warnings

    }

}