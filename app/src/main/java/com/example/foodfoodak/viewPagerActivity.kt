package com.example.foodfoodak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfoodak.Adapters.viewPagerAdapter
import com.example.foodfoodak.databinding.ActivityViewPagerBinding

class viewPagerActivity : AppCompatActivity() {
    //create binding:
    lateinit var binding:ActivityViewPagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //show viewPager slide:
        showViewPager()
    }
    private fun showViewPager() {
        val myAdapter = viewPagerAdapter(this)
        binding.viewPagerAbout.adapter = myAdapter

    }
}