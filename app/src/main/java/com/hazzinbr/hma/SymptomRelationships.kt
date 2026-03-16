object SymptomRelationships {

    val relationships: Map<String, List<String>> = mapOf(

        "SYM_CHEST_PAIN" to listOf(
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_PALPITATIONS",
            "SYM_SWEATING",
            "SYM_DIZZINESS",
            "SYM_NAUSEA"
        ),

        "SYM_SHORTNESS_OF_BREATH" to listOf(
            "SYM_CHEST_PAIN",
            "SYM_COUGH",
            "SYM_WHEEZING",
            "SYM_FATIGUE"
        ),

        "SYM_FEVER" to listOf(
            "SYM_CHILLS",
            "SYM_SWEATING",
            "SYM_HEADACHE",
            "SYM_FATIGUE",
            "SYM_BODY_ACHES"
        ),

        "SYM_HEADACHE" to listOf(
            "SYM_DIZZINESS",
            "SYM_NAUSEA",
            "SYM_PHOTOPHOBIA",
            "SYM_BLURRED_VISION"
        ),

        "SYM_ABDOMINAL_PAIN" to listOf(
            "SYM_NAUSEA",
            "SYM_VOMITING",
            "SYM_DIARRHEA",
            "SYM_CONSTIPATION",
            "SYM_FEVER"
        ),

        "SYM_COUGH" to listOf(
            "SYM_FEVER",
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_CHEST_PAIN",
            "SYM_SPUTUM"
        ),

        "SYM_DIZZINESS" to listOf(
            "SYM_FAINTING",
            "SYM_HEADACHE",
            "SYM_BLURRED_VISION"
        ),

        "SYM_PALPITATIONS" to listOf(
            "SYM_DIZZINESS",
            "SYM_SHORTNESS_OF_BREATH",
            "SYM_CHEST_PAIN"
        ),

        "SYM_JOINT_PAIN" to listOf(
            "SYM_SWELLING",
            "SYM_STIFFNESS",
            "SYM_FEVER"
        ),

        "SYM_BACK_PAIN" to listOf(
            "SYM_MUSCLE_PAIN",
            "SYM_LEG_PAIN",
            "SYM_NUMBNESS"
        )

    )

}