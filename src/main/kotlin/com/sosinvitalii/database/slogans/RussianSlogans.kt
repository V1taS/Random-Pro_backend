package com.sosinvitalii.database.slogans

/// Слоганы на русском языке
object RussianSlogans {
    fun fetch(): List<String> {
        return slogans
    }

    private val slogans = listOf(
        "Слоганы .....",
        "еще слоганы  ",
        "🚀"
    )
}