package com.yourapp.medassist.engine.drugs

import com.yourapp.medassist.source.drugs.Drug

object TherapeuticClassEngine {

    fun classify(drug: Drug): String {

        val className = drug.drugClass.lowercase()

        return when {

            className.contains("antibiotic") -> "Antibiotic"

            className.contains("antiviral") -> "Antiviral"

            className.contains("antifungal") -> "Antifungal"

            className.contains("analgesic") -> "Pain Management"

            className.contains("antipyretic") -> "Fever Control"

            else -> "General Therapeutic"

        }

    }

}