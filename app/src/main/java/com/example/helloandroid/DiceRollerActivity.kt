package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.helloandroid.model.Dice

class DiceRollerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dice_roller)

        val myDice = Dice(6)

        val buttonRoll: Button = findViewById(R.id.buttonRoll)
        val buttonBack: Button = findViewById(R.id.buttonBack)
        val textViewResult: TextView = findViewById(R.id.textViewResult)
        val editTextLuckyNumber: EditText = findViewById(R.id.editTextLuckyNumber)



        buttonRoll.setOnClickListener() {
            val myValue = editTextLuckyNumber.text;
            val diceRolled = myDice.roll()
            when (diceRolled) {
                Integer.parseInt(myValue.toString()) -> printToastMessage("You won!")
                1 -> printToastMessage("So sorry! You rolled a 1. Try again!")
                2 -> printToastMessage("Sadly, you rolled a 2. Try again!")
                3 -> printToastMessage("Unfortunately, you rolled a 3. Try again!")
                4 -> printToastMessage("Forgive me, you rolled a 4. Try again!")
                5 -> printToastMessage("Don't cry! You rolled a 5. Try again!")
                6 -> printToastMessage("Apologies! You rolled a 6. Try again!")
            }

            textViewResult.setText("${diceRolled}")
        }



        buttonBack.setOnClickListener{
            val intent = Intent(this@DiceRollerActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun printToastMessage(message:String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.show()
    }
}