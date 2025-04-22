package com.example.animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.animations.databinding.FragmentBlank3Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.getValue

class BlankFragment3 : Fragment() {
    val binding by lazy {
        FragmentBlank3Binding.inflate(layoutInflater)
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
            navController.navigate(R.id.action_blankFragment3_to_blankFragment)
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
        val animList= listOf(R.raw.anim1,R.raw.splash2,R.raw.anim3)
        binding.show.setOnClickListener {
            binding.lottie.apply {
                setAnimation(animList.random())
                playAnimation()
            }
        }
        return binding.root
    }

    companion object {


    }
}