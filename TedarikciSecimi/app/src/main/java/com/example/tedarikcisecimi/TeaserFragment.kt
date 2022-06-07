package com.example.tedarikcisecimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tedarikcisecimi.databinding.FragmentTeaserBinding

class TeaserFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentTeaserBinding>(
            inflater,
            R.layout.fragment_teaser, container, false
        )
        binding.btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_teaserFragment_to_registerFragment)
        }
        return binding.root
    }

}