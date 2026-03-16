package com.yourapp.medassist.model

data class PatientProfile(

    val age: Int,

    val gender: String,

    val symptoms: List<String>,

    val durationDays: Int? = null,

    val severity: String? = null,

    val riskFactors: List<String> = emptyList(),

    val medicalHistory: List<String> = emptyList()

)