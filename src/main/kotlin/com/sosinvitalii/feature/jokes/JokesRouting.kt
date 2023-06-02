package com.sosinvitalii.feature.jokes

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureJokesRouting() {
    routing {
        get("/api/v1/jokes") {
            val jokesController = JokesController(call)
            jokesController.perform()
        }
    }
}