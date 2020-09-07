package com.example.madlevel1task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
        binding.btnHigher.setOnClickListener {
            onHigherClick()
        }
        binding.btnEquals.setOnClickListener {
            onEqualsClick()
        }
        binding.btnLower.setOnClickListener {
            onLowerClick()
        }
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

    private fun rollDice() {
        lastThrow = currentThrow
        currentThrow = (1..6).random()
        updateUI()
    }

    private fun onHigherClick() {
        rollDice()
        if (currentThrow > lastThrow) onAnswerCorrect()
        else onAnswerIncorrect()
    }

    private fun onEqualsClick() {
        rollDice()
        if (currentThrow == lastThrow) onAnswerCorrect()
        else onAnswerIncorrect()
    }

    private fun onLowerClick() {
        rollDice()
        if (currentThrow < lastThrow) onAnswerCorrect()
        else onAnswerIncorrect()
    }

    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
    }

    private fun onAnswerIncorrect() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
    }
}