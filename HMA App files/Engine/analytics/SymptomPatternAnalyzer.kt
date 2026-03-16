package com.yourapp.medassist.engine.analytics

import com.yourapp.medassist.source.symptoms.SymptomIndex

object SymptomPatternAnalyzer {

    data class SymptomCluster(

        val name: String,
        val symptoms: List<String>,
        val possibleSystems: List<String>

    )

    data class PatternMatch(

        val cluster: String,
        val matchedSymptoms: List<String>,
        val matchScore: Int

    )

    private val clusters = listOf(

        SymptomCluster(
            name = "Cardiac Cluster",
            symptoms = listOf(
                SymptomIndex.CHEST_PAIN,
                SymptomIndex.RADIATING_ARM_PAIN,
                SymptomIndex.SHORTNESS_OF_BREATH,
                SymptomIndex.SWEATING
            ),
            possibleSystems = listOf("Cardiovascular")
        ),

        SymptomCluster(
            name = "Respiratory Cluster",
            symptoms = listOf(
                SymptomIndex.COUGH,
                SymptomIndex.SHORTNESS_OF_BREATH,
                SymptomIndex.WHEEZING,
                SymptomIndex.CHEST_TIGHTNESS
            ),
            possibleSystems = listOf("Respiratory")
        ),

        SymptomCluster(
            name = "Neurological Cluster",
            symptoms = listOf(
                SymptomIndex.WEAKNESS,
                SymptomIndex.NUMBNESS,
                SymptomIndex.SPEECH_DIFFICULTY,
                SymptomIndex.VISION_LOSS
            ),
            possibleSystems = listOf("Neurological")
        ),

        SymptomCluster(
            name = "Migraine Cluster",
            symptoms = listOf(
                SymptomIndex.HEADACHE,
                SymptomIndex.NAUSEA,
                SymptomIndex.PHOTOPHOBIA
            ),
            possibleSystems = listOf("Neurological")
        ),

        SymptomCluster(
            name = "Gastrointestinal Cluster",
            symptoms = listOf(
                SymptomIndex.ABDOMINAL_PAIN,
                SymptomIndex.NAUSEA,
                SymptomIndex.VOMITING,
                SymptomIndex.BLOATING
            ),
            possibleSystems = listOf("Gastrointestinal")
        )

    )

    fun analyze(symptoms: List<String>): List<PatternMatch> {

        val matches = mutableListOf<PatternMatch>()

        for (cluster in clusters) {

            val matched = symptoms.filter { cluster.symptoms.contains(it) }

            if (matched.isNotEmpty()) {

                val score = (matched.size.toDouble() / cluster.symptoms.size * 100).toInt()

                matches.add(
                    PatternMatch(
                        cluster = cluster.name,
                        matchedSymptoms = matched,
                        matchScore = score
                    )
                )

            }

        }

        return matches.sortedByDescending { it.matchScore }

    }

}