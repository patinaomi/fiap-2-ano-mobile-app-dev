// Contagem regressiva

fun main() {
    print("Digite um número inteiro e positivo: ")
    val input = readln() // Solicitar e ler o número fornecido pelo usuário
    val numero = input.toIntOrNull()

    if (numero != null && numero > 0) {
        var contador = numero // Iniciar o contador com o número fornecido

        while(contador >= 1) { // Enquanto o contador for maior ou igual a 1
            println(contador) // Imprime o valor atual do contador

            contador-- // Decrementa o contador em 1 a cada interação
        }

    } else {
        println("Entrada inválida. Por favor, digite um número inteiro positivo.")
    }


}