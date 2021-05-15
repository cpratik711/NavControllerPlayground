package com.pratik.navcontrollerplayground.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.pratik.navcontrollerplayground.R
import com.pratik.navcontrollerplayground.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        binding.btn1.setOnClickListener {
            findNavController().navigate(R.id.chooseReceiverFragment)
        }

        binding.btn2.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_viewBalanceFragment)
        }

        binding.btn3.setOnClickListener {
            val action  = HomeFragmentDirections.actionNavigationHomeToViewTransactionsFragment()
            findNavController().navigate(action)
            //findNavController().navigate(R.id.action_navigation_home_to_viewTransactionsFragment)
        }



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    override fun onClick(v: View?) {
//        when (v?.id) {
//            R.id.btn1 -> {
//                //findNavController().navigate(R.id.sendMoneyFragment)
//                Log.e("called", "button 1 called")
//
//            }
//            R.id.btn2 -> {
//            }
//            R.id.btn3 -> {
//
//            }
//
//        }
//    }
}