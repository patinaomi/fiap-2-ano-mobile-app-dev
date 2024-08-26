// Verificando se o número é primo ou não

fun main() {
    val num = 17 // Definindo o número que será verificado se é primo ou não
    var isPrime = true // Variável como true assumindo inicialmente que é primo

    for(i in 2 until num) {
        if (num % i == 0) { // Verifica se é um número divisível por i.
            isPrime = false
            break // Interromper o loop
        }
    }

    // Após o loop, verificamos o valor de isPrime para determinar se é primo ou não
    if (isPrime) {
        println("O número $num é primo.")
    } else {
        println("O número $num NÃO é primo.")
    }


}