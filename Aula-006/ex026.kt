// Verificar se é Número Primo com entrada de dados do usuário

fun main() {
    print("Digite um número: ")
    var num = readln().toIntOrNull()
    var isPrime = true // Variável como true assumindo inicialmente que é primo


    for(i in 2 until num!!) {
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