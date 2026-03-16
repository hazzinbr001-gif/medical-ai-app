package com.yourapp.medassist.engine.treatment

object EmergencyDrugEngine {

    private val emergencyDrugs = mapOf(

        "Anaphylaxis" to
            listOf("Epinephrine", "Diphenhydramine", "Hydrocortisone"),

        "Cardiac Arrest" to
            listOf("Epinephrine", "Amiodarone"),

        "Severe Asthma Attack" to
            listOf("Salbutamol", "Ipratropium", "Hydrocortisone"),

        "Severe Malaria" to
            listOf("IV Artesunate"),

        "Septic Shock" to
            listOf("Broad spectrum antibiotics", "Norepinephrine")

    )

    fun getEmergencyDrugs(
        condition: String
    ): List<String> {

        return emergencyDrugs[condition]
            ?: emptyList()

    }

}