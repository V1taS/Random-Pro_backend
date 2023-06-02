package com.sosinvitalii.feature.riddles

import com.sosinvitalii.feature.riddles.RiddlesController
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRiddlesRouting() {
    routing {
        get("/api/v1/riddles") {
            val riddlesController = RiddlesController(call)
            riddlesController.perform()
        }
    }
}