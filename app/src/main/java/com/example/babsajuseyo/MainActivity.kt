package com.example.babsajuseyo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.babsajuseyo.restaurantList.RestaurantListActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tempBtn.setOnClickListener { view ->
            val intent = Intent(this,RestaurantListActivity::class.java)
            startActivity(intent)
        }
    }


}
