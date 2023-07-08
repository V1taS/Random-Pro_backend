package com.sosinvitalii.database.memes
import com.sosinvitalii.feature.memes.MemesResponseRemote

enum class Language {
    RU, EN;

    companion object {
        fun fromString(value: String): Language? {
            return values().firstOrNull { it.name.equals(value, ignoreCase = true) }
        }
    }
}

object Memes {
    fun fetch(language: Language): List<MemesResponseRemote> {
        return when (language) {
            Language.RU -> fetchRussianMemes()
            Language.EN -> fetchEnglishMemes()
        }
    }

    private fun fetchEnglishMemes(): List<MemesResponseRemote> {
        return EnglishMemes.fetch()
    }

    private fun fetchRussianMemes(): List<MemesResponseRemote> {
        return RussianMemes.fetch()
    }
}