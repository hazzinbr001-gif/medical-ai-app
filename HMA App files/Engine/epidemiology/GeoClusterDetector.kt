package com.yourapp.medassist.engine.epidemiology

data class GeoCase(
    val disease: String,
    val latitude: Double,
    val longitude: Double
)

object GeoClusterDetector {

    private val cases = mutableListOf<GeoCase>()

    fun addCase(
        disease: String,
        latitude: Double,
        longitude: Double
    ) {
        cases.add(GeoCase(disease, latitude, longitude))
    }

    fun detectClusters(radius: Double = 0.05): Map<String, Int> {

        val clusters = mutableMapOf<String, Int>()

        for (case in cases) {

            val count = cases.count {

                it.disease == case.disease &&
                distance(case, it) <= radius

            }

            if (count >= 5) {

                clusters[case.disease] =
                    clusters.getOrDefault(case.disease, 0) + 1

            }

        }

        return clusters
    }

    private fun distance(a: GeoCase, b: GeoCase): Double {

        val dx = a.latitude - b.latitude
        val dy = a.longitude - b.longitude

        return Math.sqrt(dx * dx + dy * dy)
    }

}