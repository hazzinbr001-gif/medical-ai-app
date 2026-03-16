data class Symptom(

    val code: String,

    val primaryName: String,

    val synonyms: List<String>,

    val description: String,

    val bodyRegion: String,

    val system: String,

    val severityScale: Boolean,

    val socratesApplicable: Boolean,

    val emergencyPossible: Boolean,

    val emergencySymptoms: List<String>,

    val associatedSymptoms: List<String>,

    val reliefMedications: List<String>,

    val attributes: List<String>

)