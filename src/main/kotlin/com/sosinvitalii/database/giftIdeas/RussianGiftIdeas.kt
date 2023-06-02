package com.sosinvitalii.database.giftIdeas

import com.sosinvitalii.database.giftIdeas.Gender

object RussianGiftIdeas {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleGiftIdeas
        } else {
            femaleGiftIdeas
        }
    }

    private val maleGiftIdeas = listOf(
        "Идеи для подарков",
        "Идеи для подарков"
    )

    private val femaleGiftIdeas = listOf(
        "Идеи для подарков",
        "Идеи для подарков"
    )
}
