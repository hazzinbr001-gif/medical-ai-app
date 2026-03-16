package com.yourapp.medassist.engine.diagnostics

object RadiologyPatternEngine {

    fun detectChestXrayPattern(findings: List<String>): String {

        return when {

            findings.contains("ground glass opacity") ->
                "Possible viral pneumonia"

            findings.contains("lobar consolidation") ->
                "Possible bacterial pneumonia"

            findings.contains("cardiomegaly") ->
                "Possible heart enlargement"

            findings.contains("pleural effusion") ->
                "Fluid accumulation around lungs"

            else ->
                "No specific radiological pattern detected"

        }

    }

}