package com.yourapp.medassist.engine

import com.yourapp.medassist.engine.ai.BayesianDiagnosticEngine
import com.yourapp.medassist.engine.ai.HybridDiagnosticEngine
import com.yourapp.medassist.engine.ai.ClinicalReasoningEngine
import com.yourapp.medassist.engine.diagnostic.DifferentialDiagnosisRanker
import com.yourapp.medassist.engine.diagnostic.DiagnosticConfidenceCalculator
import com.yourapp.medassist.engine.diagnostic.ComorbidityAnalyzer
import com.yourapp.medassist.engine.analytics.RedFlagSymptomDetector
import com.yourapp.medassist.engine.analytics.RiskFactorAnalyzer
import com.yourapp.medassist.engine.triage.EmergencyTriageEngine
import com.yourapp.medassist.engine.recommendation.InvestigationRecommendationEngine
import com.yourapp.medassist.engine.recommendation.LifestyleRecommendationEngine
import com.yourapp.medassist.engine.safety.ContraindicationSafetyEngine
import com.yourapp.medassist.source.diseases.Disease

object ClinicalAIController {

    data class PatientInput(

        val symptoms: List<String>,
        val riskFactors: List<String>,
        val age: Int

    )

    data class AIResult(

        val rankedDiseases: List<HybridDiagnosticEngine.HybridResult>,
        val redFlags: List<String>,
        val emergencyLevel: String,
        val comorbidities: List<ComorbidityAnalyzer.ComorbidityResult>,
        val safetyAlerts: List<ContraindicationSafetyEngine.SafetyAlert>

    )

    fun evaluate(

        input: PatientInput,
        diseases: List<Disease>,
        diseaseSymptomMap: Map<String, List<String>>,
        likelihoods: Map<String, List<BayesianDiagnosticEngine.SymptomLikelihood>>

    ): AIResult {

        // 1️⃣ Red flag detection
        val redFlags = RedFlagSymptomDetector.detect(input.symptoms)

        // 2️⃣ Emergency triage
        val triage = EmergencyTriageEngine.evaluate(input.symptoms)

        // 3️⃣ Weighted diagnostic engine
        val ranked = DifferentialDiagnosisRanker.rankDiseases(

            symptoms = input.symptoms,
            diseases = diseases,
            diseaseSymptomMap = diseaseSymptomMap,
            age = input.age

        )

        // 4️⃣ Bayesian diagnostic engine
        val bayesian = BayesianDiagnosticEngine.compute(

            symptoms = input.symptoms,
            diseases = diseases,
            diseaseSymptomLikelihoods = likelihoods

        )

        // 5️⃣ Hybrid AI diagnosis
        val hybrid = HybridDiagnosticEngine.combine(

            weightedResults = ranked,
            bayesianResults = bayesian,
            symptoms = input.symptoms

        )

        // 6️⃣ Top diseases for additional analysis
        val topDiseases = hybrid.take(5).map { it.diseaseId }

        // 7️⃣ Comorbidity detection
        val comorbidities = ComorbidityAnalyzer.analyze(topDiseases)

        // 8️⃣ Safety checks
        val safety = ContraindicationSafetyEngine.check(topDiseases)

        return AIResult(

            rankedDiseases = hybrid.take(5),
            redFlags = redFlags.redFlagsDetected,
            emergencyLevel = triage.level.name,
            comorbidities = comorbidities,
            safetyAlerts = safety

        )

    }

}