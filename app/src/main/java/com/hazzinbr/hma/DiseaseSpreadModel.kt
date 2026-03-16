package com.yourapp.medassist.engine.epidemiology

object DiseaseSpreadModel {

    fun estimateSpread(
        infected: Int,
        reproductionRate: Double,
        days: Int
    ): Int {

        var total = infected.toDouble()

        repeat(days) {
            total *= reproductionRate
        }

        return total.toInt()
    }

}