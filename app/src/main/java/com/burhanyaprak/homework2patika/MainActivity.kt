package com.burhanyaprak.homework2patika

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.appcompat.app.AppCompatActivity
import com.burhanyaprak.homework2patika.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var isVisibilityOn = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewVisibilityOfPassword.setOnClickListener {
            isVisibilityOn = if (isVisibilityOn) {
                binding.imageViewVisibilityOfPassword.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                binding.editTextPassword.transformationMethod =
                    PasswordTransformationMethod.getInstance()
                false
            } else {
                binding.imageViewVisibilityOfPassword.setImageResource(R.drawable.ic_baseline_visibility_24)
                binding.editTextPassword.transformationMethod =
                    HideReturnsTransformationMethod.getInstance()
                true
            }
        }
    }
}