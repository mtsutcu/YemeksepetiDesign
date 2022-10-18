package com.talip.yemeksepeti

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.talip.yemeksepeti.databinding.ImageTasarimMutfakHomeBinding

class ImageMutfakHomeAdapter(var mContext: Context, var imageList:List<String>)
    : RecyclerView.Adapter<ImageMutfakHomeAdapter.ImageMutfaklarTasarimTutucu>() {

    inner class ImageMutfaklarTasarimTutucu(tasarim: ImageTasarimMutfakHomeBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:ImageTasarimMutfakHomeBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageMutfaklarTasarimTutucu {
        val tasarim = ImageTasarimMutfakHomeBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ImageMutfaklarTasarimTutucu(tasarim)
    }


    override fun onBindViewHolder(holder: ImageMutfaklarTasarimTutucu, position: Int) {
        val image = imageList.get(position)
        val t = holder.tasarim



        t.imageViewMutfaklar.setBackgroundResource(mContext.resources.getIdentifier(image,"drawable",mContext.packageName))

    }



    override fun getItemCount(): Int {
        return imageList.size
    }
}