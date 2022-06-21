import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val client = HttpClient(CIO)
        val responce: HttpResponse = client.get("https://ktor.io")
        println(responce.bodyAsText())
        println("Hii Babu")
    }
}