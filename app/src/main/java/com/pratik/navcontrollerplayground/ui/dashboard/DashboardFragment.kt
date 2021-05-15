package com.pratik.navcontrollerplayground.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.pratik.navcontrollerplayground.R
import com.pratik.navcontrollerplayground.databinding.FragmentDashboardBinding
import com.pratik.navcontrollerplayground.model.User

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        binding.button.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_navigation_dashboard_to_cameraFragment)
        }

        binding.btnParcelableLink.setOnClickListener {
            val user = User("pratik", 12, "Software Developer")
            DashboardFragmentDirections.actionNavigationDashboardToCameraFragment(user)
        }
        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}