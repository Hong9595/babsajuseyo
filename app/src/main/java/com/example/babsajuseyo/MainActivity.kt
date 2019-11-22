package com.example.babsajuseyo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.babsajuseyo.restaurantList.RestaurantListActivity
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.SingleSource
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber
import java.util.*

/**
 *
 */
class MainActivity : AppCompatActivity() {


    // 2. 화면 만들어주고
    // 3. 클릭하면 디테일

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tempBtn.setOnClickListener { view ->
            val intent = Intent(this,RestaurantListActivity::class.java)
            startActivity(intent)
        }
    }


}
