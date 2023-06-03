package com.sosinvitalii.feature.quotes

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureQuotesRouting() {
    routing {
        get("/api/v1/quotes") {
            val quotesController = QuotesController(call)
            quotesController.perform()
        }
    }
}