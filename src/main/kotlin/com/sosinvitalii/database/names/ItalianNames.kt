package com.sosinvitalii.database.names

object ItalianNames {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleNames
        } else {
            femaleNames
        }
    }

    private val maleNames = listOf(
        "Francesco",
        "Lorenzo",
        "Matteo",
        "Gabriele",
        "Leonardo",
        "Andrea",
        "Alessandro",
        "Davide",
        "Federico",
        "Giuseppe"
    )

    private val femaleNames = listOf(
        "Sofia",
        "Giulia",
        "Martina",
        "Giorgia",
        "Sara",
        "Emma",
        "Aurora",
        "Francesca",
        "Chiara",
        "Alice"
    )
}