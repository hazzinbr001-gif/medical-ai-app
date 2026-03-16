package com.yourapp.medassist.source.drugs

data class Drug(

    val name: String,

    val genericNames: List<String>,

    val drugClass: String,

    val category: String,

    val function: String,

    val modeOfAction: String,

    val dosage: String,

    val contraindications: String,

    val whoShouldNotUse: String,

    val sideEffects: String,

    val drugInteractions: String,

    val diseasesTreated: List<String>

)

fun findDrugsForDisease(disease: String): List<Drug> {

    return drugs.filter {

        it.diseasesTreated.any { d ->
            d.equals(disease, ignoreCase = true)
        }

    }

}