package com.sosinvitalii.database.names

object SpanishNames {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleNames
        } else {
            femaleNames
        }
    }

    private val maleNames = listOf(
        "Luis",
        "Carlos",
        "Juan",
        "José",
        "Miguel",
        "Antonio",
        "Francisco",
        "David",
        "Javier",
        "Manuel",
        "Daniel",
        "Diego",
        "Jorge",
        "Rafael",
        "Fernando"
    )

    private val femaleNames = listOf(
        "Maria",
        "Isabella",
        "Sofia",
        "Camila",
        "Valentina",
        "Lucia",
        "Martina",
        "Carla",
        "Sara",
        "Ana",
        "Victoria",
        "Julia",
        "Elena",
        "Alba",
        "Clara"
    )
}