package com.sosinvitalii.database.names

object GermanNames {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleNames
        } else {
            femaleNames
        }
    }

    private val maleNames = listOf(
        "Lukas",
        "Maximilian",
        "Alexander",
        "Paul",
        "Leon",
        "Luis",
        "Felix",
        "Jonas",
        "Noah",
        "Julian"
    )

    private val femaleNames = listOf(
        "Anna",
        "Emma",
        "Sophie",
        "Marie",
        "Mia",
        "Lea",
        "Hannah",
        "Emily",
        "Lena",
        "Laura"
    )
}