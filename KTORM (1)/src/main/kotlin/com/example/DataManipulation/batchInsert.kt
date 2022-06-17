package com.example.DataManipulation

import com.example.Dataase.database
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.liuwj.ktorm.dsl.batchInsert

fun Application.batchInsert(){
    routing {
        get ("/batchInsert"){
            database.batchInsert(batchInsert){
                item {
                    set(it.id,1)
                    set(it.name,"Babu_Jella")
                    set(it.password,"Babu@4949")
                }
                item {
                    set(it.id,2)
                    set(it.name,"raghu")
                    set(it.password,"raghu@4949")
                }
            }
            call.respondText("Success ra LUCHAAAA")
        }
    }
}