package com.feritakcan.concatadapterexample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.feritakcan.concatadapterexample.R
import com.feritakcan.concatadapterexample.model.User
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter(val users: List<User>) : RecyclerView.Adapter<UserAdapter.DataViewHolder>() {
    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) = with(itemView) {
            Glide.with(context).load(user.avatar).into(ivProfile)
            tvName.text = user.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_user, parent, false
            )
        )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    override fun getItemCount(): Int = users.size
}