package com.yourapp.medassist.engine.diagnostics

object BiomarkerAnalyzer {

    fun analyzeCRP(value: Double): String {

        return when {

            value > 100 -> "Severe inflammation or infection"

            value > 10 -> "Moderate inflammation"

            else -> "CRP normal"

        }

    }

    fun analyzeTroponin(value: Double): String {

        return when {

            value > 0.04 -> "Possible cardiac injury"

            else -> "Troponin normal"

        }

    }

    fun analyzeD_dimer(value: Double): String {

        return when {

            value > 0.5 -> "Possible clotting disorder"

            else -> "D-dimer normal"

        }

    }

}