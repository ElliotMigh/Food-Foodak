package com.example.foodfoodak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.foodfoodak.Adapters.viewPagerAdapter
import com.example.foodfoodak.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //create binding:
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}