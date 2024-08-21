// Classificação numérica

fun main() {

    print("Digite um número: ")
    val numeroInput = readln() // Recebendo o numero

    var numero = numeroInput.toIntOrNull()

    if (numero != null) {
        if ( numero > 0) { // Verifica se o número é maior que zero
            println("O número é positivo.")

        } else if ( numero < 0) { // Caso o contrário, verifica se o número é menor que zero
            println("O número é negativo.")

        } else { // Se nenhuma das condições anteriores for verdadeira
            println("O número é zero.")
        }

    } else {
        println("Por favor, digite uma idade válida.")
    }
}