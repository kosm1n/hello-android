package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()

        val happyButton: Button = findViewById(R.id.buttonHappyBirthday)
        val diceRollerButton: Button = findViewById(R.id.buttonDiceRoller)
        val tipCalculatorButton: Button = findViewById(R.id.buttonCalculator)

        happyButton.setOnClickListener{
            val intent = Intent(this@MainActivity, HappyBirthdayActivity::class.java)
            startActivity(intent)
        }

        diceRollerButton.setOnClickListener{
            val intent = Intent(this@MainActivity, DiceRollerActivity::class.java)
            startActivity(intent)
        }

        tipCalculatorButton.setOnClickListener{
            val intent = Intent(this@MainActivity, TipCalculatorActivity::class.java)
            startActivity(intent)
        }
    }

    private fun logging() {
        Log.v(TAG, "Hello World, from Kosm1n")
    }
}