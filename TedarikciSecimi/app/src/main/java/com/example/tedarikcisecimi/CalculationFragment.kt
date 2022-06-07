package com.example.tedarikcisecimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tedarikcisecimi.databinding.FragmentCalculationBinding

class CalculationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentCalculationBinding>(
            inflater,
            R.layout.fragment_calculation,
            container,
            false
        )
        binding.btnContinue.setOnClickListener {
            findNavController().navigate(R.id.action_calculationFragment_to_tableFragment)
        }
        return binding.root
    }
}