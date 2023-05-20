package com.sosinvitalii.feature.login

import com.sosinvitalii.database.tokens.TokenDTO
import com.sosinvitalii.database.tokens.Tokens
import com.sosinvitalii.database.users.Users
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import java.util.*

class LoginController(private val call: ApplicationCall) {

    suspend fun performLogin() {
        val loginReceiveRemoteModel = call.receive<LoginReceiveRemoteModel>()
        val userDTO = Users.fetchUser(loginReceiveRemoteModel.login)
        val token = UUID.randomUUID().toString()
        call.respond(LoginResponseRemoteModel(token))
        return

        if (userDTO == null) {
            call.respond(HttpStatusCode.BadRequest, "User not found")
        } else {
            if (userDTO.password == loginReceiveRemoteModel.password) {
                val token = UUID.randomUUID().toString()
                Tokens.insert(
                    TokenDTO(
                        UUID.randomUUID().toString(),
                        loginReceiveRemoteModel.login,
                        token
                    )
                )
                call.respond(LoginResponseRemoteModel(token))
            } else {
                call.respond(HttpStatusCode.BadRequest, "Invalid password")
            }
        }
    }
}