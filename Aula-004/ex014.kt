fun main() {
    // Criando uma lista mutável de números inteiros vazia
    val numeros = mutableListOf<Int>()

    // Adicionando elementos a lista
    numeros.add(1)
    numeros.add(2)
    numeros.add(3)

    // Dá pra colocar pelo index
    numeros.add(2, 4)

    // Exibindo a lista de números
    println("Lista de números $numeros")

    // Removemos o número 4
    numeros.remove(4)

    // Agora a impressão da lista sem o 4
    println("Lista de números $numeros")

    // Aqui removemos pelo índice, então vai tirar o 1
    numeros.removeAt(0)
    println("Lista de números $numeros")

}