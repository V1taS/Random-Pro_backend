package com.sosinvitalii.database.truthOrDare

enum class Type {
    TRUTH, DARE;

    companion object {
        fun fromString(value: String): Type? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

enum class Language {
    EN, RU;

    companion object {
        fun fromString(value: String): Language? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

object TruthOrDare {
    fun fetch(language: Language, type: Type): List<String> {
        return when (language) {
            Language.EN -> fetchEnglishTruthOrDare(type)
            Language.RU -> fetchRussianTruthOrDare(type)
        }
    }

    private fun fetchEnglishTruthOrDare(type: Type): List<String> {
        return EnglishTruthOrDare.fetch(type)
    }

    private fun fetchRussianTruthOrDare(type: Type): List<String> {
        return RussianTruthOrDare.fetch(type)
    }
}