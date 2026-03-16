package com.yourapp.medassist.engine.drugs

import com.yourapp.medassist.source.drugs.Drug
import com.yourapp.medassist.source.drugs.DrugDatabase

object DrugAlternativeFinder {

    fun findAlternatives(

        drug: Drug

    ): List<Drug> {

        return DrugDatabase.drugs.filter {

            it.name != drug.name &&
            it.drugClass.equals(drug.drugClass, ignoreCase = true)

        }

    }

}