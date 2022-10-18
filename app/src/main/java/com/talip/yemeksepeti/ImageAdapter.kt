package com.talip.yemeksepeti

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.talip.yemeksepeti.databinding.ImageTasarimBinding
import com.talip.yemeksepeti.databinding.ImageTasarimMutfakHomeBinding

class ImageAdapter(var mContext: Context, var imageList:List<String>)
    : RecyclerView.Adapter<ImageAdapter.ImageTasarimTutucu>() {

    inner class ImageTasarimTutucu(tasarim:ImageTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:ImageTasarimBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageTasarimTutucu {
        val tasarim = ImageTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ImageTasarimTutucu(tasarim)
    }


    override fun onBindViewHolder(holder: ImageTasarimTutucu, position: Int) {
        val image = imageList.get(position)
        val t = holder.tasarim


        t.imageView.setBackgroundResource(mContext.resources.getIdentifier(image,"drawable",mContext.packageName))

    }



    override fun getItemCount(): Int {
        return imageList.size
    }
}