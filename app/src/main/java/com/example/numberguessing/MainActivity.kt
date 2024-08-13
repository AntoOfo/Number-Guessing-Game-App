package com.example.numberguessing

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val guessBtn = findViewById<Button>(R.id.guessBtn)
        val numberInput = findViewById<TextInputEditText>(R.id.numberInput)
        val randomNumber = findViewById<TextView>(R.id.randomNumber)
        val correctWrong = findViewById<TextView>(R.id.CorrectOrWrong)
        correctWrong.isVisible = false  // initially invisible

        guessBtn.setOnClickListener{
            val randNum = Random.nextInt(1, 3)

            randomNumber.text = randNum.toString()
            val userInput = numberInput.text.toString()

            if (userInput == randNum.toString()){
                correctWrong.text = "Correct!"
                correctWrong.isVisible = true       // becomes visible
            } else {
                correctWrong.text = "Wrong!"
                correctWrong.isVisible = true
            }
        }
        }
    }