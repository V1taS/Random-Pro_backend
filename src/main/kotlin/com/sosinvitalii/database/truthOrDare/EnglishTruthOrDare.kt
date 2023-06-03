package com.sosinvitalii.database.truthOrDare

/// Правда или действие на английском языке языке
object EnglishTruthOrDare {
    fun fetch(type: Type): List<String> {
        return if (type == Type.TRUTH) {
            truth
        } else {
            dare
        }
    }

    private val truth = listOf(
        "truth 1",
        "truth 2",
    )

    private val dare = listOf(
        "dare 1",
        "dare 2",
    )
}