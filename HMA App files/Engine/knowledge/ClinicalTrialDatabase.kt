package com.yourapp.medassist.engine.knowledge

data class ClinicalTrial(

    val title: String,

    val disease: String,

    val intervention: String,

    val outcome: String,

    val evidenceLevel: String

)

object ClinicalTrialDatabase {

    val trials = listOf(

        ClinicalTrial(
            title = "Metronidazole for Amoebiasis Study",
            disease = "Amoebiasis",
            intervention = "Metronidazole",
            outcome = "High cure rate in intestinal amoebiasis",
            evidenceLevel = "Randomized Controlled Trial"
        ),

        ClinicalTrial(
            title = "Artemisinin Combination Therapy Trial",
            disease = "Malaria",
            intervention = "Artemisinin-based therapy",
            outcome = "Reduced mortality and parasite clearance",
            evidenceLevel = "Randomized Controlled Trial"
        )

    )

    fun findTrialsForDisease(
        disease: String
    ): List<ClinicalTrial> {

        return trials.filter {

            it.disease.equals(disease, ignoreCase = true)

        }

    }

}