package com.yourapp.medassist.engine.admin

import com.yourapp.medassist.engine.learning.UnknownSymptomLogger
import com.yourapp.medassist.engine.learning.UnknownDiseaseLogger
import com.yourapp.medassist.engine.learning.UnknownRiskFactorLogger
import com.yourapp.medassist.source.symptoms.SymptomOntology

object MedicalKnowledgeAdminEngine {

    data class AdminReport(

        val unknownSymptoms: List<String>,
        val unknownDiseases: List<String>,
        val unknownRiskFactors: List<String>

    )

    fun generateReport(): AdminReport {

        return AdminReport(

            unknownSymptoms = UnknownSymptomLogger.getAll(),

            unknownDiseases = UnknownDiseaseLogger.getAll(),

            unknownRiskFactors = UnknownRiskFactorLogger.getAll()

        )

    }

    fun approveSymptom(
        newTerm: String,
        mappedSymptomId: String
    ) {

        SymptomOntology.addSynonym(
            newTerm,
            mappedSymptomId
        )

    }

    fun clearSymptomLogs() {

        UnknownSymptomLogger.clear()

    }

    fun clearDiseaseLogs() {

        UnknownDiseaseLogger.clear()

    }

    fun clearRiskFactorLogs() {

        UnknownRiskFactorLogger.clear()

    }

}