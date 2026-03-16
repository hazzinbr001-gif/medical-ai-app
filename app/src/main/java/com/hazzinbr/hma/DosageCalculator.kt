package com.yourapp.medassist.engine.drugs

object DosageCalculator {

    fun calculateDose(

        baseDose: String,
        age: Int,
        weight: Double

    ): String {

        if (age < 12) {

            return "Pediatric dose required (weight‑based). Suggested: ${weight * 10} mg"

        }

        if (age > 65) {

            return "Reduced geriatric dose recommended: $baseDose (consider 20% reduction)"

        }

        return baseDose

    }

}