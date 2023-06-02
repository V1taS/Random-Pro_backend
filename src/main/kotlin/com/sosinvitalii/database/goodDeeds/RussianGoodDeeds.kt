package com.sosinvitalii.database.goodDeeds

object RussianGoodDeeds {
    fun fetch(): List<String> {
        return goodDeeds
    }

    private val goodDeeds = listOf(
        "Хорошие дела",
        "Хорошие дела"
    )
}