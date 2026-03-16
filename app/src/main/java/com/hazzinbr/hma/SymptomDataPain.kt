object SymptomDataPain {

    val headache = Symptom(

        code = "SYM_HEADACHE",

        primaryName = "Headache",

        synonyms = listOf(
            "head pain",
            "pain in the head"
        ),

        description = "Pain located in the head region.",

        bodyRegion = SymptomRegions.HEAD,

        system = "Neurological",

        severityScale = true,

        socratesApplicable = true,

        associatedSymptoms = listOf(
            "SYM_NAUSEA"
        ),

        reliefMedications = listOf(
            "Paracetamol",
            "Ibuprofen"
        )
    )

}