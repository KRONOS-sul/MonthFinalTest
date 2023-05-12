package com.example.monthfinaltest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.monthfinaltest.databinding.ItemFoodBinding
import com.example.monthfinaltest.entities.FoodEntity

class FoodAdapter(
    private val arrayList: ArrayList<FoodEntity>,
    val onClick: (FoodEntity) -> Unit
) : RecyclerView.Adapter<FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        return FoodViewHolder(ItemFoodBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.onBind(arrayList[position])
        holder.itemView.setOnClickListener {
            onClick(arrayList[position])
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}

class FoodViewHolder(private val binding: ItemFoodBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun onBind(food: FoodEntity) {
        binding.foodNameTv.text = food.foodName
        binding.deliveryTimeTv.text = food.deliveryTime
        binding.distanceTv.text = food.distance.toString()
    }

}