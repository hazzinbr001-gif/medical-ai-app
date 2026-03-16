package com.yourapp.medassist.engine.ai

object GlobalDiseaseSurveillanceEngine {

    private val reportedSymptoms = mutableListOf<List<String>>()

    fun reportCase(symptoms: List<String>) {

        reportedSymptoms.add(symptoms)

    }

    fun detectClusters(): Map<String, Int> {

        val frequency = mutableMapOf<String, Int>()

        reportedSymptoms.forEach { case ->

            case.forEach { symptom ->

                frequency[symptom] =
                    frequency.getOrDefault(symptom, 0) + 1

            }

        }

        return frequency

    }

}