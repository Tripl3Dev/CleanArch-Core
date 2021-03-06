package com.tripl3dev.domain.Entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movies_table")
data class MoviesEntity(
        @ColumnInfo(name = "page_num")
        @SerializedName("page") var page: Int = 1,
        @ColumnInfo(name = "movies_list") @SerializedName("results") var moviesList: List<Movie> = listOf()
) {

    @ColumnInfo(name = "movies_type")
    var MoviesType: Int = -10

    @PrimaryKey
    var uniqueId: String = ""

    fun setMoviesTypeAndId(moviesType: Int) {
        this.MoviesType = moviesType
        uniqueId = "$MoviesType$page"
    }

    var isLocale: Boolean = false

    data class Movie(
            @SerializedName("poster_path") var posterPath: String = "",
            @SerializedName("adult") var adult: Boolean = false,
            @SerializedName("overview") var overview: String = "",
            @SerializedName("release_date") var releaseDate: String = "",
            @SerializedName("genre_ids") var genreIds: List<Int> = listOf(),
            @SerializedName("id") var id: Int = 0,
            @SerializedName("original_title") var originalTitle: String = "",
            @SerializedName("original_language") var originalLanguage: String = "",
            @SerializedName("title") var title: String = "",
            @SerializedName("backdrop_path") var backdropPath: String = "",
            @SerializedName("popularity") var popularity: Double = 0.0,
            @SerializedName("vote_count") var voteCount: Int = 0,
            @SerializedName("video") var video: Boolean = false,
            @SerializedName("vote_average") var voteAverage: Double = 0.0
    )
}



