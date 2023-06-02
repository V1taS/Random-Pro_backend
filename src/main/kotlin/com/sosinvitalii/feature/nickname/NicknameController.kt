package com.sosinvitalii.feature.nickname

import com.sosinvitalii.database.nickname.Nicknames
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*

class NicknameController(private val call: ApplicationCall) {

    suspend fun perform() {
        val requestAPIKey = call.request.headers["api_key"]
        val constantAPIKey = "4t2AceLVaSW88H8wJ1f6"
        if (requestAPIKey == constantAPIKey) {
            call.respond(Nicknames.fetch())
        } else {
            call.respond(HttpStatusCode.BadRequest, "Invalid API-KEY")
        }
    }
}