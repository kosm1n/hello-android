package com.example.helloandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycle_view)

        val rollButton: Button = findViewById(R.id.buttonRecycleGoToMain)

        rollButton.setOnClickListener{
            val intent = Intent(this@RecycleViewActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}