package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityTrueFalseBinding

class TrueFalseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTrueFalseBinding
    private var incorrectAnswers: ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrueFalseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            displayScore()
        }
    }

    private fun checkAnswers() {
        val answer1 = binding.answer1.text.toString()
        val answer2 = binding.answer2.text.toString()
        val answer3 = binding.answer3.text.toString()
        val answer4 = binding.answer4.text.toString()

        if (answer1 != getString(R.string.true_text)) incorrectAnswers.add("1")
        if (answer2 != getString(R.string.false_text)) incorrectAnswers.add("2")
        if (answer3 != getString(R.string.false_text)) incorrectAnswers.add("3")
        if (answer4 != getString(R.string.false_text)) incorrectAnswers.add("4")
    }

    private fun displayScore() {
        checkAnswers()

        if (incorrectAnswers.isNotEmpty()) {
            val message = "The answer you got incorrect are: "
            val listString = incorrectAnswers.joinToString(separator = ", ")
            val score = message + listString
            Toast.makeText(this, score, Toast.LENGTH_LONG).show()
        }
        else if (incorrectAnswers.isEmpty()) {
            Toast.makeText(this, getString(R.string.perfect_score), Toast.LENGTH_LONG).show()
        }
    }
}