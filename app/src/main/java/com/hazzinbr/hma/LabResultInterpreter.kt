package com.yourapp.medassist.engine.diagnostics

object LabResultInterpreter {

    fun interpretHemoglobin(value: Double): String {

        return when {

            value < 8 -> "Severe anemia"

            value < 11 -> "Moderate anemia"

            value < 13 -> "Mild anemia"

            else -> "Hemoglobin normal"

        }

    }

    fun interpretWBC(value: Int): String {

        return when {

            value > 11000 -> "Possible infection or inflammation"

            value < 4000 -> "Possible immune suppression"

            else -> "White blood cell count normal"

        }

    }

    fun interpretPlatelets(value: Int): String {

        return when {

            value < 150000 -> "Thrombocytopenia"

            value > 450000 -> "Possible thrombocytosis"

            else -> "Platelet count normal"

        }

    }

}