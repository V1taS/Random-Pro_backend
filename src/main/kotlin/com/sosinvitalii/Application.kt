package com.sosinvitalii

import io.ktor.server.application.*
import com.sosinvitalii.plugins.*
import com.sosinvitalii.feature.login.configureLoginRouting
import com.sosinvitalii.feature.register.configureRegisterRouting
import com.sosinvitalii.feature.nickname.configureNicknameRouting
import com.sosinvitalii.feature.names.configureNamesRouting
import com.sosinvitalii.feature.congratulations.configureCongratulationsRouting
import com.sosinvitalii.feature.riddles.configureRiddlesRouting
import com.sosinvitalii.feature.giftIdeas.configureGiftIdeasRouting

// MARK: - Internal func

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureSerialization()
    configureLoginRouting()
    configureRegisterRouting()
    configureNicknameRouting()
    configureNamesRouting()
    configureCongratulationsRouting()
    configureRiddlesRouting()
    configureGiftIdeasRouting()
}