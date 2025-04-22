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
import render.animations.Attention
import render.animations.Bounce
import render.animations.Fade
import render.animations.Flip
import render.animations.Render
import render.animations.Rotate
import render.animations.Slide
import render.animations.Zoom

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
        val targetView = binding.targetView
//


        // -----------------------
        // Bounce Animations
        // -----------------------
        binding.btnInDown.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Bounce().InDown(targetView))
            render.start()
        }
        binding.btnInUp.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Bounce().InUp(targetView))
            render.start()
        }
        binding.btnInLeft.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Bounce().InLeft(targetView))
            render.start()
        }
        binding.btnInRight.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Bounce().InRight(targetView))
            render.start()
        }
        binding.btnIn.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Bounce().In(targetView))
            render.start()
        }
        // attention
        binding.btnAttention.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Attention().Bounce(targetView))
            render.start()
        }
        binding.btnAttentionWobble.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Attention().Wobble(targetView))
            render.start()
        }
        binding.btnAttentionShake.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Attention().Shake(targetView))
            render.start()
        }
        binding.btnAttentionTada.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Attention().Tada(targetView))
            render.start()
        }

        // -----------------------
        // Fade Animations
        // -----------------------
        binding.btnFadeIn.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Fade().InDown(targetView))
            render.start()
        }
        binding.btnFadeOut.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Fade().InLeft(targetView))
            render.start()
        }

        // -----------------------
        // Flip Animations
        // -----------------------
        binding.btnFlipInHorizontal.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Flip().InX(targetView))
            render.start()
        }
        binding.btnFlipOutHorizontal.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Flip().InY(targetView))
            render.start()
        }
        binding.btnFlipInVertical.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Flip().OutX(targetView))
            render.start()
        }
        binding.btnFlipOutVertical.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Flip().OutY(targetView))
            render.start()
        }

        // -----------------------
        // Rotate Animations
        // -----------------------
        binding.btnRotateIn.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Rotate().In(targetView))
            render.start()
        }
        binding.btnRotateOut.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Rotate().Out(targetView))
            render.start()
        }

        // -----------------------
        // Slide Animations
        // -----------------------
        binding.btnSlideDown.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Slide().InDown(targetView))
            render.start()
        }
        binding.btnSlideUp.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Slide().InUp(targetView))
            render.start()
        }
        binding.btnSlideLeft.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Slide().OutLeft(targetView))
            render.start()
        }
        binding.btnSlideRight.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Slide().OutRight(targetView))
            render.start()
        }

        // -----------------------
        // Zoom Animations
        // -----------------------
        binding.btnZoomIn.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Zoom().InLeft(targetView))
            render.start()
        }
        binding.btnZoomOut.setOnClickListener {
            val render = Render(requireContext())
            render.setAnimation(Zoom().OutRight(targetView))
            render.start()
        }

        // -----------------------
        // Attention Animation Example
        // -----------------------
        // Example: An attention-style animation (like Tada or a similar effect)
        return binding.root

    }

    companion object {


    }
}