package com.yourapp.medassist.engine.knowledge

object MedicalKnowledgeUpdater {

    private val pendingUpdates = mutableListOf<String>()

    fun reportMissingKnowledge(term: String) {

        if (!pendingUpdates.contains(term)) {

            pendingUpdates.add(term)

        }

    }

    fun getPendingUpdates(): List<String> {

        return pendingUpdates

    }

    fun clearUpdates() {

        pendingUpdates.clear()

    }

}