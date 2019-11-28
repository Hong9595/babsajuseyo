package com.example.babsajuseyo.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//TODO 질문2: FireStoreSource의 .toObject에서 deserialization 해줄때 기본 생성자가 없다고 에러가 떠서 여기 전부 var로 바꾸고 값 초기화 해줬음. 이러면 기본ㄴ 생성자가 생긴다고 함. 다른 방법은 없나?? val이 맞지 않나.
@Parcelize
data class RestaurantData(
    @SerializedName("ImageUrl")
    var ImageUrl: String = "",
    @SerializedName("address")
    var address: String = "",
    @SerializedName("title")
    var title: String = ""
) : Parcelable