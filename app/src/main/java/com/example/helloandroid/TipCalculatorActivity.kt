package com.example.helloandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloandroid.databinding.TipCalculatorBinding
import java.text.DecimalFormat
import java.text.NumberFormat

class TipCalculatorActivity : AppCompatActivity() {

    private lateinit var binding: TipCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TipCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener{
            binding.textViewTipCalculatorResult.text = NumberFormat.getCurrencyInstance().format(calculateTip())
        }

        binding.buttonGoBack.setOnClickListener{
            val intent = Intent(this@TipCalculatorActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun calculateTip(): Double {
        val stringInTextField = binding.editTextNumberDecimalCostOfService.text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        if (cost == null) {
            binding.textViewTipCalculatorResult.text = ""
            return 0.0
        }

        val tipPercentage = when (binding.tipOptionsPercentage.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }

        if (binding.switchRoundUpTip.isChecked) {
            return DecimalFormat("#.##").format(cost * (1+tipPercentage)).toDouble()
        }

        return cost * (1+tipPercentage)
    }

}