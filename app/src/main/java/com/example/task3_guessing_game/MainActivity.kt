package com.example.task3_guessing_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var RandomNumber = Random.nextInt(0,1000)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton = findViewById<TextView>(R.id.clickButton)
        val inputValue =findViewById<TextInputLayout>(R.id.enteredValue)
        val guessResult = findViewById<TextView>(R.id.guessView)

        clickButton.setOnClickListener{
            val userGuessedNumber = inputValue.editText?.text.toString().toInt()

            when{
                RandomNumber > userGuessedNumber!! ->{
                    guessResult.text="No :( My Number Is Bigger"
                }
                RandomNumber<userGuessedNumber!! ->{
                    guessResult.text="No :| My Number is Smaller"
                }
                RandomNumber==userGuessedNumber!! ->{
                    guessResult.text="You are right!!! :)"
                }
            }
        }
    }
}