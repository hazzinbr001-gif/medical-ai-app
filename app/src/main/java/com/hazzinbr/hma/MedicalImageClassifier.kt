package com.yourapp.medassist.engine.diagnostics

object MedicalImageClassifier {

    fun classifyImage(type: String): String {

        return when (type.lowercase()) {

            "xray" -> "Radiology image detected"

            "ct" -> "Computed tomography scan"

            "mri" -> "Magnetic resonance imaging"

            "ultrasound" -> "Ultrasound diagnostic image"

            else -> "Unknown medical imaging type"

        }

    }

}