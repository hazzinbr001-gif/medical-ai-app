package com.yourapp.medassist.engine.epidemiology

object VaccinationImpactModel {

    fun calculateHerdImmunityThreshold(
        reproductionNumber: Double
    ): Double {

        return 1 - (1 / reproductionNumber)
    }

    fun estimateProtectedPopulation(
        population: Int,
        vaccinationRate: Double
    ): Int {

        return (population * vaccinationRate).toInt()
    }

}