object SymptomSearchIndex {

    val index = mutableMapOf<String, String>()

    fun add(term: String, symptomCode: String) {
        index[term.lowercase()] = symptomCode
    }

    fun search(term: String): String? {
        return index[term.lowercase()]
    }

    fun loadDefault() {

        add("headache", "SYM_HEADACHE")
        add("head pain", "SYM_HEADACHE")
        add("pain in head", "SYM_HEADACHE")

        add("chest pain", "SYM_CHEST_PAIN")
        add("pain in chest", "SYM_CHEST_PAIN")
        add("tight chest", "SYM_CHEST_PAIN")
        add("burning chest", "SYM_CHEST_PAIN")

        add("abdominal pain", "SYM_ABDOMINAL_PAIN")
        add("stomach pain", "SYM_ABDOMINAL_PAIN")
        add("belly pain", "SYM_ABDOMINAL_PAIN")

        add("shortness of breath", "SYM_SHORTNESS_OF_BREATH")
        add("difficulty breathing", "SYM_SHORTNESS_OF_BREATH")
        add("breathlessness", "SYM_SHORTNESS_OF_BREATH")

        add("fever", "SYM_FEVER")
        add("high temperature", "SYM_FEVER")

        add("cough", "SYM_COUGH")
        add("dry cough", "SYM_COUGH")
        add("productive cough", "SYM_COUGH")

        add("vomiting", "SYM_VOMITING")
        add("throwing up", "SYM_VOMITING")

        add("nausea", "SYM_NAUSEA")
        add("feeling nauseated", "SYM_NAUSEA")

        add("diarrhea", "SYM_DIARRHEA")
        add("loose stool", "SYM_DIARRHEA")
        add("watery stool", "SYM_DIARRHEA")

        add("constipation", "SYM_CONSTIPATION")

        add("dizziness", "SYM_DIZZINESS")
        add("lightheadedness", "SYM_DIZZINESS")

        add("palpitations", "SYM_PALPITATIONS")
        add("heart racing", "SYM_PALPITATIONS")

        add("fatigue", "SYM_FATIGUE")
        add("tiredness", "SYM_FATIGUE")

        add("rash", "SYM_RASH")
        add("skin rash", "SYM_RASH")

        add("itching", "SYM_ITCHING")
        add("pruritus", "SYM_ITCHING")

        add("joint pain", "SYM_JOINT_PAIN")
        add("arthralgia", "SYM_JOINT_PAIN")

        add("muscle pain", "SYM_MUSCLE_PAIN")
        add("myalgia", "SYM_MUSCLE_PAIN")

        add("back pain", "SYM_BACK_PAIN")

        add("burning urination", "SYM_DYSURIA")
        add("painful urination", "SYM_DYSURIA")

        add("frequent urination", "SYM_FREQUENT_URINATION")

    }

}