package com.sosinvitalii.feature.onboarding

import kotlinx.serialization.Serializable

@Serializable
data class OnboardingResponseRemote(

    // Заголовок онбординга
    val title: String,

    // Контент
    val contents: List<Content>
) {
    // MARK: - Content
    @Serializable
    data class Content(

        // Нативные иконки от Apple
        val symbolsSF: String,

        // Заголовок контента
        val title: String,

        // Описание контента
        val description: String
    )
}