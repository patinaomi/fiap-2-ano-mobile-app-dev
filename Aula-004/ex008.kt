fun main() {
    // Trabalhando com Array (Vetores, Matrizes, Coleções, Listas)
    // Tipo de dado que permite armazenar múltiplos valores em uma mesma variável
    // Obs: O acesso dos elementos do Array é feito através de um índice que começa em 0

    // Declaração de um Array
    // var nomeDaVariavel = arrayOf(valor, valor, valor)

    val idades = arrayOf(8, 36, 42)

    // Acesso a uma posição específica do array
    println("O registro de idade é: ${idades[1]}")

    val alturas = FloatArray(256)

    // Outra forma de declaração e atribuição de valores a um Array
    alturas[0] = 1.58f
    alturas[1] = 1.83f
    alturas[2] = 1.25f
    alturas[3] = 1.68f
    alturas[4] = 1.92f

    // Imprimindo o valor do primeiro registro de altura
    println("O registro UM de alturas é: %.2f".format(alturas[1]))

    // Outra forma de declaração de atribuição de valor de um Array
    val nomes = charArrayOf('P', 'A', 'T', 'I')
    println("O registro do nome é: ${nomes[0]}")

    val empresa = "FIAP"
    println("Caracter da empresa: ${empresa[3]}")

    // Tamanho
    val tamanho: Int = nomes.size
    println("Posição do último caractere do nome é: ${nomes [tamanho - 1]}")

    // Aqui temos 3 posições de memória sendo utilizadas
    println("Quantidade de itens: ${idades.size}")

    // Qual é o peso do array
    println("Peso do array: ${idades.size * 4} bytes") // Um int possui 4 bytes de tamanho
}