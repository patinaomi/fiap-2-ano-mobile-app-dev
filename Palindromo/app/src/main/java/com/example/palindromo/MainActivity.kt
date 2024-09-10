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

    private lateinit var editTextPalavra : EditText
    private lateinit var textViewMsg: TextView
    private lateinit var textViewErro: TextView
    private lateinit var buttonVerificar: Button
    private lateinit var buttonLimpar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editTextPalavra = findViewById(R.id.et_palavra)
        textViewMsg = findViewById(R.id.tv_msg)
        textViewErro = findViewById(R.id.tv_error)
        buttonVerificar = findViewById(R.id.bt_verificar)
        buttonLimpar = findViewById(R.id.bt_limpar)

    }

    fun verificarPalindromo(view: View) {
        val palavra = editTextPalavra.text.toString()
        if(palavra.isEmpty()) {
            textViewErro.text = "Não pode deixar em branco"
            textViewMsg.text = ""
            return
        }

        if(palavra.equals(palavra.reversed())) {
            textViewMsg.text = "A palavra $palavra é um PALÍNDROMO"
        } else {
            textViewMsg.text = "A palavra $palavra não é um PALÍNDROMO"
        }

        textViewErro.text = ""
        buttonLimpar.isEnabled = true
        buttonVerificar.isEnabled = false
    }

    fun limparCampos(view: View) {
        editTextPalavra.setText("")
        textViewMsg.text = ""
        textViewErro.text = ""
        buttonVerificar.isEnabled = true
        buttonLimpar.isEnabled = false
    }
}