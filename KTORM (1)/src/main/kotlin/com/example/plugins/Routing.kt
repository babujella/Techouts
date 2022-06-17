package com.example.plugins

import com.example.Dataase.database
import com.example.Entities.EmployeeEntity
import com.sun.deploy.trace.Trace.println
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import me.liuwj.ktorm.database.Database
import me.liuwj.ktorm.dsl.from
import me.liuwj.ktorm.dsl.select

fun Application.configureRouting() {
    routing {
        get("/") {

        }
    }
}
