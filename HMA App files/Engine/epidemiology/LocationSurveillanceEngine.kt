package com.yourapp.medassist.engine.epidemiology

data class CaseReport(
    val disease: String,
    val latitude: Double,
    val longitude: Double
)

object LocationSurveillanceEngine {

    private val reports = mutableListOf<CaseReport>()

    fun reportCase(
        disease: String,
        latitude: Double,
        longitude: Double
    ) {

        reports.add(
            CaseReport(
                disease,
                latitude,
                longitude
            )
        )

    }

    fun getCasesByDisease(disease: String): List<CaseReport> {

        return reports.filter {
            it.disease.equals(disease, ignoreCase = true)
        }

    }

    fun detectHotspots(): Map<String, Int> {

        val diseaseCounts = mutableMapOf<String, Int>()

        reports.forEach {

            diseaseCounts[it.disease] =
                diseaseCounts.getOrDefault(it.disease, 0) + 1

        }

        return diseaseCounts

    }

}