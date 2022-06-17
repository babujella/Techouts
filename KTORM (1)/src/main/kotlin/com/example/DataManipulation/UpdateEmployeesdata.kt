package com.example.DataManipulation

import com.example.Dataase.database
import com.example.Entities.OldEmployees
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.liuwj.ktorm.dsl.eq
import me.liuwj.ktorm.dsl.plus
import me.liuwj.ktorm.dsl.update


fun Application.update(){
    routing {
        get ("/Updated"){
            database.update(OldEmployees){
                set(it.salary,it.salary+25000)
                where {
                    it.id eq 1839
                }
            }
            call.respondText("Sucesfully Updated..")
        }
    }
}