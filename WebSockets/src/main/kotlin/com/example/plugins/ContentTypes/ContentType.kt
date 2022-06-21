package com.example.plugins

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.Serializable
import java.sql.DriverManager.println

@Serializable
data class Customer(val id:Int,val Name:String,val role:String)


fun Application.ContentType(){
    runBlocking {
        val client= HttpClient(CIO){
            install(ContentNegotiation){
                json()
            }
        }
        val response: HttpResponse =client.post("http://localhost:8080/customer"){
            contentType(ContentType.Application.Json)
            setBody(Customer(1839,"Babu_Jella","Devoloper"))
        }
        println(response.bodyAsText())
        val customer: Customer = client.get("http://localhost:8080/customer/3").body()
        println("First name: '${customer.Name}', last name: '${customer.role}'")
    }
}