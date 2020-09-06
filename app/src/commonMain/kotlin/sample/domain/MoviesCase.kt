package sample.domain

import sample.data.api.MoviesApi
import sample.data.model.MoviesEntity
import sample.data.repo.MoviesRepo

class MoviesCase(private val moviesRepo: MoviesRepo) {
    suspend fun getMovies(): MoviesEntity {
        return moviesRepo.getMovies()
    }
}

object CaseProvider {
    fun getCase() = MoviesCase(MoviesRepo(MoviesApi()))
}