package com.example.babsajuseyo.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PlayingListData(
    @SerializedName("poster_path")
    val imagePath: String,
    @SerializedName("title")
    val movieName: String,
    @SerializedName("vote_average")
    val voteRate: String
) : Parcelable