package com.feritakcan.concatadapterexample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.feritakcan.concatadapterexample.R
import com.feritakcan.concatadapterexample.model.Header
import kotlinx.android.synthetic.main.item_header.view.*

class HeaderAdapter(private val header: Header) : RecyclerView.Adapter<HeaderAdapter.DataViewHolder>() {

   inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(header: Header) = with(itemView){
            tvName.text = header.title
            tvAboutMe.text = header.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_header, parent, false)
        )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) = holder.bind(header)

    override fun getItemCount(): Int = 1

}