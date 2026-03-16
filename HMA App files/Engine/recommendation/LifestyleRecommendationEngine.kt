package com.yourapp.medassist.engine.recommendation

object LifestyleRecommendationEngine {

    data class LifestylePlan(

        val diseaseId: String,
        val diet: List<String>,
        val activity: List<String>,
        val habits: List<String>,
        val monitoring: List<String>

    )

    private val lifestyleMap = mapOf(

        "DIS_HYPERTENSION" to LifestylePlan(
            diseaseId = "DIS_HYPERTENSION",
            diet = listOf(
                "Reduce salt intake",
                "Increase fruits and vegetables",
                "Limit processed foods"
            ),
            activity = listOf(
                "30 minutes of daily walking",
                "Regular aerobic exercise"
            ),
            habits = listOf(
                "Stop smoking",
                "Limit alcohol intake",
                "Manage stress"
            ),
            monitoring = listOf(
                "Regular blood pressure checks"
            )
        ),

        "DIS_DIABETES_TYPE_2" to LifestylePlan(
            diseaseId = "DIS_DIABETES_TYPE_2",
            diet = listOf(
                "Low sugar diet",
                "Control carbohydrate intake",
                "High fiber foods"
            ),
            activity = listOf(
                "Daily walking",
                "Weight management exercise"
            ),
            habits = listOf(
                "Maintain healthy body weight",
                "Avoid sugary drinks"
            ),
            monitoring = listOf(
                "Regular blood glucose monitoring",
                "Routine HbA1c testing"
            )
        ),

        "DIS_GASTRITIS" to LifestylePlan(
            diseaseId = "DIS_GASTRITIS",
            diet = listOf(
                "Avoid spicy foods",
                "Avoid acidic foods",
                "Eat smaller frequent meals"
            ),
            activity = listOf(
                "Light daily activity"
            ),
            habits = listOf(
                "Avoid alcohol",
                "Stop smoking",
                "Reduce stress"
            ),
            monitoring = listOf(
                "Monitor symptoms after meals"
            )
        ),

        "DIS_ASTHMA" to LifestylePlan(
            diseaseId = "DIS_ASTHMA",
            diet = listOf(
                "Maintain balanced nutrition"
            ),
            activity = listOf(
                "Regular light exercise",
                "Breathing exercises"
            ),
            habits = listOf(
                "Avoid dust and smoke",
                "Avoid known triggers"
            ),
            monitoring = listOf(
                "Peak flow monitoring"
            )
        ),

        "DIS_HEART_FAILURE" to LifestylePlan(
            diseaseId = "DIS_HEART_FAILURE",
            diet = listOf(
                "Low salt diet",
                "Fluid restriction if advised"
            ),
            activity = listOf(
                "Moderate physical activity as tolerated"
            ),
            habits = listOf(
                "Stop smoking",
                "Limit alcohol"
            ),
            monitoring = listOf(
                "Daily weight monitoring",
                "Monitor swelling and breathlessness"
            )
        )

    )

    fun recommend(diseaseId: String): LifestylePlan? {

        return lifestyleMap[diseaseId]

    }

}