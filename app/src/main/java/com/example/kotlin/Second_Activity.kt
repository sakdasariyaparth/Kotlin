package com.example.kotlin

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlin.databinding.ActivitySecondBinding

class Second_Activity : AppCompatActivity() {
    private var binding : ActivitySecondBinding?=null
    lateinit var activity: Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        binding = DataBindingUtil.setContentView(activity,R.layout.activity_second)
    }
}