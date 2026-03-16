object SymptomAttributes {

    val attributes = listOf(

        SymptomAttribute(
            id = "ATTR_LOCATION",
            name = "Location",
            description = "Anatomical location where the symptom occurs",
            options = listOf(
                "Head",
                "Face",
                "Neck",
                "Chest",
                "Left chest",
                "Right chest",
                "Upper abdomen",
                "Epigastric",
                "Left upper abdomen",
                "Right upper abdomen",
                "Lower abdomen",
                "Left lower abdomen",
                "Right lower abdomen",
                "Back",
                "Lower back",
                "Pelvis",
                "Groin",
                "Arm",
                "Leg",
                "Generalized"
            )
        ),

        SymptomAttribute(
            id = "ATTR_ONSET",
            name = "Onset",
            description = "How the symptom started",
            options = listOf(
                "Sudden",
                "Gradual",
                "After exertion",
                "After eating",
                "After trauma",
                "After infection",
                "After medication",
                "During sleep",
                "Morning onset",
                "Evening onset",
                "Night onset",
                "Progressive",
                "Recurrent",
                "Intermittent",
                "Chronic onset",
                "Post‑operative",
                "Post‑vaccination",
                "Seasonal",
                "Stress related",
                "Unknown onset"
            )
        ),

        SymptomAttribute(
            id = "ATTR_CHARACTER",
            name = "Character",
            description = "Quality or nature of the symptom",
            options = listOf(
                "Sharp",
                "Dull",
                "Burning",
                "Cramping",
                "Throbbing",
                "Stabbing",
                "Pressure",
                "Tightness",
                "Colicky",
                "Aching",
                "Electric",
                "Pulsating",
                "Heavy",
                "Squeezing",
                "Tearing",
                "Gnawing",
                "Radiating",
                "Constant",
                "Intermittent",
                "Worsening"
            )
        ),

        SymptomAttribute(
            id = "ATTR_DURATION",
            name = "Duration",
            description = "Length of time the symptom has been present",
            options = listOf(
                "Seconds",
                "Less than 1 minute",
                "1–5 minutes",
                "5–30 minutes",
                "30 minutes",
                "1 hour",
                "Several hours",
                "Half day",
                "1 day",
                "2–3 days",
                "4–7 days",
                "1 week",
                "2 weeks",
                "1 month",
                "Several months",
                "Chronic",
                "Recurrent",
                "Intermittent",
                "Continuous",
                "Unknown duration"
            )
        ),

        SymptomAttribute(
            id = "ATTR_SEVERITY",
            name = "Severity",
            description = "Intensity of the symptom",
            options = listOf(
                "Very mild",
                "Mild",
                "Mild to moderate",
                "Moderate",
                "Moderate to severe",
                "Severe",
                "Very severe",
                "Worst imaginable",
                "Pain score 1",
                "Pain score 2",
                "Pain score 3",
                "Pain score 4",
                "Pain score 5",
                "Pain score 6",
                "Pain score 7",
                "Pain score 8",
                "Pain score 9",
                "Pain score 10",
                "Disabling",
                "Life‑threatening"
            )
        ),

        SymptomAttribute(
            id = "ATTR_RADIATION",
            name = "Radiation",
            description = "Whether the symptom spreads to another area",
            options = listOf(
                "None",
                "Left arm",
                "Right arm",
                "Both arms",
                "Back",
                "Lower back",
                "Shoulder",
                "Left shoulder",
                "Right shoulder",
                "Jaw",
                "Neck",
                "Epigastrium",
                "Groin",
                "Thigh",
                "Leg",
                "Across chest",
                "Around abdomen",
                "Behind eyes",
                "To head",
                "Diffuse spread"
            )
        ),

        SymptomAttribute(
            id = "ATTR_AGGRAVATING",
            name = "Aggravating factors",
            description = "Factors that worsen the symptom",
            options = listOf(
                "Movement",
                "Deep breathing",
                "Coughing",
                "Eating",
                "Physical exertion",
                "Stress",
                "Cold exposure",
                "Heat exposure",
                "Lying down",
                "Standing",
                "Walking",
                "Running",
                "Touch or pressure",
                "Noise",
                "Bright light",
                "Certain foods",
                "Alcohol",
                "Smoking",
                "Night time",
                "Unknown trigger"
            )
        ),

        SymptomAttribute(
            id = "ATTR_RELIEVING",
            name = "Relieving factors",
            description = "Factors that improve the symptom",
            options = listOf(
                "Rest",
                "Sleep",
                "Medication",
                "Analgesics",
                "Antacids",
                "Inhaler",
                "Eating food",
                "Drinking water",
                "Warm compress",
                "Cold compress",
                "Position change",
                "Sitting upright",
                "Lying down",
                "Massage",
                "Stretching",
                "Relaxation",
                "Deep breathing",
                "Avoiding movement",
                "Time",
                "Unknown relief"
            )
        )

    )

}