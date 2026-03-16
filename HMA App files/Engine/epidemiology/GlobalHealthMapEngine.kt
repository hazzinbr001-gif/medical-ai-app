package com.yourapp.medassist.engine.epidemiology

data class HealthMapPoint(
    val disease: String,
    val latitude: Double,
    val longitude: Double,
    val cases: Int
)

object GlobalHealthMapEngine {

    private val mapPoints = mutableListOf<HealthMapPoint>()

    fun updateMap(
        disease: String,
        latitude: Double,
        longitude: Double,
        cases: Int
    ) {

        mapPoints.add(
            HealthMapPoint(
                disease,
                latitude,
                longitude,
                cases
            )
        )

    }

    fun getDiseaseMap(disease: String): List<HealthMapPoint> {

        return mapPoints.filter {

            it.disease.equals(disease, ignoreCase = true)

        }

    }

}