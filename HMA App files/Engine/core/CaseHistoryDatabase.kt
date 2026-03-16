package com.yourapp.medassist.engine.system

data class MedicalCase(
    val symptoms: List<String>,
    val diagnosis: String
)

object CaseHistoryDatabase {

    private val cases = mutableListOf<MedicalCase>()

    fun saveCase(
        symptoms: List<String>,
        diagnosis: String
    ) {

        cases.add(
            MedicalCase(
                symptoms,
                diagnosis
            )
        )

    }

    fun getAllCases(): List<MedicalCase> {

        return cases

    }

}