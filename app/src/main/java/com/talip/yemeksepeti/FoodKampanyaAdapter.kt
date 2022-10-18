package com.talip.yemeksepeti

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.talip.yemeksepeti.databinding.FoodKampanyaTasarimBinding
import com.talip.yemeksepeti.databinding.ImageTasarimBinding

class FoodKampanyaAdapter(var mContext: Context, var imageList:List<String>)
    : RecyclerView.Adapter<FoodKampanyaAdapter.FoodKampanyaTutucu>() {

    inner class FoodKampanyaTutucu(tasarim: FoodKampanyaTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: FoodKampanyaTasarimBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodKampanyaTutucu {
        val tasarim = FoodKampanyaTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return FoodKampanyaTutucu(tasarim)
    }


    override fun onBindViewHolder(holder: FoodKampanyaTutucu, position: Int) {
        val image = imageList.get(position)
        val t = holder.tasarim


        t.imageViewFoodKamp.setBackgroundResource(mContext.resources.getIdentifier(image,"drawable",mContext.packageName))

    }



    override fun getItemCount(): Int {
        return imageList.size
    }
}