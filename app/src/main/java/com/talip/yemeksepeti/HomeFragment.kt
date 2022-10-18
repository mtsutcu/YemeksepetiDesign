package com.talip.yemeksepeti

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.talip.yemeksepeti.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(inflater,container,false)



        val imageListKampanyalar = ArrayList<String>()

        val image1 = "ys_kamp1"
        val image2 = "ys_kamp2"
        val image3 = "ys_kamp3"
        val image4 = "ys_kamp4"
        val image5 = "ys_kamp5"
        val image6 = "ys_kamp6"

        imageListKampanyalar.add(image1)
        imageListKampanyalar.add(image2)
        imageListKampanyalar.add(image3)
        imageListKampanyalar.add(image4)
        imageListKampanyalar.add(image5)
        imageListKampanyalar.add(image6)

        val image_mutfak1 = "ys_mutfak1"
        val image_mutfak2 = "ys_mutfak2"


        val imageListMutfaklar = ArrayList<String>()
        imageListMutfaklar.add(image_mutfak1)
        imageListMutfaklar.add(image_mutfak2)



        //binding.include.includeNested.nested_rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.include.includeNested.nestedRv.layoutManager =  StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        binding.include.includeNested.nestedRvMutfaklar.layoutManager  = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)


        val adapterKampanyalar = ImageAdapter(requireContext(),imageListKampanyalar)
        binding.include.includeNested.nestedRv.adapter = adapterKampanyalar

        val adapterMutfaklar = ImageMutfakHomeAdapter(requireContext(),imageListMutfaklar)
        binding.include.includeNested.nestedRvMutfaklar.adapter = adapterMutfaklar



        binding.include.searchButton.setOnClickListener {
            Snackbar.make(it,"Search tıklandı",Snackbar.LENGTH_SHORT).show()


        }

        binding.include.includeNested.includeCategories.imageView8.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toFood)
        }




        return binding.root

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onResume() {
        super.onResume()
        requireActivity().window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        requireActivity().window.statusBarColor = Color.rgb(234,1,75)
    }


}