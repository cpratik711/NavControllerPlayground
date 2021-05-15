package com.pratik.navcontrollerplayground.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.pratik.navcontrollerplayground.R
import com.pratik.navcontrollerplayground.databinding.FragmentChooseReceiverBinding

class ChooseReceiverFragment : Fragment() {

    private lateinit var binding: FragmentChooseReceiverBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChooseReceiverBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.btnNext.setOnClickListener {
            dataSendingWay2()
        }
        return root
    }

    fun dataSendingWay2() {
        val action =
            ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCashReceiverFragment(
                binding.etReceiverName.text.toString()
            )
        findNavController().navigate(action)
    }


    fun dataSendingWay1() {
        val args = Bundle()
        args.putString("name", binding.etReceiverName.text.toString())
        findNavController().navigate(R.id.sendCashReceiverFragment, args)
    }


}