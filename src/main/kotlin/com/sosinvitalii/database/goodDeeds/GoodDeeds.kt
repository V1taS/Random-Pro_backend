package com.sosinvitalii.database.goodDeeds

enum class Language {
    RU, EN;

    companion object {
        fun fromString(value: String): Language? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

object GoodDeeds {
    fun fetch(language: Language): List<String> {
        return when (language) {
            Language.RU -> fetchRussianGoodDeeds()
            Language.EN -> fetchEnglishGoodDeeds()
        }
    }

    private fun fetchEnglishGoodDeeds(): List<String> {
        return EnglishGoodDeeds.fetch()
    }

    private fun fetchRussianGoodDeeds(): List<String> {
        return RussianGoodDeeds.fetch()
    }
}