package com.example.tedarikcisecimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tedarikcisecimi.databinding.FragmentChoiceBinding

class ChoiceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentChoiceBinding>(
            inflater,
            R.layout.fragment_choice,
            container,
            false
        )
        binding.btnResult.setOnClickListener {
            findNavController().navigate(R.id.action_choiceFragment_to_resultFragment)
        }
        return binding.root
    }
}