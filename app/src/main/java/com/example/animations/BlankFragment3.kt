package com.example.animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.animations.databinding.FragmentBlank3Binding
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
        return binding.root
    }

    companion object {


    }
}