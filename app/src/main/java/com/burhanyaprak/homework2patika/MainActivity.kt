package com.burhanyaprak.homework2patika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.burhanyaprak.homework2patika.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var isVisibilityOn = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.imageViewVisibilityOfPassword.setOnClickListener {
            isVisibilityOn = if (isVisibilityOn) {
                binding.imageViewVisibilityOfPassword.setImageResource(R.drawable.ic_baseline_visibility_24)
                false
            } else {
                binding.imageViewVisibilityOfPassword.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                true
            }
        }
    }
}