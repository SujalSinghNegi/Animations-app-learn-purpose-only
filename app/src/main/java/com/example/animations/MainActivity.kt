package com.example.animations

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import com.example.animations.databinding.ActivityMainBinding
import com.example.animations.utils.setupBottomBarNavigation
import nl.joery.animatedbottombar.AnimatedBottomBar
import kotlin.getValue
class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        // Tab ID to Destination Fragment ID mapping
        val tabDestinations = mapOf(
            R.id.tab_local   to R.id.blankFragment,
            R.id.tab_online  to R.id.blankFragment2,
            R.id.tab_advance to R.id.blankFragment3,
        )

        setupBottomBarNavigation(binding.bottomBar, navController, tabDestinations)
    }
}
