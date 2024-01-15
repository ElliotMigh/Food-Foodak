package com.example.foodfoodak.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.foodfoodak.Fragments.fragmentSplashAbout1
import com.example.foodfoodak.Fragments.fragmentSplashAbout2
import com.example.foodfoodak.Fragments.fragmentSplashAbout3

class viewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                return fragmentSplashAbout1()
            }
            1 -> {
                return fragmentSplashAbout2()
            }
            2 -> {
                return fragmentSplashAbout3()
            }
            else -> {
                return Fragment()
            }
        }
    }
}