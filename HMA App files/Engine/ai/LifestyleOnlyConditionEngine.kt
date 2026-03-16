package com.yourapp.medassist.engine.ai

object LifestyleOnlyConditionEngine {

    private val lifestyleConditions = mapOf(

        "Common Cold" to
            "Rest, hydration, warm fluids, vitamin‑rich diet. Usually resolves in 5–7 days.",

        "Mild Dehydration" to
            "Increase water intake and oral rehydration.",

        "Mild Tension Headache" to
            "Rest, hydration, stress reduction, sleep.",

        "Jet Lag" to
            "Adjust sleep schedule and hydration.",

        "Fatigue from Lack of Sleep" to
            "Sleep 7–9 hours and maintain regular sleep schedule."

    )

    fun checkCondition(disease: String): String? {

        return lifestyleConditions[disease]

    }

}