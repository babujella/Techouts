package com.example

import com.example.DataManipulation.InsertingManipulation
import com.example.DataManipulation.batchInsert
import com.example.DataManipulation.insertAndGenerateKey
import com.example.DataManipulation.update
import com.example.EntitiesColoumnBinding.Browsing
import com.example.Querys.ManagerMain
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {/*
       configureRouting()
        Authenication()
        InsertingManipulation()
        insertAndGenerateKey()
       batchInsert()
        update()
        Browsing()*/
        ManagerMain()
    }.start(wait = true)
}
