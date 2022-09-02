package com.example.budgetapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.budgetapp.R
import com.example.budgetapp.databinding.FragmentCalenderViewBinding

class CaledarViewFragment : Fragment(R.layout.fragment_calender_view) {

    lateinit var binding: FragmentCalenderViewBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCalenderViewBinding.bind(view)
    }


}