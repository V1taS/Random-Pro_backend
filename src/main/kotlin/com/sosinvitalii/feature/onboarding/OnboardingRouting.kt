package com.sosinvitalii.feature.onboarding

import com.sosinvitalii.feature.onboarding.OnboardingController
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureOnboardingRouting() {
    routing {
        get("/api/v1/onboarding") {
            val onboardingController = OnboardingController(call)
            onboardingController.perform()
        }
    }
}