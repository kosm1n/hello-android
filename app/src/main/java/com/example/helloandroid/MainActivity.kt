package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val happyButton: Button = findViewById(R.id.buttonHappyBirthday)
        val diceRollerButton: Button = findViewById(R.id.buttonDiceRoller)

        happyButton.setOnClickListener{
            val intent = Intent(this@MainActivity, HappyBirthdayActivity::class.java)
            startActivity(intent)
        }

        diceRollerButton.setOnClickListener{
            val intent = Intent(this@MainActivity, DiceRollerActivity::class.java)
            startActivity(intent)
        }
    }
}