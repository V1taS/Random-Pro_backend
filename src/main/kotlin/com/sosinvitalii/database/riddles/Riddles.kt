package com.sosinvitalii.database.riddles

import com.sosinvitalii.feature.riddles.RiddleResponseRemote

enum class Difficult {
    EASY, HARD;

    companion object {
        fun fromString(value: String): Difficult? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

enum class Language {
    RU, EN;

    companion object {
        fun fromString(value: String): Language? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

object Riddles {
    fun fetch(language: Language, difficult: Difficult): List<RiddleResponseRemote> {
        return when (language) {
            Language.EN -> fetchEnglishRiddles(difficult)
            Language.RU -> fetchRussianRiddles(difficult)
        }
    }

    private fun fetchEnglishRiddles(difficult: Difficult): List<RiddleResponseRemote> {
        return EnglishRiddles.fetch(difficult)
    }

    private fun fetchRussianRiddles(difficult: Difficult): List<RiddleResponseRemote> {
        return RussianRiddles.fetch(difficult)
    }
}