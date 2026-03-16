package com.yourapp.medassist.engine.drugs

import com.yourapp.medassist.source.drugs.Drug
import com.yourapp.medassist.source.drugs.DrugDatabase

object DrugSearchEngine {

    fun searchByDisease(

        disease: String

    ): List<Drug> {

        return DrugDatabase.drugs.filter {

            it.diseasesTreated.any { d ->
                d.equals(disease, ignoreCase = true)
            }

        }

    }

    fun searchByName(

        drugName: String

    ): Drug? {

        return DrugDatabase.drugs.find {

            it.name.equals(drugName, ignoreCase = true) ||

            it.genericNames.any { g ->
                g.equals(drugName, ignoreCase = true)
            }

        }

    }

}