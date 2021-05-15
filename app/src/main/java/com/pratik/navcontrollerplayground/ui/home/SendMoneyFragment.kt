package com.pratik.navcontrollerplayground.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pratik.navcontrollerplayground.databinding.FragmentSendMoneyBinding

class SendMoneyFragment : Fragment() {

    private lateinit var binding: FragmentSendMoneyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSendMoneyBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }


}