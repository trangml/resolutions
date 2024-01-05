package com.example.resolutions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import androidx.navigation.fragment.findNavController

class ResolutionAdapter(private val resolutions: List<Resolution>) : RecyclerView.Adapter<ResolutionAdapter.ResolutionViewHolder>() {

    class ResolutionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewResolution: TextView = itemView.findViewById(R.id.textViewResolution)
        var checkBoxCompleted: CheckBox = itemView.findViewById(R.id.checkBoxCompleted)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResolutionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.resolution_item, parent, false)
        return ResolutionViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResolutionViewHolder, position: Int) {
        val currentItem = resolutions[position]
        holder.textViewResolution.text = currentItem.text
        holder.checkBoxCompleted.isChecked = currentItem.isCompleted
    }

    override fun getItemCount() = resolutions.size
}