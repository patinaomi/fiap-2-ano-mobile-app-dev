// Exercício maior e menor elemento

fun main() {

    // Array de Inteiros
    val numbers = intArrayOf(8, 3, 12, 50, 6, 20)
    var min = numbers[0] // Variável para armazenar o MENOR elemento
    var max = numbers[0] // Variável para armazenar o MAIOR elemento

    // Loop para encontrar o menor e o maior elemento
    for (number in numbers) {
        if(number < min) {
            min = number
        }
        if(number > max) {
            max = number
        }
    }

    println("O menor elemento é: $min")
    println("O maior elemento é: $max")
}