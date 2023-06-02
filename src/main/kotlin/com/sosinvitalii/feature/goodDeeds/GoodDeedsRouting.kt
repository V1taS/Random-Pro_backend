package com.sosinvitalii.feature.goodDeeds

import com.sosinvitalii.feature.goodDeeds.GoodDeedsController
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureGoodDeedsRouting() {
    routing {
        get("/api/v1/goodDeeds") {
            val goodDeedsController = GoodDeedsController(call)
            goodDeedsController.perform()
        }
    }
}