package sample.data.api

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import sample.data.model.MoviesEntity

class MoviesApi {
    private val client = HttpClient()

    private var address = Url("https://yts.mx/api/v2/list_movies.json")

    suspend fun getMovies(): MoviesEntity {
        val json = Json(JsonConfiguration.Stable)
        return json.parse(MoviesEntity.serializer(), client.get {
            url(address.toString())
        })
    }
}