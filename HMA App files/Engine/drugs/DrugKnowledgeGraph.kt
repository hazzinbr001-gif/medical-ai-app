package com.yourapp.medassist.engine.drugs

import com.yourapp.medassist.source.drugs.Drug
import com.yourapp.medassist.source.drugs.DrugDatabase

object DrugKnowledgeGraph {

    fun drugsByClass(drugClass: String): List<Drug> {

        return DrugDatabase.drugs.filter {

            it.drugClass.contains(drugClass, ignoreCase = true)

        }

    }

    fun drugsByCategory(category: String): List<Drug> {

        return DrugDatabase.drugs.filter {

            it.category.equals(category, ignoreCase = true)

        }

    }

    fun drugsTreatingDisease(disease: String): List<Drug> {

        return DrugDatabase.drugs.filter {

            it.diseasesTreated.any { d ->
                d.equals(disease, ignoreCase = true)
            }

        }

    }

}