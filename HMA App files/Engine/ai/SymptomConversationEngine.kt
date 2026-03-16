package com.yourapp.medassist.engine.ai

object SymptomConversationEngine {

    fun askFollowUp(symptoms: List<String>): List<String> {

        val questions = mutableListOf<String>()

        if (symptoms.contains("fever")) {
            questions.add("How high is the fever?")
        }

        if (symptoms.contains("cough")) {
            questions.add("Is the cough dry or producing sputum?")
        }

        if (symptoms.contains("chest pain")) {
            questions.add("Does the chest pain worsen with breathing or movement?")
        }

        if (symptoms.contains("headache")) {
            questions.add("Is the headache severe or persistent?")
        }

        return questions
    }

}