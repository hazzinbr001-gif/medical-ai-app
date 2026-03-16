package com.yourapp.medassist.engine.intelligence

data class MedicalRelation(
    val symptom: String,
    val disease: String
)

object MedicalKnowledgeGraphAI {

    private val relations = mutableListOf<MedicalRelation>()

    fun addRelation(
        symptom: String,
        disease: String
    ) {

        relations.add(
            MedicalRelation(symptom.lowercase(), disease)
        )

    }

    fun findDiseases(symptom: String): List<String> {

        return relations.filter {

            it.symptom == symptom.lowercase()

        }.map { it.disease }

    }

}