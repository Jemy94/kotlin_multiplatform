package sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import sample.presentation.MoviesPresenter
import sample.presentation.MoviesState
import sample.presentation.MoviesView

class MainActivity : AppCompatActivity(),MoviesView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val p = MoviesPresenter(this)
        try {
            p.start()
        } catch (e: Exception) {
            print(e.message)
        }
    }

    override fun showState(state: MoviesState) {
        try {
            val moviesList = state.s.data.movies

        } catch (e: Exception) {
            print(e.message)
        }
    }
}