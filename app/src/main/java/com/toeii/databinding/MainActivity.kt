package com.toeii.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.toeii.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),IMainActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this@MainActivity,R.layout.activity_main)

        binding.beanText = "基本数据绑定示例"

        binding.listText = "RecycleListView数据绑定示例"

        binding.iMainActivity = this

    }

    override fun clickedBeanGoing() {
        startActivity(Intent(this@MainActivity,BeanBindActivity::class.java))
    }

    override fun clickedRecycleListGoing() {
        startActivity(Intent(this@MainActivity,RecycleListActivity::class.java))
    }

}
