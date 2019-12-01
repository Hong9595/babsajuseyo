package com.example.babsajuseyo.searchSchool

import com.example.babsajuseyo.entity.RestaurantData

interface SearchSchoolContract {
    interface View{
        fun showNearbyRestaurant(data: List<RestaurantData>)
    }

    interface Presenter{
        fun loadNearbyRestaurant(searchText: String)
    }
}