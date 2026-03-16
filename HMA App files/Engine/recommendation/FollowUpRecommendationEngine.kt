package com.yourapp.medassist.engine.recommendation

import com.yourapp.medassist.engine.triage.SymptomTriageLevel

object FollowUpRecommendationEngine {

    data class FollowUpPlan(

        val triageLevel: SymptomTriageLevel.TriageLevel,
        val recommendation: String,
        val timeframe: String

    )

    fun recommend(level: SymptomTriageLevel.TriageLevel): FollowUpPlan {

        return when (level) {

            SymptomTriageLevel.TriageLevel.EMERGENCY -> {

                FollowUpPlan(

                    triageLevel = level,

                    recommendation = "Seek immediate emergency medical care.",

                    timeframe = "Immediately"

                )

            }

            SymptomTriageLevel.TriageLevel.URGENT -> {

                FollowUpPlan(

                    triageLevel = level,

                    recommendation = "Consult a doctor or visit urgent care.",

                    timeframe = "Within a few hours"

                )

            }

            SymptomTriageLevel.TriageLevel.SEMI_URGENT -> {

                FollowUpPlan(

                    triageLevel = level,

                    recommendation = "Schedule a medical evaluation.",

                    timeframe = "Within 24–48 hours"

                )

            }

            SymptomTriageLevel.TriageLevel.ROUTINE -> {

                FollowUpPlan(

                    triageLevel = level,

                    recommendation = "Book a routine medical appointment if symptoms persist.",

                    timeframe = "Within 1–2 weeks"

                )

            }

            SymptomTriageLevel.TriageLevel.SELF_CARE -> {

                FollowUpPlan(

                    triageLevel = level,

                    recommendation = "Manage symptoms at home with rest, hydration, and over‑the‑counter care.",

                    timeframe = "Monitor for 2–3 days"

                )

            }

        }

    }

}