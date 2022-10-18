package com.talip.yemeksepeti

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.talip.yemeksepeti.databinding.FoodYsTeslimatTasarimBinding
import com.talip.yemeksepeti.databinding.ImageTasarimBinding

class FoodRestoranlarAdapter(var mContext: Context, var imageList:List<String>)
    : RecyclerView.Adapter<FoodRestoranlarAdapter.ImageRestoranlarTutucu>() {

    inner class ImageRestoranlarTutucu(tasarim: FoodYsTeslimatTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: FoodYsTeslimatTasarimBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageRestoranlarTutucu {
        val tasarim = FoodYsTeslimatTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ImageRestoranlarTutucu(tasarim)
    }


    override fun onBindViewHolder(holder: ImageRestoranlarTutucu, position: Int) {
        val image = imageList.get(position)
        val t = holder.tasarim


        t.imageView7.setBackgroundResource(mContext.resources.getIdentifier(image,"drawable",mContext.packageName))

    }



    override fun getItemCount(): Int {
        return imageList.size
    }
}