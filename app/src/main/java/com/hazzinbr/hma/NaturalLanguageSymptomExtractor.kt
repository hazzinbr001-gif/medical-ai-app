package com.yourapp.medassist.engine.nlp

import com.yourapp.medassist.engine.input.SymptomInputProcessor

object NaturalLanguageSymptomExtractor {

    data class ExtractionResult(

        val extractedSymptoms: List<String>,
        val correctedInputs: List<String>,
        val unknownInputs: List<String>

    )

    fun extract(sentence: String): ExtractionResult {

        val cleaned = sentence
            .lowercase()
            .replace(",", " ")
            .replace(".", " ")
            .replace("!", " ")
            .replace("?", " ")

        val words = cleaned.split(" ")

        val possibleSymptoms = mutableListOf<String>()

        // Build 1-word, 2-word and 3-word phrases
        for (i in words.indices) {

            val one = words[i]

            if (one.isNotBlank()) {
                possibleSymptoms.add(one)
            }

            if (i < words.size - 1) {
                val two = words[i] + " " + words[i + 1]
                possibleSymptoms.add(two)
            }

            if (i < words.size - 2) {
                val three = words[i] + " " + words[i + 1] + " " + words[i + 2]
                possibleSymptoms.add(three)
            }

        }

        val processed = SymptomInputProcessor.process(possibleSymptoms)

        return ExtractionResult(

            extractedSymptoms = processed.normalizedSymptoms.distinct(),
            correctedInputs = processed.correctedSymptoms,
            unknownInputs = processed.unknownSymptoms

        )

    }

}