package com.sosinvitalii.feature.truthOrDare

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureTruthOrDareRouting() {
    routing {
        get("/api/v1/truthOrDare") {
            val truthOrDareController = TruthOrDareController(call)
            truthOrDareController.perform()
        }
    }
}