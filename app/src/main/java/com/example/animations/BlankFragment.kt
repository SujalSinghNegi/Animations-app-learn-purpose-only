package com.example.animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.animations.databinding.FragmentBlankBinding
import kotlin.getValue



class BlankFragment : Fragment() {
    val binding by lazy {
        FragmentBlankBinding.inflate(layoutInflater)
    }
    // menu button navigate as well

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
            navController.navigate(R.id.action_blankFragment_to_blankFragment2)
        }
        binding.fadeIn.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this.context, R.anim.fade_in)
            binding.animation.startAnimation(anim)
        }
        binding.fadeOut.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this.context, R.anim.fade_out)
            binding.animation.startAnimation(anim)

        }
        binding.slideUp.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this.context, R.anim.slide_up)
            binding.animation.startAnimation(anim)
        }

        binding.slideDown.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this.context, R.anim.slide_down)
            binding.animation.startAnimation(anim)
        }
        binding.bounce.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this.context, R.anim.bounce)
            binding.animation.startAnimation(anim)
        }

        binding.rotate.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this.context, R.anim.rotate)
            binding.animation.startAnimation(anim)
        }





        return binding.root

    }

    companion object {


    }
}