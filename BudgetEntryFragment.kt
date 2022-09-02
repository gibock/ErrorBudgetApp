package com.example.budgetapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.budgetapp.R
import com.example.budgetapp.databinding.FragmentBudgetEntryBinding

class BudgetEntryFragment : Fragment(R.layout.fragment_budget_entry) {

    lateinit var binding: FragmentBudgetEntryBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBudgetEntryBinding.bind(view)
    }
}