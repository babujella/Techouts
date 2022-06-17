package com.example.DataManipulation

import com.example.Dataase.database
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.liuwj.ktorm.dsl.insert

fun Application.InsertingManipulation(){
    routing {
        get ("insertingmanipulation"){
            database.insert(InsertEntity){
                set(it.id,49)
                set(it.name,"Babu_Jella")
                set(it.password,"Babu@4949")
            }
            call.respondText("Succesfully Inserted")
        }
    }
}