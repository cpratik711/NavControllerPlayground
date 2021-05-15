package com.pratik.navcontrollerplayground.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.pratik.navcontrollerplayground.MobileNavigationDirections
import com.pratik.navcontrollerplayground.databinding.FragmentSettingsBinding
import com.pratik.navcontrollerplayground.model.Utils

class SettingsFragment : Fragment() {


    private lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSettingsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.btnSave.setOnClickListener {
            val enterAmount = binding.etDefaultAmout.text.toString()
            if (enterAmount.isNotEmpty()) {
                Utils.saveAmount.value = enterAmount.toLong()
            }
        }

        binding.btnAboutApp.setOnClickListener {
            val action =
            MobileNavigationDirections.actionGlobalAboutFragment()
            findNavController().navigate(action)
        }
        return root
    }

}