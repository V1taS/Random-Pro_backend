package com.sosinvitalii.database.quotes

enum class Language {
    RU, EN;

    companion object {
        fun fromString(value: String): Language? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

object Quotes {
    fun fetch(language: Language): List<String> {
        return when (language) {
            Language.RU -> fetchRussianQuotes()
            Language.EN -> fetchEnglishQuotes()
        }
    }

    private fun fetchEnglishQuotes(): List<String> {
        return EnglishQuotes.fetch()
    }

    private fun fetchRussianQuotes(): List<String> {
        return RussianQuotes.fetch()
    }
}