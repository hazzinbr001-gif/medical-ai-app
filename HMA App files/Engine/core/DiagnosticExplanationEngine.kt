package com.yourapp.medassist.engine.core

object DiagnosticExplanationEngine {

    fun explain(

        disease: String,
        matchedSymptoms: List<String>

    ): String {

        return """
            The diagnosis of $disease was suggested because the following symptoms were detected:
            
            ${matchedSymptoms.joinToString(", ")}
            
            These symptoms are commonly associated with this condition.
        """.trimIndent()

    }

}