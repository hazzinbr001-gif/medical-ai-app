package com.yourapp.medassist.engine.knowledge

object EvidenceBasedMedicineEngine {

    private val evidenceLevels = mapOf(

        "Systematic Review" to "LEVEL 1",
        "Randomized Controlled Trial" to "LEVEL 2",
        "Cohort Study" to "LEVEL 3",
        "Case Control Study" to "LEVEL 4",
        "Expert Opinion" to "LEVEL 5"

    )

    fun getEvidenceLevel(studyType: String): String {

        return evidenceLevels[studyType]
            ?: "UNKNOWN EVIDENCE LEVEL"

    }

}