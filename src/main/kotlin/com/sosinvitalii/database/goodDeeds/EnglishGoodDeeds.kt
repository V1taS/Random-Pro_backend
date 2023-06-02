package com.sosinvitalii.database.goodDeeds

object EnglishGoodDeeds {
    fun fetch(): List<String> {
        return goodDeeds
    }

    private val goodDeeds = listOf(
        "Хорошие дела",
        "Хорошие дела"
    )
}