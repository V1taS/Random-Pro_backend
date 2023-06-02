package com.sosinvitalii.database.jokes

object RussianJokes {
    fun fetch(): List<String> {
        return jokes
    }

    private val jokes = listOf(
        "Анекдоты",
        "Анекдоты"
    )
}