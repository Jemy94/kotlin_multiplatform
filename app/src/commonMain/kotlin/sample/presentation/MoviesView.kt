package sample.presentation

import sample.data.model.MoviesEntity

data class MoviesState(val s: MoviesEntity)

interface MoviesView {
    fun showState(state: MoviesState)
}