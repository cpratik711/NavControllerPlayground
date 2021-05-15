package com.pratik.navcontrollerplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.pratik.navcontrollerplayground.databinding.ActivitySingleNavBinding

class SingleNavigationBarActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySingleNavBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingleNavBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.nav_host_fragment)
        setupActionBarWithNavController(navController)
    }

    //This makes the up back button work
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}