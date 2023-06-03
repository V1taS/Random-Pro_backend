package com.sosinvitalii.database.slogans

enum class Language {
    RU, EN;

    companion object {
        fun fromString(value: String): Language? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

object Slogans {
    fun fetch(language: Language): List<String> {
        return when (language) {
            Language.RU -> fetchRussianSlogans()
            Language.EN -> fetchEnglishSlogans()
        }
    }

    private fun fetchEnglishSlogans(): List<String> {
        return EnglishSlogans.fetch()
    }

    private fun fetchRussianSlogans(): List<String> {
        return RussianSlogans.fetch()
    }
}