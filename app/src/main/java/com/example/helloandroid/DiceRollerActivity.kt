package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
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
        val imageViewCartoon: ImageView = findViewById(R.id.imageViewCartoon)
        val imageViewDiceRolled: ImageView = findViewById(R.id.imageViewDiceRolled)

        

        buttonRoll.setOnClickListener {
            val myValue = editTextLuckyNumber.text
            val diceRolled = myDice.roll()
            when (diceRolled) {
                Integer.parseInt(myValue.toString()) -> {
                    printToastMessage("You won!")
                    imageViewCartoon.setImageResource(R.drawable.win)
                    setDiceRolledImage(diceRolled, imageViewDiceRolled)
                }
                1 -> {
                    printToastMessage("So sorry! You rolled a 1. Try again!")
                    imageViewDiceRolled.setImageResource(R.drawable.dice_1)
                    imageViewCartoon.setImageResource(R.drawable.sorry)
                }
                2 -> {
                    printToastMessage("Sadly, you rolled a 2. Try again!")
                    imageViewDiceRolled.setImageResource(R.drawable.dice_2)
                    imageViewCartoon.setImageResource(R.drawable.sadly)
                }
                3 -> {
                    printToastMessage("Unfortunately, you rolled a 3. Try again!")
                    imageViewDiceRolled.setImageResource(R.drawable.dice_3)
                    imageViewCartoon.setImageResource(R.drawable.unfortunately)
                }
                4 -> {
                    printToastMessage("Forgive me, you rolled a 4. Try again!")
                    imageViewDiceRolled.setImageResource(R.drawable.dice_4)
                    imageViewCartoon.setImageResource(R.drawable.forgive)
                }
                5 -> {
                    printToastMessage("Don't cry! You rolled a 5. Try again!")
                    imageViewDiceRolled.setImageResource(R.drawable.dice_5)
                    imageViewCartoon.setImageResource(R.drawable.cry)
                }
                6 -> {
                    printToastMessage("Apologies! You rolled a 6. Try again!")
                    imageViewDiceRolled.setImageResource(R.drawable.dice_6)
                    imageViewCartoon.setImageResource(R.drawable.apologies)
                }
            }

            textViewResult.setText(diceRolled)
        }



        buttonBack.setOnClickListener{
            val intent = Intent(this@DiceRollerActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun printToastMessage(message:String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.show()
    }

    private fun setDiceRolledImage(diceRolled: Int, imageViewDice:ImageView) {
        when(diceRolled) {
            1 -> imageViewDice.setImageResource(R.drawable.dice_1)
            2 -> imageViewDice.setImageResource(R.drawable.dice_2)
            3 -> imageViewDice.setImageResource(R.drawable.dice_3)
            4 -> imageViewDice.setImageResource(R.drawable.dice_4)
            5 -> imageViewDice.setImageResource(R.drawable.dice_5)
            6 -> imageViewDice.setImageResource(R.drawable.dice_6)
        }
    }
}