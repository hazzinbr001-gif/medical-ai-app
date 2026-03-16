package com.yourapp.medassist.engine.drugs

import com.yourapp.medassist.source.drugs.Drug

object DrugSafetyChecker {

    fun checkContraindications(
        drug: Drug,
        patientConditions: List<String>
    ): List<String> {

        val warnings = mutableListOf<String>()

        val contraindications = drug.contraindications.lowercase()

        patientConditions.forEach { condition ->

            if (contraindications.contains(condition.lowercase())) {

                warnings.add(
                    "⚠ ${drug.name} may be unsafe for patients with $condition"
                )

            }

        }

        return warnings

    }

}