package com.sosinvitalii.feature.memes
import kotlinx.serialization.Serializable

@Serializable
class MemesResponseRemote(

    /// Картинка с мемом
    val urlImage: String
)