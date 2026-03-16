package com.yourapp.medassist.engine.treatment

object ClinicalGuidelineEngine {

    private val guidelines = mapOf(

        "Malaria" to
            "Confirm with rapid diagnostic test. First line: Artemisinin Combination Therapy.",

        "Pneumonia" to
            "Assess severity. Mild: Oral antibiotics. Severe: Hospital admission and IV antibiotics.",

        "Hypertension" to
            "Lifestyle modification first. If persistent: ACE inhibitors, ARBs, or Calcium channel blockers.",

        "Diabetes" to
            "Lifestyle changes. First-line medication: Metformin unless contraindicated.",

        "Peptic Ulcer Disease" to
            "Triple therapy: PPI + Amoxicillin + Clarithromycin or Metronidazole."

    )

    fun getGuideline(
        disease: String
    ): String {

        return guidelines[disease]
            ?: "No guideline available for this condition."

    }

}