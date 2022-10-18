package com.talip.yemeksepeti

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.talip.yemeksepeti.databinding.FoodYsTeslimatTasarimBinding
import com.talip.yemeksepeti.databinding.TumRestoranlarTasarimBinding

class FoodtumrestoranlarAdapter(var mContext: Context, var imageList:List<String>)
    : RecyclerView.Adapter<FoodtumrestoranlarAdapter.ImageTumRestoranlarTutucu>() {

    inner class ImageTumRestoranlarTutucu(tasarim: TumRestoranlarTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: TumRestoranlarTasarimBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageTumRestoranlarTutucu {
        val tasarim = TumRestoranlarTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ImageTumRestoranlarTutucu(tasarim)
    }


    override fun onBindViewHolder(holder: ImageTumRestoranlarTutucu, position: Int) {
        val image = imageList.get(position)
        val t = holder.tasarim


        t.imageView9.setBackgroundResource(mContext.resources.getIdentifier(image,"drawable",mContext.packageName))

    }



    override fun getItemCount(): Int {
        return imageList.size
    }
}