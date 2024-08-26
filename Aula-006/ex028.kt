// Desafio: Calcular a soma dos números pares em uma lista de números.
// Criar uma lista de números e calcular a soma dos números pares

fun main() {
    val lista = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    var soma = 0

    for(i in lista){
        if(i % 2 == 0) {
            soma += i
        }
    }
    println("Soma dos elementos pares da lista: $soma")
}