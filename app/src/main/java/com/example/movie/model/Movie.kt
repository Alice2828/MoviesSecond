package com.example.movie.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable


//@Entity(tableName="movie_table")
data class Movie(

    @SerializedName("popularity")
    val populatiry: Double,
    @SerializedName("vote_count")
    val vote_count: Int,
    @SerializedName("video")
    val video: Boolean,
    @SerializedName("poster_path")
    val poster_path: String,
   // @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("adult")
    val adult: Boolean,
    @SerializedName("backdrop_path")
    val backdrop_path: String,
    @SerializedName("original_language")
    val original_language: String,
    @SerializedName("original_title")
    val original_title: String,
    @SerializedName("genre_ids")
    val genre_ids: List<Int>,
    @SerializedName("title")
    val title: String,
    @SerializedName("vote_average")
    val vote_average: Double,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("release_date")
    val release_date: String
):Serializable {
    val baseImageUrl: String = "https://image.tmdb.org/t/p/w500"

    fun getPosterPath(): String {
        return "https://image.tmdb.org/t/p/w500" + poster_path
    }
}