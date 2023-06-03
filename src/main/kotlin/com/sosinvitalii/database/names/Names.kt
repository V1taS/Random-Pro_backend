package com.sosinvitalii.database.names

enum class Gender {
    MALE, FEMALE;

    companion object {
        fun fromString(value: String): Gender? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

enum class Language {
    DE, EN, IT, RU, ES;

    companion object {
        fun fromString(value: String): Language? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

object Names {
    fun fetch(language: Language, gender: Gender): List<String> {
        return when (language) {
            Language.DE -> fetchGermanNames(gender)
            Language.EN -> fetchEnglishNames(gender)
            Language.IT -> fetchItalianNames(gender)
            Language.RU -> fetchRussianNames(gender)
            Language.ES -> fetchSpanishNames(gender)
        }
    }

    private fun fetchGermanNames(gender: Gender): List<String> {
        return GermanNames.fetch(gender)
    }

    private fun fetchEnglishNames(gender: Gender): List<String> {
        return EnglishNames.fetch(gender)
    }

    private fun fetchItalianNames(gender: Gender): List<String> {
        return ItalianNames.fetch(gender)
    }

    private fun fetchRussianNames(gender: Gender): List<String> {
        return RussianNames.fetch(gender)
    }

    private fun fetchSpanishNames(gender: Gender): List<String> {
        return SpanishNames.fetch(gender)
    }
}