package com.sosinvitalii.cache

import com.sosinvitalii.feature.register.RegisterReceiveRemoteModel

data class TokenCache(
    val login: String,
    val token: String
)

object InMemoryCache {
    val userList: MutableList<RegisterReceiveRemoteModel> = mutableListOf()
    val tokens: MutableList<TokenCache> = mutableListOf()
}