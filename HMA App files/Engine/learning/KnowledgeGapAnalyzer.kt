package com.yourapp.medassist.engine.learning

object KnowledgeGapAnalyzer {

    data class KnowledgeGapReport(

        val unknownSymptoms: List<String>,
        val unknownDiseases: List<String>,
        val unknownRiskFactors: List<String>

    )

    fun analyze(): KnowledgeGapReport {

        return KnowledgeGapReport(

            unknownSymptoms = UnknownSymptomLogger.getAll(),

            unknownDiseases = UnknownDiseaseLogger.getAll(),

            unknownRiskFactors = UnknownRiskFactorLogger.getAll()

        )

    }

}