package com.talip.yemeksepeti

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.talip.yemeksepeti.databinding.FoodMutfaklarTasarimBinding
import com.talip.yemeksepeti.databinding.ImageTasarimBinding

class FoodMutfaklarAdapter(var mContext: Context, var imageList:List<String>)
    : RecyclerView.Adapter<FoodMutfaklarAdapter.FoodMutfaklarTasarimtutucu>() {

    inner class FoodMutfaklarTasarimtutucu(tasarim: FoodMutfaklarTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: FoodMutfaklarTasarimBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodMutfaklarTasarimtutucu {
        val tasarim = FoodMutfaklarTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return FoodMutfaklarTasarimtutucu(tasarim)
    }


    override fun onBindViewHolder(holder: FoodMutfaklarTasarimtutucu, position: Int) {
        val image = imageList.get(position)
        val t = holder.tasarim


        t.imageView4.setBackgroundResource(mContext.resources.getIdentifier(image,"drawable",mContext.packageName))

    }



    override fun getItemCount(): Int {
        return imageList.size
    }
}