package com.yourapp.medassist.engine.analytics

object SymptomCoOccurrenceAnalyzer {

    data class CoOccurrenceResult(

        val symptomA: String,
        val symptomB: String,
        val frequencyScore: Int

    )

    private val knownPairs = listOf(

        CoOccurrenceResult(
            symptomA = "SYM_CHEST_PAIN",
            symptomB = "SYM_SHORTNESS_OF_BREATH",
            frequencyScore = 9
        ),

        CoOccurrenceResult(
            symptomA = "SYM_CHEST_PAIN",
            symptomB = "SYM_SWEATING",
            frequencyScore = 8
        ),

        CoOccurrenceResult(
            symptomA = "SYM_HEADACHE",
            symptomB = "SYM_PHOTOPHOBIA",
            frequencyScore = 9
        ),

        CoOccurrenceResult(
            symptomA = "SYM_HEADACHE",
            symptomB = "SYM_NAUSEA",
            frequencyScore = 8
        ),

        CoOccurrenceResult(
            symptomA = "SYM_FEVER",
            symptomB = "SYM_COUGH",
            frequencyScore = 8
        ),

        CoOccurrenceResult(
            symptomA = "SYM_FEVER",
            symptomB = "SYM_CHILLS",
            frequencyScore = 7
        ),

        CoOccurrenceResult(
            symptomA = "SYM_ABDOMINAL_PAIN",
            symptomB = "SYM_VOMITING",
            frequencyScore = 7
        ),

        CoOccurrenceResult(
            symptomA = "SYM_ABDOMINAL_PAIN",
            symptomB = "SYM_NAUSEA",
            frequencyScore = 7
        ),

        CoOccurrenceResult(
            symptomA = "SYM_WEAKNESS",
            symptomB = "SYM_SPEECH_DIFFICULTY",
            frequencyScore = 9
        ),

        CoOccurrenceResult(
            symptomA = "SYM_NUMBNESS",
            symptomB = "SYM_VISION_LOSS",
            frequencyScore = 8
        )

    )

    fun analyze(symptoms: List<String>): List<CoOccurrenceResult> {

        val matches = mutableListOf<CoOccurrenceResult>()

        for (pair in knownPairs) {

            if (
                symptoms.contains(pair.symptomA) &&
                symptoms.contains(pair.symptomB)
            ) {

                matches.add(pair)

            }

        }

        return matches.sortedByDescending { it.frequencyScore }

    }

}