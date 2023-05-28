package com.sosinvitalii.feature.names

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureNamesRouting() {
    routing {
        get("/api/v1/names") {
            val namesController = NamesController(call)
            namesController.perform()
        }
    }
}