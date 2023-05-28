package com.sosinvitalii.feature.congratulations

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureCongratulationsRouting() {
    routing {
        get("/api/v1/congratulations") {
            val congratulationsController = CongratulationsController(call)
            congratulationsController.perform()
        }
    }
}