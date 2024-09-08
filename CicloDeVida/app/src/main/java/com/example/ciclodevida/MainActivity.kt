package com.example.ciclodevida

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
    private lateinit var editText : EditText
    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

            editText = findViewById(R.id.editTextNome)
            textView = findViewById(R.id.textViewNome)
            button = findViewById(R.id.button)
    }

    fun olaPessoa(view: View) {
        val nome = editText.text.toString()

        if(nome.isEmpty()) {
            textView.text = "Por favor, digite um nome."
            return
        } else {
            textView.text = "Olá, $nome"
        }
    }



    override fun onStart() {
        super.onStart()

        println("onStart")
    }

    override fun onResume() {
        super.onResume()

        println("onResume")
    }

    override fun onPause() {
        super.onPause()

        println("onPause")
    }

    override fun onStop() {
        super.onStop()

        println("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        println("onDestroy")
    }
}