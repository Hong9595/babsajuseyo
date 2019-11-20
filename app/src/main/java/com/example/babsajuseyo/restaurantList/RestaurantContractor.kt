package com.example.babsajuseyo.restaurantList

import com.example.babsajuseyo.entity.PlayingListData
import com.example.babsajuseyo.entity.RestaurantData

interface RestaurantContractor{
    interface View{
        fun showRestaurantData(data: List<PlayingListData>)
    }
    interface Presenter{
        fun loadItem()
    }
}