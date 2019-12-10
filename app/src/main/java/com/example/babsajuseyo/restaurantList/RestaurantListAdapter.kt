package com.example.babsajuseyo.restaurantList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.babsajuseyo.R
import com.example.babsajuseyo.entity.RestaurantData
import com.example.babsajuseyo.util.ExtensionsViewHolder
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_restaurant_list.view.*
import kotlinx.android.synthetic.main.item_restaurant_list_grid.*

class RestaurantListAdpater : RecyclerView.Adapter<RestaurantViewHolder>(){
    var items = listOf<RestaurantData>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        return RestaurantViewHolder(parent)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bind(items[position])
    }


}
// LayoutContainer를 사용하면 android extensions 사용 가능.
class RestaurantViewHolder(parent: ViewGroup) :
    ExtensionsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant_list_grid,parent,false)){

    fun bind(data: RestaurantData){
        // https://www.androidhuman.com/lecture/kotlin/2017/11/26/kotlin_android_extensions_on_viewholder/
        // this는 ViewHolder임. LayoutContainer를 상속받은 ViewHolder class이므로 뷰 접근시에 findViewById 처음 1번만 해주고 해시맵으로 캐싱.
        with(this){
            Glide.with(this.itemView)
                .load(data.imageUrl) // "https://t1.daumcdn.net/thumb/R720x0/?fname=http://t1.daumcdn.net/brunch/service/user/12xD/image/cozOd3VCSooVzbPKtpE9TPIHUUo.JPG"
                .into(restaurantImage)
            restaurantName.text = data.title
            addressText.text = data.address
        }
    }
}
// 수정 전.
//class RestaurantListAdpater : RecyclerView.Adapter<RestaurantViewHolder>(){
//    var items = listOf<RestaurantData>()
//        set(value) {
//            field = value
//            notifyDataSetChanged()
//        }
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
//        return RestaurantViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant_list_grid,parent,false)
//    }
//
//    override fun getItemCount(): Int = items.size
//
//    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
//        holder.bind(items[position])
//    }
//
//
//}
//// LayoutContainer를 사용하면 android extensions 사용 가능.
//class RestaurantViewHolder(view: View) :RecyclerView.ViewHolder(view){
//    fun bind(data: RestaurantData){
//        // https://www.androidhuman.com/lecture/kotlin/2017/11/26/kotlin_android_extensions_on_viewholder/
//        // this는 ViewHolder임. LayoutContainer를 상속받은 ViewHolder class이므로 뷰 접근시에 findViewById 처음 1번만 해주고 해시맵으로 캐싱.
//        with(this){
//            Glide.with(this.itemView)
//                .load(data.imageUrl) // "https://t1.daumcdn.net/thumb/R720x0/?fname=http://t1.daumcdn.net/brunch/service/user/12xD/image/cozOd3VCSooVzbPKtpE9TPIHUUo.JPG"
//                .into(restaurantImage)
//            restaurantName.text = data.title
//            addressText.text = data.address
//        }
//    }
//}
