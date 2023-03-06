package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.helloandroid.databinding.ActivityMainBinding
import com.example.helloandroid.databinding.TipCalculatorBinding

class TipCalculatorActivity : AppCompatActivity() {

    private lateinit var binding: TipCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TipCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener{
            binding.textViewTipCalculatorResult.text = calculateTip().toString()
        }

        binding.buttonGoBack.setOnClickListener{
            val intent = Intent(this@TipCalculatorActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun calculateTip(): Double {
        val stringInTextField = binding.editTextNumberDecimalCostOfService.text.toString()
        val cost = stringInTextField.toDouble()
        val tipPercentage = when (binding.tipOptionsPercentage.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var total = cost * (1+tipPercentage)
        val roundUp = binding.switchRoundUpTip.isChecked
        if (roundUp) {
            total = kotlin.math.ceil(total)
        }

        return total
    }

}