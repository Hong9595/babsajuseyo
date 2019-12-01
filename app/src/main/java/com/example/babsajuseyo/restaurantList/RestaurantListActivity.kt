package com.example.babsajuseyo.restaurantList

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import com.example.babsajuseyo.MainActivity
import com.example.babsajuseyo.R
import com.example.babsajuseyo.base.BaseActivity
import com.example.babsajuseyo.entity.RestaurantData
import com.example.babsajuseyo.searchSchool.SearchSchoolActivity
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

        // toolbar set해주면 getSupportActionBar()로 불러올 수 있다.
        // TODO: toolbar가 어떻게 actionbar type으로 바뀌는건지. + 툴바에 밑줄 왜 사라져있는지?..
        setSupportActionBar(mainToolbar)
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            title=""
//            setBackgroundDrawable(null)
            initView()
        }


        presenter.attachView(this)
        restaurantRecycler.apply{
            layoutManager = GridLayoutManager(this@RestaurantListActivity,2)
            adapter = restaurantAdapter
        }
        presenter.loadRestaurantList()

    }

    fun initView(){
        toolbarSearch.setOnClickListener{ view ->
            val intent = Intent(this,SearchSchoolActivity::class.java)
            startActivity(intent)
        }

        toolbarMore.setOnClickListener { view ->

        }

    }


    override fun showRestaurantData(data: List<RestaurantData>) {
        restaurantAdapter.items = data
    }



    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }


//    // toolbar에 menu 추가
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.toolbar_actions, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when(item.itemId){
//            R.id.actionSearch -> {
//                // 검색창으로 이동
////                val intent = Intent(this,MainActivity::class.java)
////                startActivity(intent)
//                return true
//            }
//
//            R.id.actionMore -> {
//                // 개인 정보 창.
//                return true
//            }
//
//            // 처리될 아이템이 아니면 super를 통해 기본 메뉴처리 동작 실행. 기본적으로 false return.
//            else -> {
//                return super.onOptionsItemSelected(item)
//            }
//
//        }
//        return super.onOptionsItemSelected(item)
//    }
}
