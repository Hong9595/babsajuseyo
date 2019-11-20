package com.example.babsajuseyo.restaurantList

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.babsajuseyo.R
import com.example.babsajuseyo.entity.PlayingListData
import com.example.babsajuseyo.entity.RestaurantData
import com.example.babsajuseyo.util.Constants
import kotlinx.android.synthetic.main.item_restaurant_list.view.*


class RestaurantListAdpater : RecyclerView.Adapter<RestaurantViewHolder>(){

    var items = listOf<PlayingListData>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder  {
        Log.d("CreateViewhHolderTest",items.size.toString())
        return RestaurantViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_restaurant_list,parent,false
                )
        )
    }



    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bind(items[position])
    }

}
class RestaurantViewHolder(view: View) : RecyclerView.ViewHolder(view){

    fun bind(data: PlayingListData){
        val path = Constants.IMAGE_PATH + data.imagePath
        with(itemView){
            Glide.with(this)
                .load(path)
                .override(600,200)
                .fitCenter()
                .into(restaurantImage)

            itemView.restaurantName.text = data.movieName
            itemView.reviewScoreText.text = data.voteRate

        }
    }
}