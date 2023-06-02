package com.sosinvitalii.database.jokes

enum class Language {
    RU, EN;

    companion object {
        fun fromString(value: String): Language? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

object Jokes {
    fun fetch(language: Language): List<String> {
        return when (language) {
            Language.RU -> fetchRussianJokes()
            Language.EN -> fetchEnglishJokes()
        }
    }

    private fun fetchEnglishJokes(): List<String> {
        return EnglishJokes.fetch()
    }

    private fun fetchRussianJokes(): List<String> {
        return RussianJokes.fetch()
    }
}