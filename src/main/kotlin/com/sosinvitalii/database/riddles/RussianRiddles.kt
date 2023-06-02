package com.sosinvitalii.database.riddles

import com.sosinvitalii.feature.riddles.RiddleResponseRemote

object RussianRiddles {
    fun fetch(difficult: Difficult): List<RiddleResponseRemote> {
        return if (difficult == Difficult.HARD) {
            hardRiddles
        } else {
            easyRiddles
        }
    }

    private val easyRiddles = listOf(
        RiddleResponseRemote(
            question = "Загадка какая-то",
            answer = "Ответ на загадку"
        ),
        RiddleResponseRemote(
            question = "",
            answer = ""
        )
    )

    private val hardRiddles = listOf(
        RiddleResponseRemote(
            question = "",
            answer = ""
        ),
        RiddleResponseRemote(
            question = "",
            answer = ""
        )
    )
}