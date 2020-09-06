package sample.data.model

import kotlinx.serialization.Serializable

@Serializable
data class MoviesEntity(
    val data: Data
) {

    @Serializable
    data class Data(
        val movies: List<Movie>? = emptyList()
    ) {

        @Serializable
        data class Movie(
            val id: Long?,
            val title: String?,
            val title_long: String? = "",
            val year: Int?,
            val url: String? = ""
        )
    }
}