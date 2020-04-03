package com.dj.testnavigation.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dj.testnavigation.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigate_to_home_detail_button.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_homeDetailFragment)
        }
    }
}