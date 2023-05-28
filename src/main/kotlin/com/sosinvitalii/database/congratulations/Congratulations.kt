package com.sosinvitalii.database.congratulations

enum class GreetingsType {
    BIRTHDAY, NEW_YEAR, WEDDING, ANNIVERSARIES;

    companion object {
        fun fromString(value: String): GreetingsType? {
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

object Congratulations {
    fun fetch(greetingsType: GreetingsType, language: Language): List<String> {
        return when (greetingsType) {
            GreetingsType.BIRTHDAY -> fetchBirthdayCongratulations(language)
            GreetingsType.NEW_YEAR -> fetchNewYearCongratulations(language)
            GreetingsType.WEDDING -> fetchWeddingCongratulations(language)
            GreetingsType.ANNIVERSARIES -> fetchAnniversariesCongratulations(language)
        }
    }

    private fun fetchBirthdayCongratulations(language: Language): List<String> {
        return BirthdayCongratulations.fetch(language)
    }

    private fun fetchNewYearCongratulations(language: Language): List<String> {
        return NewYearCongratulations.fetch(language)
    }

    private fun fetchWeddingCongratulations(language: Language): List<String> {
        return WeddingCongratulations.fetch(language)
    }

    private fun fetchAnniversariesCongratulations(language: Language): List<String> {
        return AnniversariesCongratulations.fetch(language)
    }
}