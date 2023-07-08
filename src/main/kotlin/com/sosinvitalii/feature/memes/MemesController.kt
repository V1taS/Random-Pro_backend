package com.sosinvitalii.feature.memes
import com.sosinvitalii.database.memes.Language
import com.sosinvitalii.database.memes.Memes
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*

class MemesController(private val call: ApplicationCall) {
    suspend fun perform() {
        val requestAPIKey = call.request.headers["api_key"]
        val constantAPIKey = "4t2AceLVaSW88H8wJ1f6"

        // проверка API ключа
        if (requestAPIKey != constantAPIKey) {
            call.respond(HttpStatusCode.BadRequest, "Invalid API-KEY")
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

        val names = Memes.fetch(languageEnum)
        call.respond(names)
    }
}