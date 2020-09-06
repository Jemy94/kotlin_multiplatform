package sample.presentation

import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import sample.data.api.Background
import sample.domain.CaseProvider

class MoviesPresenter(private val view: MoviesView) {
    private val case = CaseProvider.getCase()

    fun start() {
        GlobalScope.apply {
            launch(Background) {
                val s = case.getMovies()
                println(s)
                withContext(Main) {
                    view.showState(MoviesState(s))
                }
            }
        }
    }
}