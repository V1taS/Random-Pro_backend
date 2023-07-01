package com.sosinvitalii.database.onboarding
import com.sosinvitalii.feature.onboarding.OnboardingResponseRemote

enum class Language {
    RU, EN;

    companion object {
        fun fromString(value: String): Language? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

object Onboarding {
    fun fetch(language: Language): List<OnboardingResponseRemote> {
        return when (language) {
            Language.RU -> fetchRussianOnboarding()
            Language.EN -> fetchEnglishOnboarding()
        }
    }

    private fun fetchEnglishOnboarding(): List<OnboardingResponseRemote> {
        return EnglishOnboarding.fetch()
    }

    private fun fetchRussianOnboarding(): List<OnboardingResponseRemote> {
        return RussianOnboarding.fetch()
    }
}