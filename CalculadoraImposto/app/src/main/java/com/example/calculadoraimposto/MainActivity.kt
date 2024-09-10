package com.example.calculadoraimposto

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
    // Declarar as variáveis que serão usadas
    private lateinit var editTextSalario : EditText
    private lateinit var editTextQtdDep : EditText
    private lateinit var buttonCalcular : Button
    private lateinit var buttonLimpar : Button
    private lateinit var textViewResultImp: TextView
    private lateinit var textViewResultInss: TextView
    private lateinit var textViewMsgError: TextView
    private lateinit var textViewSalarioLiq : TextView
    private lateinit var textViewAliqImposto: TextView
    private lateinit var textViewAliqInss: TextView
    private lateinit var textViewTetoCont: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editTextSalario = findViewById(R.id.et_salario_bruto)
        editTextQtdDep = findViewById(R.id.et_qtd_dep)
        buttonCalcular = findViewById(R.id.bt_calcular)
        textViewResultImp = findViewById(R.id.tv_result_imp)
        textViewResultInss = findViewById(R.id.tv_result_inss)
        textViewSalarioLiq = findViewById(R.id.tv_salario_liq)
        buttonLimpar = findViewById(R.id.bt_limpar)
        textViewMsgError = findViewById(R.id.tv_msg_erro)
        textViewAliqImposto = findViewById(R.id.tv_aliq_imp)
        textViewAliqInss = findViewById(R.id.tv_aliq_inss)
        textViewTetoCont = findViewById(R.id.tv_teto_cont)

    }

    fun calcular(view: View) {
        val salarioBruto = editTextSalario.text.toString().toDoubleOrNull()
        val qtdDependentes = editTextQtdDep.text.toString().toDoubleOrNull()

        if(salarioBruto == null || qtdDependentes == null) {
            textViewMsgError.text = "Não pode estar vazio"
            return
        }

        if(salarioBruto < 0 || qtdDependentes < 0) {
            textViewMsgError.text = "Não pode número negativo"
            return
        }

        if(qtdDependentes > 10) {
            textViewMsgError.text = "Não pode mais que 10 dependentes"
            return
        }

        var inss = calcularInss(salarioBruto)
        var valorBase = salarioBruto - inss - (qtdDependentes * 189.59)
        var irpf = calcularImposto(valorBase)
        var salarioLiquido = salarioBruto - inss - irpf
        // var aliquotaEfetiva = (irpf / salarioBruto) * 100

        buttonCalcular.isEnabled = false
        buttonLimpar.isEnabled = true
        editTextSalario.isEnabled = false
        editTextQtdDep.isEnabled = false

        // Apresentando resultados
        if(irpf.toInt() == 0) {
            textViewResultImp.text = "Contribuinte isento"

        } else {
            textViewResultImp.text = "Imposto de Renda: R$%.2f".format(irpf)
            textViewTetoCont.text = "Contribuição INSS: R$%.2f".format(inss)
            textViewSalarioLiq.text = "Salário Líquido: R$%.2f".format(salarioLiquido)
        }
    }

    fun calcularInss(salarioBruto: Double): Double {
        var inss = 0.0
        var teto = 7786.02
        var salarioBase = if (salarioBruto > teto) teto else salarioBruto
        var faixa1 : Double = 0.0
        var faixa2 : Double = 0.0
        var faixa3 : Double = 0.0
        var faixa4 : Double = 0.0

        if(salarioBruto > teto) {
            textViewTetoCont.text = "Salário superior ao teto"
        }

        if(salarioBase <= 1412) {
            faixa1 = salarioBase * 0.075
        } else if (salarioBase <= 2666.68) {
            faixa1 = 1412 * 0.075
            faixa2 = (salarioBase - 1412) * 0.09
        } else if (salarioBase <= 4000.03) {
            faixa1 = 1412 * 0.075
            faixa2 = (4000.03 - 1412) * 0.09
            faixa3 = (salarioBase - 2666.68) * 0.12
        } else {
            faixa1 = 1412 * 0.075
            faixa2 = (2666.68 - 1412) * 0.09
            faixa3 = (4000.03 - 2666.68) * 0.12
            faixa4 = (salarioBase - 4000.03) * 0.14
        }

        inss = faixa1 + faixa2 + faixa3 + faixa4
        return inss
    }

    fun calcularImposto(salarioBruto : Double): Double{
        var irpf: Double;

        //Cálculo do Imposto
        if(salarioBruto <= 2259.20) {
            irpf = 0.0

        } else if(salarioBruto <= 2826.65) {
            irpf = salarioBruto * 0.075 - 169.44

        } else if(salarioBruto <= 3751.05) {
            irpf = salarioBruto * 0.15 - 381.44

        } else if (salarioBruto <= 4664.68) {
            irpf = salarioBruto * 0.225 - 662.77
        } else {
            irpf = salarioBruto * 0.275 - 896
        }

        return irpf
    }

    fun limparCampos(view: View) {
        buttonLimpar.isEnabled = false
        buttonCalcular.isEnabled = true
        editTextSalario.isEnabled = true
        editTextQtdDep.isEnabled = true

        limpar(view)
    }

    fun limpar(view: View) {
        textViewTetoCont.text = ""
        textViewResultImp.text = ""
        textViewResultInss.text = ""
        textViewAliqImposto.text = ""
        textViewMsgError.text = ""
        textViewSalarioLiq.text = ""
        textViewAliqInss.text = ""
        textViewSalarioLiq.text = ""
    }
}