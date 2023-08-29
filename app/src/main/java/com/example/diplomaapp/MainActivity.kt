package com.example.diplomaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.diplomaapp.databinding.ActivityMainBinding
import com.example.diplomaapp.di.viewModel.ViewModelFactory
import com.example.diplomaapp.ui.sensor.SensorViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as DaggerApp).appComponent.inject(this)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNav: BottomNavigationView = binding.bottomNavigation
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        bottomNav.setupWithNavController(navController)

    }

}