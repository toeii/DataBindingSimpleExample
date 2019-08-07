package com.toeii.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.toeii.databinding.databinding.ActivityBeanBinding

class BeanBindActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityBeanBinding>(this@BeanBindActivity,R.layout.activity_bean)

        binding.visible = true
        val user = User()
        user.name = "zhang san"
        binding.user = user

    }



}