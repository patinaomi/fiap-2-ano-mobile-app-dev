import java.util.*

// Desafio IMC (Cálculo do índice de Massa Corporal
// Desenvolver um programa em Kotlin que calcule o índice de massa corporal com base no
// peso e na altura fornecidos pelo usuário. O programa deve realizar as seguintes tarefas:
// 1. Criar um objeto Scanner para ler a entrada do usuário.
// 2. Definir uma função chamada coletarDados() que solicita e leia o peso e a altura do usuário.
// 3. Calcular o IMC utilizando a fórmula IMC = peso / (altura * altura)

fun main() {
    val sc = Scanner(System.`in`)
    var sair: Char
    var peso = 1.0f
    var altura = 1.0f
    var imc: Float

    fun coletarDados() {
        print("Digite o seu peso: ")
        peso = sc.nextFloat()

        print("Digite a sua altura: ")
        altura = sc.nextFloat()
    }

    fun calcularImc(peso: Float, altura: Float): Float {
        imc = peso / (altura * altura)
        return imc
    }

    fun categoriaImc(imc: Float) {
        when {
            (imc < 16.9) -> println("Muito abaixo do Peso")
            (imc <= 18.4) -> println("Abaixo do Peso")
            (imc <= 24.9) -> println("Peso Normal")
            (imc <= 29.9) -> println("Acima do Peso")
            (imc <= 34.9) -> println("Obesidade Grau I")
            (imc <= 40) -> println("Obesidade Grau II")
            (imc > 40) -> println("Obesidade Grau III")

            else -> {
                println("Valor inválido")
            }
        }
    }

        do {
            coletarDados()
            var imc = calcularImc(peso, altura)
            println("IMC: $imc")
            categoriaImc(imc)

            print("Tecle [c] para continuar ou [s] para sair: ")
            sair = sc.next()[0] // Lé um caracter da entrada do usuário e atribui a variável 'next'

        } while (sair != 's')
}