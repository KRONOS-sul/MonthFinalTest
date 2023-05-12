package com.example.monthfinaltest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.monthfinaltest.adapter.FoodAdapter
import com.example.monthfinaltest.databinding.FragmentHomeBinding
import com.example.monthfinaltest.entities.FoodEntity

class HomeFragment : Fragment() {
    private val arrayList = ArrayList<FoodEntity>()
    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: FoodAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arrayList.add(FoodEntity("Accapella spicy", "12-50min", 1.6))
        arrayList.add(FoodEntity("Del Houra", "3-5min", 0.45))
        arrayList.add(FoodEntity("Cinderella vague", "120-180min", 6.0))

        adapter = FoodAdapter(arrayList) {
            binding.mainRecyclerView.adapter = adapter
        }
    }

}