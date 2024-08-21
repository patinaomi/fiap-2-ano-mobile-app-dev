// faça um programa que verifica se o programa é par ou ímpar

fun main() {
    print("Digite um número: ")
    val numero = readln().toInt()

    if(numero % 2 == 0 ) {
        println("$numero é PAR")
    } else {
        println("$numero é ÍMPAR")
    }
}
