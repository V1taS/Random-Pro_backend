package com.sosinvitalii.feature.riddles

import kotlinx.serialization.Serializable

@Serializable
class RiddleResponseRemote(
    /// Загадка
    val question: String,

    /// Ответ на загадку
    val answer: String
)