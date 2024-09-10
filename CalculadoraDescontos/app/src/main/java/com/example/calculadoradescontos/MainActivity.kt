package com.example.calculadoradescontos

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

    private lateinit var priceEditText: EditText
    private lateinit var discountEditText: EditText
    private lateinit var resultTextView : TextView
    private lateinit var errorTextView : TextView
    private lateinit var calculateButton : Button
    private lateinit var clearButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        priceEditText = findViewById(R.id.priceEditText)
        discountEditText = findViewById(R.id.discountEditText)
        resultTextView = findViewById(R.id.resultTextView)
        errorTextView = findViewById(R.id.errorTextView)
        calculateButton = findViewById(R.id.calculateButton)
        clearButton = findViewById(R.id.clearButton)
    }

    fun calcularDesconto(view: View) {
        val preco = priceEditText.text.toString().toDoubleOrNull()
        val desconto = discountEditText.text.toString().toDoubleOrNull()

        if(preco == null || desconto == null) {
            resultTextView.text = ""
            errorTextView.text = "Campo não pode estar vazio"
            return
        }

        if(preco <= 0 || desconto > 100) {
            resultTextView.text = ""
            errorTextView.text = "Valor Inválido"
            return
        }

        if(desconto.toInt() == 100) {
            resultTextView.text = "GRÁTIS"
            errorTextView.text = ""
            calculateButton.isEnabled = false
            clearButton.isEnabled = true
            return
        }

        val result = preco * (1 - desconto / 100)
        resultTextView.text = "Valor total: R$ $result"
        errorTextView.text = ""
        calculateButton.isEnabled = false
        clearButton.isEnabled = true

    }

    fun limparCampos(view: View) {
        resultTextView.text = ""
        errorTextView.text = ""
        priceEditText.setText("")
        discountEditText.setText("")
        calculateButton.isEnabled = true
        clearButton.isEnabled = false
    }
}