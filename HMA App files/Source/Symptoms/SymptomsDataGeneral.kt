
object SymptomDataGeneral {

    val fever = Symptom(

        code = "SYM_FEVER",

        primaryName = "Fever",

        synonyms = listOf(
            "high temperature",
            "hot body",
            "pyrexia"
        ),

        description = "Elevation of body temperature above the normal range.",

        bodyRegion = SymptomRegions.GENERAL,

        system = "General",

        severityScale = false,

        socratesApplicable = false,

        associatedSymptoms = listOf(
            "SYM_HEADACHE",
            "SYM_FATIGUE"
        ),

        reliefMedications = listOf(
            "Paracetamol",
            "Ibuprofen"
        )
    )


    val fatigue = Symptom(

        code = "SYM_FATIGUE",

        primaryName = "Fatigue",

        synonyms = listOf(
            "tiredness",
            "weakness",
            "lack of energy"
        ),

        description = "A feeling of extreme tiredness or lack of energy.",

        bodyRegion = SymptomRegions.GENERAL,

        system = "General",

        severityScale = false,

        socratesApplicable = false,

        associatedSymptoms = listOf(),

        reliefMedications = listOf()
    )



val fever = Symptom(

    code = "SYM_FEVER",

    primaryName = "Fever",

    synonyms = listOf(
        "high temperature",
        "hot body",
        "pyrexia"
    ),

    description = "Elevation of body temperature above normal range.",

    bodyRegion = SymptomRegions.GENERAL,

    system = "General",

    severityScale = false,

    socratesApplicable = false,

    associatedSymptoms = listOf(
        "SYM_HEADACHE",
        "SYM_FATIGUE"
    ),

    reliefMedications = listOf(
        "Paracetamol",
        "Ibuprofen"
    )
)




}