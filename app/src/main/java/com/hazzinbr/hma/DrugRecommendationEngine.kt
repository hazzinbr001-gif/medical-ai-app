package com.yourapp.medassist.engine.drugs

import com.yourapp.medassist.source.drugs.Drug
import com.yourapp.medassist.source.drugs.DrugDatabase

object DrugRecommendationEngine {

    fun recommendDrugs(
        disease: String
    ): List<Drug> {

        return DrugDatabase.drugs.filter {

            it.diseasesTreated.any { treated ->
                treated.equals(disease, ignoreCase = true)
            }

        }

    }

}