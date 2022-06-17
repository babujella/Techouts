package com.example.DataManipulation

import com.example.Dataase.database
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.liuwj.ktorm.dsl.insert
import me.liuwj.ktorm.dsl.insertAndGenerateKey

fun Application.insertAndGenerateKey(){
    routing {
        get ("/insertAndGenerateKey"){
            database.insertAndGenerateKey(insertAndGenerateKeyEntity) {
                set(it.name, "Babu_Jella")
                set(it.password, "Babu@9494")
            }
            call.respondText("Success broo")
        }
    }
}