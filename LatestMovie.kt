package com.codepath.flix34

import com.google.gson.annotations.SerializedName

class LatestMovie {
    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    @SerializedName("title")
    var title: String? = null

    @SerializedName("author")
    var description: String? = null
}