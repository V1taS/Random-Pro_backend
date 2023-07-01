package com.sosinvitalii.database.onboarding
import com.sosinvitalii.feature.onboarding.OnboardingResponseRemote

/// Онбоардинг на английском языке
object EnglishOnboarding {
    fun fetch(): List<OnboardingResponseRemote> {
        return onboardingPages
    }

    private val onboardingPages = listOf(
        OnboardingResponseRemote(
            title = "English title 1",
            contents = listOf(
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Some title 1",
                    description = "Some description 1"
                ),
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Some title 2",
                    description = "Some description 2"
                ),
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Some title 3",
                    description = "Some description 3"
                )
            )
        ),

        OnboardingResponseRemote(
            title = "English title 2",
            contents = listOf(
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Some title 1",
                    description = "Some description 1"
                ),
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Some title 2",
                    description = "Some description 2"
                ),
                OnboardingResponseRemote.Content(
                    symbolsSF = "folder.badge.person.crop",
                    title = "Some title 3",
                    description = "Some description 3"
                )
            )
        )
    )
}