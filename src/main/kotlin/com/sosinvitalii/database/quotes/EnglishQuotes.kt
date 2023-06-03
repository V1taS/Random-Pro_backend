package com.sosinvitalii.database.quotes

/// Цитаты на английском языке
object EnglishQuotes {
    fun fetch(): List<String> {
        return quotes
    }

    private val quotes = listOf(
        "Hello world",
        "English",
        "iOS"
    )
}