// Exercício Soma dos Elementos

fun main() {

    // Array de Inteiros
    val numbers = intArrayOf(5, 10, 15, 20, 25) // Imutável
    var sum = 0

    // Loop para somar os elementos do array
    for (number in numbers) {
        sum += number
    }

    // Imprima o resultado
    println("Soma dos elementos do array: $sum")
}