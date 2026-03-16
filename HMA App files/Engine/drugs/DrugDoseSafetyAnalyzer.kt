package com.yourapp.medassist.engine.drugs

object DrugDoseSafetyAnalyzer {

    fun checkDose(
        dose: String,
        age: Int
    ): String {

        if (age < 12) {

            return "⚠ Pediatric dose adjustment required"

        }

        if (age > 65) {

            return "⚠ Consider geriatric dose reduction"

        }

        return "Dose appears acceptable"

    }

}