package com.example.babsajuseyo.restaurantList

import com.example.babsajuseyo.base.BaseActivity
import com.example.babsajuseyo.base.BasePresenter
import com.example.babsajuseyo.entity.PlayingListData
import com.example.babsajuseyo.entity.RestaurantData

interface RestaurantContractor{
    interface View{
        fun showRestaurantData(data: List<RestaurantData>)

    }
    interface Presenter{
//        fun loadItem()
        fun loadRestaurantList()
    }
}