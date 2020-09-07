package com.example.madlevel1task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madlevel1task1.databinding.ActivityHigherLowerBinding

class HigherLowerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHigherLowerBinding
    private var currentThrow = 1
    private var lastThrow = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}