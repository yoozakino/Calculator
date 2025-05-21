package com.example.calculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber1 = findViewById<EditText>(R.id.etNumber1)
        val etNumber2 = findViewById<EditText>(R.id.etNumber2)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        fun getNumbers(): Pair<Double?, Double?> {
            val num1 = etNumber1.text.toString().toDoubleOrNull()
            val num2 = etNumber2.text.toString().toDoubleOrNull()
            return Pair(num1, num2)
        }

        btnAdd.setOnClickListener {
            val (num1, num2) = getNumbers()
            if (num1 != null && num2 != null) {
                tvResult.text = "Результат: ${num1 + num2}"
            } else {
                tvResult.text = "Введите корректные числа"
            }
        }

        btnSubtract.setOnClickListener {
            val (num1, num2) = getNumbers()
            if (num1 != null && num2 != null) {
                tvResult.text = "Результат: ${num1 - num2}"
            } else {
                tvResult.text = "Введите корректные числа"
            }
        }

        btnMultiply.setOnClickListener {
            val (num1, num2) = getNumbers()
            if (num1 != null && num2 != null) {
                tvResult.text = "Результат: ${num1 * num2}"
            } else {
                tvResult.text = "Введите корректные числа"
            }
        }

        btnDivide.setOnClickListener {
            val (num1, num2) = getNumbers()
            if (num1 != null && num2 != null) {
                if (num2 == 0.0) {
                    tvResult.text = "На ноль делить нельзя!"
                } else {
                    tvResult.text = "Результат: ${num1 / num2}"
                }
            } else {
                tvResult.text = "Введите корректные числа"
            }
        }
    }
}
