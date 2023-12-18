package com.pragadees.rickandmortyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RickMortyAdapter : RecyclerView.Adapter<RickMortyAdapter.ViewHolder>(){

    var list = ArrayList<Result>()
    fun setData(list : List<Result>){
        this.list = list as ArrayList<Result>
        notifyDataSetChanged()
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val characterName : TextView = view.findViewById(R.id.characterName)
        val characterImage : ImageView= view.findViewById(R.id.characterImage)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.rick_morty_layout , parent , false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.characterName.text = list[position].name
        Glide.with(holder.itemView).load(list[position].image).into(holder.characterImage)
    }

}