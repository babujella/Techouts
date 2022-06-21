import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val client = HttpClient(CIO)
        val response: HttpResponse = client.get("https://geek-jokes.sameerkumar.website/api?format=json")
        println(response.status)
        if (response.status.value in 200..300){
            println("Succesfull responce...")
        }
        else{
            println("Nothing...")
        }
        println()
        println("Receive response body-----RAW BODY")
        println()
        val httpResponce:HttpResponse=client.get("https://geek-jokes.sameerkumar.website/api?format=json")
        val bodyString:String=httpResponce.body()
        println(bodyString)
        println()
        
    }
}