package com.sosinvitalii.database.slogans

/// Слоганы на английском языке
object EnglishSlogans {
    fun fetch(): List<String> {
        return slogans
    }

    private val slogans = listOf(
        "Slogan .....",
        "more slogan",
        "🚀"
    )
}