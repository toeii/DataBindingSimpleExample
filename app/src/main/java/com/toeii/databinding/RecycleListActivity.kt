package com.toeii.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.toeii.databinding.databinding.ActivityListBinding

class RecycleListActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityListBinding>(this@RecycleListActivity,R.layout.activity_list)

        val datas : MutableList<Map<String,String>> = arrayListOf()
        for(index in 1..30){
            val map:HashMap<String,String> = HashMap<String,String>()
            map["name"] = if(index % 2 == 0) "张$index" else "王$index"
            datas.add(map)
        }

        binding.rlContent.adapter = RecycleListAdapter(this@RecycleListActivity,datas)

    }



}