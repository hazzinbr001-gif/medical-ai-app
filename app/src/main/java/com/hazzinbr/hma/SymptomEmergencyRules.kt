object SymptomEmergencyRules {

    val emergencyRules: Map<String, List<String>> = mapOf(

        "SYM_CHEST_PAIN" to listOf(
            "Possible Myocardial Infarction",
            "Possible Pulmonary Embolism",
            "Possible Aortic Dissection"
        ),

        "SYM_SHORTNESS_OF_BREATH" to listOf(
            "Possible Acute Asthma Attack",
            "Possible Pulmonary Embolism",
            "Possible Heart Failure"
        ),

        "SYM_SEVERE_HEADACHE" to listOf(
            "Possible Subarachnoid Hemorrhage",
            "Possible Meningitis"
        ),

        "SYM_FAINTING" to listOf(
            "Possible Cardiac Arrhythmia",
            "Possible Shock"
        ),

        "SYM_HIGH_FEVER" to listOf(
            "Possible Sepsis",
            "Possible Severe Infection"
        ),

        "SYM_ABDOMINAL_PAIN_SEVERE" to listOf(
            "Possible Appendicitis",
            "Possible Perforated Ulcer",
            "Possible Ectopic Pregnancy"
        )

    )

}