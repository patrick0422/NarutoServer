package com.patrick.plugins

import io.ktor.server.application.*
import org.koin.ktor.ext.Koin

fun Application.configureKoin() {
    install(Koin) {
        slf4jLogger()

    }
}