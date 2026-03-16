package com.yourapp.medassist.engine.analytics

object AgeRiskModifier {

    enum class AgeGroup {

        INFANT,
        CHILD,
        ADOLESCENT,
        ADULT,
        ELDERLY

    }

    data class AgeRiskAdjustment(

        val ageGroup: AgeGroup,
        val riskModifiers: Map<String, Int>

    )

    fun classify(age: Int): AgeGroup {

        return when {

            age < 1 -> AgeGroup.INFANT
            age in 1..12 -> AgeGroup.CHILD
            age in 13..17 -> AgeGroup.ADOLESCENT
            age in 18..64 -> AgeGroup.ADULT
            else -> AgeGroup.ELDERLY

        }

    }

    fun modifiers(age: Int): AgeRiskAdjustment {

        val group = classify(age)

        val modifier = when (group) {

            AgeGroup.INFANT -> mapOf(
                "DIS_SEPSIS" to 5,
                "DIS_PNEUMONIA" to 4,
                "DIS_MENINGITIS" to 5
            )

            AgeGroup.CHILD -> mapOf(
                "DIS_ASTHMA" to 4,
                "DIS_OTITIS_MEDIA" to 4,
                "DIS_PNEUMONIA" to 3
            )

            AgeGroup.ADOLESCENT -> mapOf(
                "DIS_MIGRAINE" to 3,
                "DIS_ASTHMA" to 3
            )

            AgeGroup.ADULT -> mapOf(
                "DIS_HYPERTENSION" to 4,
                "DIS_DIABETES_TYPE_2" to 4,
                "DIS_GASTRITIS" to 3
            )

            AgeGroup.ELDERLY -> mapOf(
                "DIS_STROKE" to 5,
                "DIS_HEART_FAILURE" to 5,
                "DIS_PNEUMONIA" to 4,
                "DIS_MYOCARDIAL_INFARCTION" to 5
            )

        }

        return AgeRiskAdjustment(

            ageGroup = group,
            riskModifiers = modifier

        )

    }

}