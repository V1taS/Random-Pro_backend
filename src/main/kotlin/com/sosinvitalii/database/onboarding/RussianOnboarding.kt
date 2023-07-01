package com.sosinvitalii.database.onboarding
import com.sosinvitalii.feature.onboarding.OnboardingResponseRemote

/// Онбоардинг на русском языке
object RussianOnboarding {
    fun fetch(): List<OnboardingResponseRemote> {
        return onboardingPages
    }

    private val onboardingPages = listOf(
        OnboardingResponseRemote(
            title = "Заголовок на русском 1",
            contents = listOf(
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Какой то заголовок 1",
                    description = "Какое то описание 1"
                ),
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Какой то заголовок 2",
                    description = "Какое то описание 2"
                ),
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Какой то заголовок 3",
                    description = "Какое то описание 3"
                )
            )
        ),

        OnboardingResponseRemote(
            title = "Заголовок на русском 2",
            contents = listOf(
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Какой то заголовок 1",
                    description = "Какое то описание 1"
                ),
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Какой то заголовок 2",
                    description = "Какое то описание 2"
                ),
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Какой то заголовок 3",
                    description = "Какое то описание 3"
                )
            )
        )
    )
}