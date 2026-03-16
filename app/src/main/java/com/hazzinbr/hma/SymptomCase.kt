package com.yourapp.medassist.engine.diagnosis

data class SymptomCase(

    val symptomId: String,

    val region: String? = null,

    val severity: Int? = null,

    val duration: String? = null,

    val onset: String? = null,

    val character: String? = null,

    val radiation: String? = null,

    val aggravatingFactors: List<String> = emptyList(),

    val relievingFactors: List<String> = emptyList(),

    val associatedSymptoms: List<String> = emptyList()

)