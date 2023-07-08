package com.sosinvitalii.database.memes
import com.sosinvitalii.feature.memes.MemesResponseRemote

/// Список ссылок на изображения с мемами на Русском
object RussianMemes {
    private const val baseUrl = "https://random.sosinvitalii.com/memes/ru"
    fun fetch(): List<MemesResponseRemote> {
        return memes
    }

    private val memes = listOf(
        MemesResponseRemote(urlImage = "$baseUrl/tMF3APXa7Ow.jpg"),
        MemesResponseRemote(urlImage = "$baseUrl/48a0b71708ca6aefb25dd5b8be4a7f77.jpg")
    )
}