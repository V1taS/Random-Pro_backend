package com.sosinvitalii.database.truthOrDare

/// Правда или действие на русском языке
object RussianTruthOrDare {
    fun fetch(type: Type): List<String> {
        return if (type == Type.TRUTH) {
            RussianTruthOrDare.truth
        } else {
            RussianTruthOrDare.dare
        }
    }

    private val truth = listOf(
        "Правда 1",
        "Правда 2",
    )

    private val dare = listOf(
        "Действие 1",
        "Действие 2",
    )
}