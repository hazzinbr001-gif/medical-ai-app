object SymptomDiseaseMap {

    val symptomToDiseases = mapOf(

        "SYM_CHEST_PAIN" to listOf(
            "DIS_MYOCARDIAL_INFARCTION",
            "DIS_ANGINA",
            "DIS_GERD",
            "DIS_COSTOCHONDRITIS",
            "DIS_PNEUMONIA"
        ),

        "SYM_COUGH" to listOf(
            "DIS_PNEUMONIA",
            "DIS_TUBERCULOSIS",
            "DIS_ASTHMA",
            "DIS_BRONCHITIS",
            "DIS_COVID19"
        ),

        "SYM_FEVER" to listOf(
            "DIS_MALARIA",
            "DIS_PNEUMONIA",
            "DIS_TYPHOID",
            "DIS_MENINGITIS",
            "DIS_URINARY_TRACT_INFECTION"
        ),

        "SYM_HEADACHE" to listOf(
            "DIS_MIGRAINE",
            "DIS_TENSION_HEADACHE",
            "DIS_MENINGITIS",
            "DIS_HYPERTENSION"
        ),

        "SYM_ABDOMINAL_PAIN" to listOf(
            "DIS_APPENDICITIS",
            "DIS_GASTRITIS",
            "DIS_PEPTIC_ULCER",
            "DIS_PANCREATITIS",
            "DIS_GASTROENTERITIS"
        )

    )

}