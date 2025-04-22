package com.example.animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.animations.databinding.FragmentBlank2Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class BlankFragment2 : Fragment() {
    val binding by lazy {
        FragmentBlank2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding.button.setOnClickListener {
            val navController= findNavController()
            navController.navigate(R.id.action_blankFragment2_to_blankFragment3)
        }
        binding.showSplash.setOnClickListener {
            binding.airbnbScreen.apply {
               visibility= View.VISIBLE
                playAnimation()
                lifecycleScope.launch {
                    delay(7000)
                    visibility= View.GONE

                }

            }

        }
        return binding.root

    }

    companion object {


    }
}