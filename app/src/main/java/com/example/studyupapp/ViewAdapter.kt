package com.example.studyupapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter.view.*

class ViewAdapter(private val Cousres: List<Cousre>) : RecyclerView.Adapter<ViewAdapter.itemViewHolder>() {
    class itemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        return itemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.adapter
                , parent
                , false
            )
        )

    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val Cousres = Cousres[position]
        holder.itemView.apply {
           tvTitle.text = Cousres.title
           tvDescription.text = Cousres.description
        }
    }

    override fun getItemCount() : Int = Cousres.size
}