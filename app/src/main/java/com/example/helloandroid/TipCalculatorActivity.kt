package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TipCalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tip_calculator)

        val buttonGoBack: Button = findViewById(R.id.buttonGoBack)

        buttonGoBack.setOnClickListener{
            val intent = Intent(this@TipCalculatorActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}