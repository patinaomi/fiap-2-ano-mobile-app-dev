// Calcular números naturais

fun main () {

    val numeros = 10
    var soma = 0

    // Utilizando o loop para calcular a soma dos primeiro N números naturais
    for(i in 1..numeros) {
        soma += i
    }

    println("A soma dos primeiros $numeros números naturais é: $soma")
}