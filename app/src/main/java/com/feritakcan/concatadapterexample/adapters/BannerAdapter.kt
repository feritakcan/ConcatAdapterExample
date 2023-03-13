package com.feritakcan.concatadapterexample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.feritakcan.concatadapterexample.R
import com.feritakcan.concatadapterexample.model.Banner
import kotlinx.android.synthetic.main.item_banner.view.*

class BannerAdapter(private val banner: Banner) :
    RecyclerView.Adapter<BannerAdapter.DataViewHolder>() {

    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(banner: Banner) = with(itemView) {
            Glide.with(context).load(banner.bannerImage).into(ivBanner)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_banner, parent, false
            )
        )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(banner)
    }

    override fun getItemCount(): Int = 1
}