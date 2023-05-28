package com.sosinvitalii.database.names

object RussianNames {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleNames
        } else {
            femaleNames
        }
    }

    private val maleNames = listOf(
        "Александр",
        "Дмитрий",
        "Михаил",
        "Сергей",
        "Иван",
        "Андрей",
        "Николай",
        "Павел",
        "Алексей",
        "Владимир"
    )

    private val femaleNames = listOf(
        "Анастасия",
        "Мария",
        "Екатерина",
        "София",
        "Елизавета",
        "Ольга",
        "Татьяна",
        "Анна",
        "Ирина",
        "Наталья"
    )
}