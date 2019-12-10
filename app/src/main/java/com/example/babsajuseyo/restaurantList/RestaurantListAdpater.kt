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
import timber.log.Timber


class RestaurantListAdpater : RecyclerView.Adapter<RestaurantViewHolder>(){

    var items = listOf<RestaurantData>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder  {
        return RestaurantViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_restaurant_list_grid,parent,false
                )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bind(items[position])
    }

}
class RestaurantViewHolder(view: View) : RecyclerView.ViewHolder(view){
    // TODO: 질문1. 이어서 이렇게 할 필요가 있나?? -> val먼저 선언 // findViewById?
//    private val restaurantImage = itemView.restaurantImage
//    private val restaurantName = itemView.restaurantName
//    private val addressText = itemView.addressText
//    private val view = itemView
    fun bind(data: RestaurantData){
//        Glide.with(view)
//            .load(data.ImageUrl)
//            .override(720,720) // TODO: 질문1. image size같은거 어떻게 해주지? + item_grid_layout엣서 패딩을 어떻게 줘야지 화면상 균일하게?..
//            .fitCenter()
//            .into(restaurantImage)
//        restaurantName.text = data.title
//        addressText.text = data.address

//        val path = Constants.IMAGE_PATH + data.imagePath
        with(itemView){
//            "https://t1.daumcdn.net/thumb/R720x0/?fname=http://t1.daumcdn.net/brunch/service/user/12xD/image/cozOd3VCSooVzbPKtpE9TPIHUUo.JPG"
            Glide.with(this)
                .load(data.imageUrl)
//                .override(720,720)
//                .fitCenter()
                .into(restaurantImage)

            restaurantName.text = data.title
            addressText.text = data.address

        }
    }
}