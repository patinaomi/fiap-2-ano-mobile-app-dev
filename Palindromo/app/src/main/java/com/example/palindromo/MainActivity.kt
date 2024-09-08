package com.example.palindromo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editText = findViewById(R.id.et_palavra)
        resultText = findViewById(R.id.tv_resultado)
    }

    fun verificaPalindromo(view: View) {
        val palavra = editText.text.toString()

        if(palavra.isEmpty()) {
            resultText.text = "Não deixe o espaço em branco"
            return
        }
        if(palavra.equals(palavra.reversed())) {
            resultText.text = "A palavra ${palavra.uppercase()} é um Palíndromo"
        } else {
            resultText.text = "A palavra ${palavra.uppercase()} não é um Palíndromo"
        }

    }
}