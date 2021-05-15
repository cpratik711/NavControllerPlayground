package com.pratik.navcontrollerplayground.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pratik.navcontrollerplayground.R
import com.pratik.navcontrollerplayground.databinding.FragmentHomeBinding
import com.pratik.navcontrollerplayground.databinding.FragmentViewBalanceBinding

class ViewBalanceFragment : Fragment() {

    private lateinit var binding: FragmentViewBalanceBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewBalanceBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }


}