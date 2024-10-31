package com.rehan.klinik.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rehan.klinik.R
import com.rehan.klinik.adapter.AdapterMenuIcon.MyViewHolder
import com.rehan.klinik.model.ModelTag

class AdapterTag(
    val itemTagList : List<ModelTag>
): RecyclerView.Adapter<AdapterTag.MyViewHolder> (){
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tag : TextView = itemView.findViewById(R.id.tag)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_tag,parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemTagList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemTagList[position]
        holder.tag.text = currentItem.tag

    }
}