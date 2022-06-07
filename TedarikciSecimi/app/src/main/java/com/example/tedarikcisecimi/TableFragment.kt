package com.example.tedarikcisecimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tedarikcisecimi.databinding.FragmentTableBinding

class TableFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentTableBinding>(
            inflater,
            R.layout.fragment_table,
            container,
            false
        )
        binding.btnCalculate.setOnClickListener {
            findNavController().navigate(R.id.action_tableFragment_to_choiceFragment)
        }
        return binding.root
    }
}