package com.sosinvitalii.feature.names

import com.sosinvitalii.database.names.Names
import com.sosinvitalii.database.names.Language
import com.sosinvitalii.database.names.Gender
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*

class NamesController(private val call: ApplicationCall) {
    suspend fun perform() {
        val requestAPIKey = call.request.headers["api_key"]
        val constantAPIKey = "4t2AceLVaSW88H8wJ1f6"

        // проверка API ключа
        if (requestAPIKey != constantAPIKey) {
            call.respond(HttpStatusCode.BadRequest, "Invalid API-KEY")
        }

        // Проверка пола
        val genderString = call.request.queryParameters["gender"]
        if (genderString == null) {
            call.respond(HttpStatusCode.BadRequest, "No gender specified")
            return
        }

        val gender = Gender.fromString(genderString)
        if (gender == null) {
            call.respond(HttpStatusCode.BadRequest, "Invalid gender: $genderString")
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

        val names = Names.fetch(languageEnum, gender)
        call.respond(names)
    }
}