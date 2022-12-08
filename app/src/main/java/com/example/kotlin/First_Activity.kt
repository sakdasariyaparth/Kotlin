package com.example.kotlin

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlin.databinding.ActivityFirstBinding

class First_Activity : AppCompatActivity() {

    private var binder: ActivityFirstBinding?=null
        lateinit var activity:Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        binder = DataBindingUtil.setContentView(activity,R.layout.activity_first)
    }
}