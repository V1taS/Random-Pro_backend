package com.sosinvitalii.database.giftIdeas

import com.sosinvitalii.database.giftIdeas.*

enum class Gender {
    MALE, FEMALE;

    companion object {
        fun fromString(value: String): Gender? {
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

object GiftIdeas {
    fun fetch(language: Language, gender: Gender): List<String> {
        return when (language) {
            Language.RU -> fetchRussianGiftIdeas(gender)
            Language.EN -> fetchEnglishGiftIdeas(gender)
        }
    }

    private fun fetchEnglishGiftIdeas(gender: Gender): List<String> {
        return EnglishGiftIdeas.fetch(gender)
    }

    private fun fetchRussianGiftIdeas(gender: Gender): List<String> {
        return RussianGiftIdeas.fetch(gender)
    }
}