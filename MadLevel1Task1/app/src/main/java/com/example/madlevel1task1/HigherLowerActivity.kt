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
        binding = ActivityHigherLowerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        updateUI()
    }

    private fun updateUI() {
        when (currentThrow) {
            1 -> binding.dice.setImageResource(R.drawable.dice1)
            2 -> binding.dice.setImageResource(R.drawable.dice2)
            3 -> binding.dice.setImageResource(R.drawable.dice3)
            4 -> binding.dice.setImageResource(R.drawable.dice4)
            5 -> binding.dice.setImageResource(R.drawable.dice6)
            6 -> binding.dice.setImageResource(R.drawable.dice6)
        }
        binding.lastThrow.text = getString(R.string.lastThrow_text, lastThrow)

    }
}