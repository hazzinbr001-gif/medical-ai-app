package com.yourapp.medassist.engine.triage

object HospitalReferralEngine {

    fun shouldRefer(triageLevel: String): Boolean {

        return when (triageLevel) {

            "EMERGENCY" -> true

            "URGENT" -> true

            else -> false

        }

    }

    fun referralMessage(triageLevel: String): String {

        return when (triageLevel) {

            "EMERGENCY" ->
                "Immediate hospital care recommended. Seek emergency medical attention."

            "URGENT" ->
                "Medical evaluation recommended within 24 hours."

            else ->
                "Hospital referral not required."

        }

    }

}