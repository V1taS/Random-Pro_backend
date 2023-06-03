package com.sosinvitalii.feature.truthOrDare

import com.sosinvitalii.database.truthOrDare.Type
import com.sosinvitalii.database.truthOrDare.Language
import com.sosinvitalii.database.truthOrDare.TruthOrDare
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*

class TruthOrDareController(private val call: ApplicationCall) {
    suspend fun perform() {
        val requestAPIKey = call.request.headers["api_key"]
        val constantAPIKey = "4t2AceLVaSW88H8wJ1f6"

        // проверка API ключа
        if (requestAPIKey != constantAPIKey) {
            call.respond(HttpStatusCode.BadRequest, "Invalid API-KEY")
        }

        // Проверка пола
        val typeString = call.request.queryParameters["type"]
        if (typeString == null) {
            call.respond(HttpStatusCode.BadRequest, "No gender specified")
            return
        }

        val type = Type.fromString(typeString)
        if (type == null) {
            call.respond(HttpStatusCode.BadRequest, "Invalid gender: $typeString")
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

        val names = TruthOrDare.fetch(languageEnum, type)
        call.respond(names)
    }
}