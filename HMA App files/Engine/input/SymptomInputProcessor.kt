package com.yourapp.medassist.engine.input

import com.yourapp.medassist.engine.ai.FuzzySymptomMatcher
import com.yourapp.medassist.engine.learning.UnknownSymptomLogger
import com.yourapp.medassist.source.symptoms.SymptomOntology

object SymptomInputProcessor {

    data class ProcessingResult(

        val normalizedSymptoms: List<String>,
        val correctedSymptoms: List<String>,
        val unknownSymptoms: List<String>

    )

    fun process(userInputs: List<String>): ProcessingResult {

        val normalized = mutableListOf<String>()
        val corrected = mutableListOf<String>()
        val unknown = mutableListOf<String>()

        for (input in userInputs) {

            val exact = SymptomOntology.normalize(input)

            if (exact != null) {

                normalized.add(exact)
                continue

            }

            val fuzzy = FuzzySymptomMatcher.findClosest(input)

            if (fuzzy != null) {

                normalized.add(fuzzy)
                corrected.add(input)
                continue

            }

            UnknownSymptomLogger.log(input)
            unknown.add(input)

        }

        return ProcessingResult(

            normalizedSymptoms = normalized,
            correctedSymptoms = corrected,
            unknownSymptoms = unknown

        )

    }

}