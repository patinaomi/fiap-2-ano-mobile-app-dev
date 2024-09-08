fun main() {
    //enumeradores -> enum
    val numero = 3.14159

    // Formatação direta dentro da string usando a função String.format
    println("O número formatado é: ${"%.2f".format(numero)}")  // Saída: O número formatado é: 3.14

    var nomes = arrayListOf("Ana", "Beatriz", "Sara")
    var nomesA = nomes.filter {
        nomes.contains("a")
    }

    println(nomesA)
}