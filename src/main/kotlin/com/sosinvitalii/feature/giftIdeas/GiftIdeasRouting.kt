package com.sosinvitalii.feature.giftIdeas

import com.sosinvitalii.feature.giftIdeas.GiftIdeasController
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureGiftIdeasRouting() {
    routing {
        get("/api/v1/giftIdeas") {
            val giftIdeasController = GiftIdeasController(call)
            giftIdeasController.perform()
        }
    }
}