package com.pratik.navcontrollerplayground

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pratik.navcontrollerplayground.databinding.FragmentAboutBinding
import com.pratik.navcontrollerplayground.model.Utils

class AboutFragment : Fragment() {


    private lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAboutBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return root
    }

}