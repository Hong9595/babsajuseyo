package com.example.babsajuseyo.restaurantList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
            layoutManager = LinearLayoutManager(this@RestaurantListActivity)
            adapter = restaurantAdapter
        }
        presenter.loadItem()
//        dummy()
    }

//    fun dummy(){
//        var items = mutableListOf<RestaurantData>()
//        val data:RestaurantData = RestaurantData("1번 url","1번 가게명")
//        val data2:RestaurantData = RestaurantData("2번 url","2번 가게명")
//        val data3:RestaurantData = RestaurantData("3번 url","3번 가게명")
//        val data4:RestaurantData = RestaurantData("4번 url","4번 가게명")
//        val data5:RestaurantData = RestaurantData("5번 url","5번 가게명")
//        val data6:RestaurantData = RestaurantData("6번 url","6번 가게명")
//        val data7:RestaurantData = RestaurantData("7번 url","7번 가게명")
//        val data8:RestaurantData = RestaurantData("8번 url","8번 가게명")
//        items.add(data)
//        items.add(data2)
//        items.add(data3)
//        items.add(data4)
//        items.add(data5)
//        items.add(data6)
//        items.add(data7)
//        items.add(data8)
//        showRestaurantData(items)
//    }

    override fun showRestaurantData(data: List<PlayingListData>) {
        restaurantAdapter.items = data
    }
    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}
