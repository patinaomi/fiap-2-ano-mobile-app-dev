// Crie um programa que explore a funcionalidade de arrays em Kotlin, realizando somas entre arrays de números pares e ímpares
//Inicie com os arrays pré definidos: pares e ímpares conforme abaixo
//pares = 0, 2, 4, 6
//ímpares = 1, 3, 5, 7
//utilize as operações de soma para calcular as somas entre os elementos correspondentes dos arrays pares e ímpares
//armazene os resultados em um novo array chamado soma
//exiba os resultados das somas, mostrando o valor resultante para cada par de números

fun main() {
    val pares = intArrayOf(0, 2, 4, 6)
    val impares = intArrayOf(1, 3, 5, 7)
    var soma = mutableListOf<Int>()


    // esse indices é pra obter todos os índices válidos de uma lista
    for (i in pares.indices) {
        soma.add(pares[i] + impares[i])
    }

    // Apresentando bonitinho
    for (i in impares.indices) {
        println("${pares[i]} + ${impares[i]} = ${soma[i]}")
    }
}