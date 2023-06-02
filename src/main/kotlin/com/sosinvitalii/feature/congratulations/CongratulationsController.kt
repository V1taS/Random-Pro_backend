package com.sosinvitalii.feature.congratulations

import com.sosinvitalii.database.congratulations.Congratulations
import com.sosinvitalii.database.congratulations.Language
import com.sosinvitalii.database.congratulations.GreetingsType
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*

class CongratulationsController(private val call: ApplicationCall) {
    suspend fun perform() {
        val requestAPIKey = call.request.headers["api_key"]
        val constantAPIKey = "4t2AceLVaSW88H8wJ1f6"

        // проверка API ключа
        if (requestAPIKey != constantAPIKey) {
            call.respond(HttpStatusCode.BadRequest, "Invalid API-KEY")
        }

        // Проверка типа поздравления
        val greetingsTypeString = call.request.queryParameters["type"]
        if (greetingsTypeString == null) {
            call.respond(HttpStatusCode.BadRequest, "No greetings type specified")
            return
        }

        val greetingsType = GreetingsType.fromString(greetingsTypeString)
        if (greetingsType == null) {
            call.respond(HttpStatusCode.BadRequest, "Invalid greetings type: $greetingsType")
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

        val names = Congratulations.fetch(greetingsType, languageEnum)
        call.respond(names)
    }
}