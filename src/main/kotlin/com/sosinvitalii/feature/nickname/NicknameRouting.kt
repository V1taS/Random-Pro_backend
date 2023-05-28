package com.sosinvitalii.feature.nickname

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureNicknameRouting() {
    routing {
        get("/api/v1/nickname") {
            val nicknameController = NicknameController(call)
            nicknameController.perform()
        }
    }
}