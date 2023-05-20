package com.sosinvitalii

import io.ktor.server.application.*
import com.sosinvitalii.plugins.*
import com.sosinvitalii.feature.login.configureLoginRouting
import com.sosinvitalii.feature.register.configureRegisterRouting
import com.sosinvitalii.feature.nickname.configureNicknameRouting
import io.ktor.server.response.*
import io.ktor.server.routing.*

// MARK: - Internal func

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureSerialization()
    configureLoginRouting()
    configureRegisterRouting()
    configureNicknameRouting()
}