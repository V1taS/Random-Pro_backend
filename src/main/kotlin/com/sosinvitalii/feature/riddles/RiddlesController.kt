package com.sosinvitalii.feature.riddles

import com.sosinvitalii.database.riddles.Difficult
import com.sosinvitalii.database.riddles.Language
import com.sosinvitalii.database.riddles.Riddles

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*

class RiddlesController(private val call: ApplicationCall) {
    suspend fun perform() {
        val requestAPIKey = call.request.headers["api_key"]
        val constantAPIKey = "4t2AceLVaSW88H8wJ1f6"

        // проверка API ключа
        if (requestAPIKey != constantAPIKey) {
            call.respond(HttpStatusCode.BadRequest, "Invalid API-KEY")
        }

        // Проверка сложности
        val difficultString = call.request.queryParameters["difficult"]
        if (difficultString == null) {
            call.respond(HttpStatusCode.BadRequest, "No difficult specified")
            return
        }

        val difficult = Difficult.fromString(difficultString)
        if (difficult == null) {
            call.respond(HttpStatusCode.BadRequest, "Invalid difficult: $difficultString")
            return
        }

        // Проверка языка
        val language = call.request.queryParameters["language"]
        if (language == null) {
            call.respond(HttpStatusCode.BadRequest, "No language specified")
            return
        }

        val languageEnum = Language.fromString(language)
        if (languageEnum == null) {
            call.respond(HttpStatusCode.BadRequest, "Invalid language: $language")
            return
        }

        val names = Riddles.fetch(languageEnum, difficult)
        call.respond(names)
    }
}