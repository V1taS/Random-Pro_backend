package com.sosinvitalii.feature.memes

import com.sosinvitalii.feature.memes.MemesController
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureMemesRouting() {
    routing {
        get("/api/v1/memes") {
            val memesController = MemesController(call)
            memesController.perform()
        }
    }
}