package com.pratik.navcontrollerplayground.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.pratik.navcontrollerplayground.databinding.FragmentConfirmDialogBinding

class ConfirmDialogFragment : BottomSheetDialogFragment() {


    val args:ConfirmDialogFragmentArgs by navArgs()
    private lateinit var binding: FragmentConfirmDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConfirmDialogBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val receiverName = args.receiverName
        val amount = args.amount

        binding.tvMessage.text = "Do you wanna send Rs.${amount} to ${receiverName}?"

        binding.btnYes.setOnClickListener {
           dismiss()
        }

        binding.btnNo.setOnClickListener {
            dismiss()
        }
        return root
    }


}