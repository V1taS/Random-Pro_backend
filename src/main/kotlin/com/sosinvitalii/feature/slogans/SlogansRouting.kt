package com.sosinvitalii.feature.slogans

import com.sosinvitalii.feature.slogans.SlogansController
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureSlogansRouting() {
    routing {
        get("/api/v1/slogans") {
            val slogansController = SlogansController(call)
            slogansController.perform()
        }
    }
}