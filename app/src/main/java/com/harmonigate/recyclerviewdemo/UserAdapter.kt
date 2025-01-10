package com.harmonigate.recyclerviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.harmonigate.recyclerviewdemo.databinding.UserItemLayoutBinding

class UserAdapter(val userList: List<String>):RecyclerView.Adapter<UserAdapter.UserItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserItemViewHolder {
        val itemBinding:UserItemLayoutBinding=
            UserItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return UserItemViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserItemViewHolder, position: Int) {
        holder.binding.tvUserName.text=userList[position]
    }

    inner class UserItemViewHolder(val binding: UserItemLayoutBinding):RecyclerView.ViewHolder(binding.root){

    }
}