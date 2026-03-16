package com.yourapp.medassist.engine.diagnostic

object ComorbidityAnalyzer {

    data class ComorbidityResult(

        val primaryDisease: String,
        val associatedDiseases: List<String>

    )

    private val comorbidityMap = mapOf(

        "DIS_DIABETES_TYPE_2" to listOf(
            "DIS_HYPERTENSION",
            "DIS_HEART_FAILURE",
            "DIS_STROKE"
        ),

        "DIS_HYPERTENSION" to listOf(
            "DIS_DIABETES_TYPE_2",
            "DIS_HEART_FAILURE",
            "DIS_STROKE"
        ),

        "DIS_ASTHMA" to listOf(
            "DIS_ALLERGIC_RHINITIS",
            "DIS_SINUSITIS"
        ),

        "DIS_HEART_FAILURE" to listOf(
            "DIS_HYPERTENSION",
            "DIS_MYOCARDIAL_INFARCTION",
            "DIS_CHRONIC_KIDNEY_DISEASE"
        ),

        "DIS_PNEUMONIA" to listOf(
            "DIS_SEPSIS",
            "DIS_RESPIRATORY_FAILURE"
        )

    )

    fun analyze(topDiseases: List<String>): List<ComorbidityResult> {

        val results = mutableListOf<ComorbidityResult>()

        for (disease in topDiseases) {

            val associated = comorbidityMap[disease]

            if (associated != null) {

                val detected = associated.filter { topDiseases.contains(it) }

                if (detected.isNotEmpty()) {

                    results.add(
                        ComorbidityResult(
                            primaryDisease = disease,
                            associatedDiseases = detected
                        )
                    )

                }

            }

        }

        return results

    }

}