package com.sosinvitalii.database.riddles

import com.sosinvitalii.feature.riddles.RiddleResponseRemote

object EnglishRiddles {
    fun fetch(difficult: Difficult): List<RiddleResponseRemote> {
        return if (difficult == Difficult.HARD) {
            hardRiddles
        } else {
            easyRiddles
        }
    }

    private val easyRiddles = listOf(
        RiddleResponseRemote(
            question = "",
            answer = ""
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