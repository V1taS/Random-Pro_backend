package com.sosinvitalii.database.quotes

/// Цитаты на русском языке
object RussianQuotes {
    fun fetch(): List<String> {
        return quotes
    }

    private val quotes = listOf(
        "ЦИтату добавлю позже",
        "Не переживай",
        "🚀"
    )
}