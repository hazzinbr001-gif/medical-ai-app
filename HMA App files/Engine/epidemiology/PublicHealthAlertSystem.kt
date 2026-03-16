package com.yourapp.medassist.engine.epidemiology

object PublicHealthAlertSystem {

    fun generateAlert(
        disease: String,
        outbreakLevel: String
    ): String {

        return when (outbreakLevel) {

            "Severe outbreak" ->
                "Public health emergency: $disease outbreak severe. Immediate response required."

            "Major outbreak" ->
                "Warning: significant $disease outbreak detected."

            "Possible outbreak" ->
                "Monitoring alert: increase in $disease cases."

            else ->
                "No public health alert."

        }

    }

}