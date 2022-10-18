package com.talip.yemeksepeti

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.talip.yemeksepeti.databinding.FragmentFoodBinding


class FoodFragment : Fragment() {
    private lateinit var binding: FragmentFoodBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFoodBinding.inflate(inflater, container, false)
        binding.imageViewBack.setOnClickListener {
            activity?.onBackPressed()
        }


        val imageListKampanyalar = ArrayList<String>()

        val imageKamp1 = "ys_foods"
        val imageKamp2 = "ys_foods2"
        val imageKamp3 = "ys_foods3"


        imageListKampanyalar.add(imageKamp1)
        imageListKampanyalar.add(imageKamp2)
        imageListKampanyalar.add(imageKamp3)


       binding.include.includeNestedFood.nestedFoodRv.layoutManager=  StaggeredGridLayoutManager(1,
            StaggeredGridLayoutManager.HORIZONTAL)



        val adapterKampanyalar = FoodKampanyaAdapter(requireContext(),imageListKampanyalar)

        binding.include.includeNestedFood.nestedFoodRv.adapter = adapterKampanyalar

        val imageMutfakList = ArrayList<String>()
        val imageMutfak1 = "ys_food_mutfaklar1"
        val imageMutfak2 = "ys_food_mutfaklar2"
        imageMutfakList.add(imageMutfak1)
        imageMutfakList.add(imageMutfak2)

        binding.include.includeNestedFood.nestedFoodMutfaklarRv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val adapterMutfaklar = FoodMutfaklarAdapter(requireContext(),imageMutfakList)
        binding.include.includeNestedFood.nestedFoodMutfaklarRv.adapter  = adapterMutfaklar



        val imageListPopuler = ArrayList<String>()

        val imagePopuler1 = "ys_populer1"
        val imagePopuler2 = "ys_populer2"
        val imagePopuler3 = "ys_populer1"



        imageListPopuler.add(imagePopuler1)

        imageListPopuler.add(imagePopuler2)
        imageListPopuler.add(imagePopuler3)

        val adapterPopuler = FoodRestoranlarAdapter(requireContext(),imageListPopuler)
        binding.include.includeNestedFood.nestedFoodPopulerRv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.include.includeNestedFood.nestedFoodPopulerRv.adapter  = adapterPopuler


        val imageListYsTeslimat = ArrayList<String>()

        val imageYsTeslimat1 = "ys_teslimat1"
        val imageYsTeslimat2 = "ys_teslimat2"
        val imageYsTeslimat3 = "ys_teslimat3"
        val imageYsTeslimat4 = "ys_teslimat4"


        imageListYsTeslimat.add(imageYsTeslimat1)
        imageListYsTeslimat.add(imageYsTeslimat2)
        imageListYsTeslimat.add(imageYsTeslimat3)
        imageListYsTeslimat.add(imageYsTeslimat4)

        val adapterYsTeslimat = FoodRestoranlarAdapter(requireContext(),imageListYsTeslimat)
        binding.include.includeNestedFood.nestedFoodYsTeslimat.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.include.includeNestedFood.nestedFoodYsTeslimat.adapter  = adapterYsTeslimat


        val imageListTumRestoranlar = ArrayList<String>()


        val imageTum1 = "ys_tum1"
        val imageTum2 = "ys_tum2"


        imageListTumRestoranlar.add(imageTum1)
        imageListTumRestoranlar.add(imageTum2)

        val adapterTumRestoranlar= FoodtumrestoranlarAdapter(requireContext(),imageListTumRestoranlar)
        binding.include.includeNestedFood.nestedFoodTumRv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)
        binding.include.includeNestedFood.nestedFoodTumRv.adapter  = adapterTumRestoranlar


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireActivity().window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        requireActivity().window.statusBarColor = Color.WHITE
    }


}