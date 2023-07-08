package com.sosinvitalii.database.memes
import com.sosinvitalii.feature.memes.MemesResponseRemote

/// Список ссылок на изображения с мемами на Английском
object EnglishMemes {
    private const val baseUrl = "https://random.sosinvitalii.com/memes/en"
    fun fetch(): List<MemesResponseRemote> {
        return memes
    }

    private val memes = listOf(
        MemesResponseRemote(urlImage = "$baseUrl/5eef7b08ad061.jpeg"),
        MemesResponseRemote(urlImage = "$baseUrl/1648239656_45-kartinkof-club-p-memi-pro-angliiskii-yazik-48.jpg")
    )
}