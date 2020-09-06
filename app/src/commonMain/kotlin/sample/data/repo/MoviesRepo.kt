package sample.data.repo

import sample.data.api.MoviesApi
import sample.data.model.MoviesEntity

class MoviesRepo(private val api: MoviesApi) {
    suspend fun getMovies(): MoviesEntity {
        return api.getMovies()
    }
}