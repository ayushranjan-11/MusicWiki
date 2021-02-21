package com.example.musicwiki.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicwiki.R

//class ViewPagerAdapter(
//        val images: List<Int>
//) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
//    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
//        val view =LayoutInflater.from(parent.context).inflate(R.layout.view_pager_items,parent,false)
//        return ViewPagerViewHolder(view)
//    }
//
////    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
////        val currentImages = images[position]
////        holder.itemView.imageView1.setImageResource(currentImages)
////    }
//
//    override fun getItemCount(): Int {
//        return images.size
//    }
//}