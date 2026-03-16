package com.yourapp.medassist.engine.core

object SafetyGuardEngine {

    fun checkSafety(

        confidence: Double

    ): String {

        return when {

            confidence >= 80 ->
                "Diagnosis confidence high. Recommendation acceptable."

            confidence >= 50 ->
                "Moderate confidence. Clinical confirmation recommended."

            else ->
                "Low confidence. Further investigation required."

        }

    }

}