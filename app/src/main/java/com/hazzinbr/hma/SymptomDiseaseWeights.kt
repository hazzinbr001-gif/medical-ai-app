object SymptomDiseaseWeights {

    val weights = mapOf(

        "SYM_CHEST_PAIN" to mapOf(
            "DIS_MYOCARDIAL_INFARCTION" to 10,
            "DIS_ANGINA" to 9,
            "DIS_GERD" to 4,
            "DIS_COSTOCHONDRITIS" to 5
        ),

        "SYM_SHORTNESS_OF_BREATH" to mapOf(
            "DIS_MYOCARDIAL_INFARCTION" to 8,
            "DIS_PNEUMONIA" to 7,
            "DIS_ASTHMA" to 9
        ),

        "SYM_FEVER" to mapOf(
            "DIS_MALARIA" to 9,
            "DIS_TYPHOID" to 7,
            "DIS_PNEUMONIA" to 6
        ),

        "SYM_HEADACHE" to mapOf(
            "DIS_MIGRAINE" to 9,
            "DIS_TENSION_HEADACHE" to 8,
            "DIS_MENINGITIS" to 7
        )

    )

}