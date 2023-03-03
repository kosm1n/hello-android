package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.helloandroid.model.Dice

class DiceRollerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dice_roller)

        val myDice = Dice()

        val buttonRoll: Button = findViewById(R.id.buttonRoll)
        val buttonBack: Button = findViewById(R.id.buttonBack)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        buttonRoll.setOnClickListener{
            textViewResult.setText("${myDice.roll()}")
        }

        buttonBack.setOnClickListener{
            val intent = Intent(this@DiceRollerActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}