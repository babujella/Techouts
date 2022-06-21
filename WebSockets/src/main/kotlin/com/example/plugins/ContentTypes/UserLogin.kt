package com.example.plugins

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.application.*
import kotlinx.coroutines.runBlocking
import java.sql.DriverManager.println

fun Application.User() {
    runBlocking {
        val client = HttpClient(CIO)
        val responce: HttpResponse = client.submitForm(
            url = "http://localhost:8080/signup",
            formParameters = Parameters.build {
                append("Name", "Babu_Jella")
                append("Password", "Babu@4949")
            }
        )
        println("${responce.bodyAsText()}")
    }
}
