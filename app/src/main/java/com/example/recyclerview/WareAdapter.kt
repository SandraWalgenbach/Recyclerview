package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Data.Ware
import com.example.recyclerview.databinding.ListItemBinding

class WareAdapter(val dataset: List<Ware>): RecyclerView.Adapter<WareAdapter.WareViewHolder>() {

    inner class WareViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):WareViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WareViewHolder(binding)
    }

    override fun getItemCount(): Int{
        return dataset.size
    }

    override fun onBindViewHolder(holder: WareViewHolder, position: Int){
        val ware = dataset[position]

        holder.binding.textView.setText(ware.gegenstand)
    }

}