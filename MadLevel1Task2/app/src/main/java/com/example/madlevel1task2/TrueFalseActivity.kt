package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madlevel1task2.databinding.ActivityTrueFalseBinding

class TrueFalseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTrueFalseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrueFalseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}