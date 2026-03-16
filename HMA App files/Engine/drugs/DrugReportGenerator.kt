package com.yourapp.medassist.engine.drugs

import com.yourapp.medassist.source.drugs.Drug

object DrugReportGenerator {

    fun generate(drugs: List<Drug>): String {

        val report = StringBuilder()

        report.appendLine("==== DRUG RECOMMENDATION REPORT ====")

        drugs.forEach { drug ->

            report.appendLine("\nDrug: ${drug.name}")
            report.appendLine("Class: ${drug.drugClass}")
            report.appendLine("Dosage: ${drug.dosage}")
            report.appendLine("Function: ${drug.function}")
            report.appendLine("Side Effects: ${drug.sideEffects}")

        }

        return report.toString()

    }

}