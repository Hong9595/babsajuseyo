package com.example.babsajuseyo.searchSchool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.babsajuseyo.base.BaseActivity
import com.example.babsajuseyo.entity.RestaurantData
import com.example.babsajuseyo.restaurantList.RestaurantListAdpater
import kotlinx.android.synthetic.main.activity_restaurant_list.*
import kotlinx.android.synthetic.main.activity_search_school.*


class SearchSchoolActivity : BaseActivity(), SearchSchoolContract.View {
    private val searchSchoolPresenter by lazy {
        SearchSchoolPresenter()
    }
    private val searchRestaurantAdapter by lazy{
        RestaurantListAdpater()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.babsajuseyo.R.layout.activity_search_school)

        setSupportActionBar(searchToolbar)
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
//            title="title임니다"
        }

        searchSchoolPresenter.attachView(this)
        searchRecycler.apply {
            layoutManager = GridLayoutManager(this@SearchSchoolActivity,2)
            adapter = searchRestaurantAdapter
        }

        searchClearEditText.setOnEditorActionListener{ v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_SEARCH){
                // data 요청
                searchSchoolPresenter.loadNearbyRestaurant(searchClearEditText.text.toString())
                showLoading()
            } else {
                false
            }
            true
        }
    }


    fun showLoading(){
        searchLoading.visibility = View.VISIBLE
    }

    fun hideLoading(){
        searchLoading.visibility = View.INVISIBLE
    }

    override fun showNearbyRestaurant(data: List<RestaurantData>) {
        searchRestaurantAdapter.items = data
        hideLoading()
    }

    override fun onDestroy() {
        super.onDestroy()
        searchSchoolPresenter.detachView()
    }
}
