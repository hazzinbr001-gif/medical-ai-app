package com.yourapp.medassist.engine.learning

object CaseLearningEngine {

    data class MedicalCase(

        val symptoms: List<String>,
        val diagnosedDisease: String

    )

    private val caseDatabase = mutableListOf<MedicalCase>()

    fun recordCase(

        symptoms: List<String>,
        diagnosedDisease: String

    ) {

        val newCase = MedicalCase(
            symptoms = symptoms,
            diagnosedDisease = diagnosedDisease
        )

        caseDatabase.add(newCase)

    }

    fun similarCases(symptoms: List<String>): List<MedicalCase> {

        val matches = mutableListOf<Pair<MedicalCase, Int>>()

        for (case in caseDatabase) {

            val overlap = case.symptoms.intersect(symptoms).size

            if (overlap > 0) {

                matches.add(Pair(case, overlap))

            }

        }

        return matches
            .sortedByDescending { it.second }
            .map { it.first }

    }

    fun diseaseFrequency(): Map<String, Int> {

        val freq = mutableMapOf<String, Int>()

        for (case in caseDatabase) {

            val count = freq[case.diagnosedDisease] ?: 0
            freq[case.diagnosedDisease] = count + 1

        }

        return freq

    }

}