package com.sosinvitalii.database.names

object EnglishNames {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleNames
        } else {
            femaleNames
        }
    }

    private val maleNames = listOf(
        "Liam",
        "Noah",
        "William",
        "James",
        "Oliver",
        "Benjamin",
        "Elijah",
        "Lucas",
        "Mason",
        "Logan"
    )

    private val femaleNames = listOf(
        "Emma",
        "Olivia",
        "Ava",
        "Isabella",
        "Sophia",
        "Mia",
        "Charlotte",
        "Amelia",
        "Harper",
        "Evelyn"
    )
}