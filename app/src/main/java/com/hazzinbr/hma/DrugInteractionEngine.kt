package com.yourapp.medassist.engine.drugs

import com.yourapp.medassist.source.drugs.Drug

object DrugInteractionEngine {

    fun checkInteractions(
        drugs: List<Drug>
    ): List<String> {

        val warnings = mutableListOf<String>()

        for (i in drugs.indices) {

            for (j in i + 1 until drugs.size) {

                val drugA = drugs[i]
                val drugB = drugs[j]

                if (
                    drugA.drugInteractions.lowercase()
                        .contains(drugB.name.lowercase())
                ) {

                    warnings.add(
                        "⚠ Interaction detected: ${drugA.name} + ${drugB.name}"
                    )

                }

            }

        }

        return warnings

    }

}