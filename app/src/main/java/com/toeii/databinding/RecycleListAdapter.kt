package com.toeii.databinding

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.content.Context
import androidx.databinding.DataBindingUtil
import com.toeii.databinding.databinding.ViewListItemBinding


class RecycleListAdapter(private var context: Context, private var datas: MutableList<Map<String,String>>) : RecyclerView.Adapter<RecycleListAdapter.ItemsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.view_list_item, parent, false)
        return ItemsHolder(v)
    }


    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: ItemsHolder, position: Int) {
        val item = datas[position]
        holder.binding?.example = item["name"]
    }


    class ItemsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding: ViewListItemBinding? = null
        init {
            binding = DataBindingUtil.bind(itemView)
        }
    }

}