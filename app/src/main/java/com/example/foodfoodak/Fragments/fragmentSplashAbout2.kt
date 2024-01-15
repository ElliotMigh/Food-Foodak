package com.example.foodfoodak.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.foodfoodak.databinding.FragmentSplashAbout1Binding
import com.example.foodfoodak.databinding.FragmentSplashAbout2Binding

class fragmentSplashAbout2 : Fragment() {

    //create binding:
    lateinit var binding: FragmentSplashAbout2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashAbout2Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}