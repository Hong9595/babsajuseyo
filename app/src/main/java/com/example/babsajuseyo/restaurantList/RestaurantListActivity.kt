package com.example.babsajuseyo.restaurantList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.babsajuseyo.R
import com.example.babsajuseyo.base.BaseActivity
import com.example.babsajuseyo.data.repository.RestaurantRepo
import com.example.babsajuseyo.entity.PlayingListData
import com.example.babsajuseyo.entity.RestaurantData
import kotlinx.android.synthetic.main.activity_restaurant_list.*

class RestaurantListActivity : BaseActivity(),RestaurantContractor.View {
    private val presenter by lazy {
        RestaurantPresenter()
    }

    private val restaurantAdapter by lazy {
        RestaurantListAdpater()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_list)

        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
        }
        presenter.attachView(this)
        restaurantRecycler.apply{
//            layoutManager = LinearLayoutManager(this@RestaurantListActivity)
            layoutManager = GridLayoutManager(this@RestaurantListActivity,2)
            adapter = restaurantAdapter
        }
//        presenter.loadItem()
        presenter.loadRestaurantList()

    }

//    override fun showRestaurantData(data: List<PlayingListData>) {
//        restaurantAdapter.items = data
//    }
    override fun showRestaurantData(data: List<RestaurantData>) {
        restaurantAdapter.items = data
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}
