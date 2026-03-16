package com.yourapp.medassist.engine.diagnostic

import com.yourapp.medassist.engine.analytics.AgeRiskModifier
import com.yourapp.medassist.engine.analytics.EmergencyTriageEngine
import com.yourapp.medassist.engine.analytics.RedFlagSymptomDetector
import com.yourapp.medassist.engine.analytics.RiskFactorAnalyzer
import com.yourapp.medassist.source.diseases.Disease

object ClinicalDecisionPipeline {

    data class ClinicalInput(

        val symptoms: List<String>,
        val riskFactors: List<String>,
        val age: Int

    )

    data class ClinicalOutput(

        val emergencyLevel: EmergencyTriageEngine.TriageLevel,
        val redFlags: List<String>,
        val riskLevel: RiskFactorAnalyzer.RiskLevel,
        val rankedDiseases: List<DifferentialDiagnosisRanker.RankedDisease>,
        val probabilities: List<DiagnosticConfidenceCalculator.DiseaseConfidence>

    )

    fun evaluate(

        input: ClinicalInput,
        diseases: List<Disease>,
        diseaseSymptomMap: Map<String, List<String>>

    ): ClinicalOutput {

        // Emergency check
        val triage = EmergencyTriageEngine.evaluate(input.symptoms)

        // Red flag detection
        val redFlags = RedFlagSymptomDetector.detect(input.symptoms)

        // Risk factor analysis
        val riskProfile = RiskFactorAnalyzer.analyze(input.riskFactors)

        // Age modifier (used indirectly by ranker)
        AgeRiskModifier.modifiers(input.age)

        // Differential diagnosis
        val ranked = DifferentialDiagnosisRanker.rankDiseases(

            symptoms = input.symptoms,
            diseases = diseases,
            diseaseSymptomMap = diseaseSymptomMap,
            age = input.age

        )

        // Probability calculation
        val probabilities = DiagnosticConfidenceCalculator.calculate(ranked)

        return ClinicalOutput(

            emergencyLevel = triage.level,
            redFlags = redFlags.redFlagsDetected,
            riskLevel = riskProfile.riskLevel,
            rankedDiseases = ranked.take(5),
            probabilities = probabilities.take(5)

        )

    }

}