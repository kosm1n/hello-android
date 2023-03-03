package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HappyBirthdayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.happy_birthday)

        val rollButton: Button = findViewById(R.id.buttonHappyBirthday)

        rollButton.setOnClickListener{
            val intent = Intent(this@HappyBirthdayActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}