package com.sosinvitalii.feature.register

import kotlinx.serialization.Serializable

@Serializable
data class RegisterReceiveRemoteModel(
    val login: String,
    val email: String,
    val password: String
)

@Serializable
data class RegisterResponseRemote(
    val token: String
)