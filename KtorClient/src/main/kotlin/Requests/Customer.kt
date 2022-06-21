import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id:Int,val Name:String,val role:String)


fun main() {
    runBlocking {
    val client= HttpClient(CIO){
        install(ContentNegotiation){
            json()
        }
    }
    val response:HttpResponse=client.post("http://localhost:8080/customer") {
        contentType(ContentType.Application.Json)
        setBody(Customer(1839, "Babu_Jella", "Devoloper"))
       // println(response.bodyAsText())
    }
    }
}
