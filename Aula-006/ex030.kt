// Múltiplos de 3
// Criar um programa que solicita um número inteiro positivo e calcula a soma de todos os múltiplos de 3 que sejam menores que o número digitado

fun main() {
    print("Digite um número inteiro e positivo: ")
    val num = readln().toInt() // Solicita e lê o número fornecido
    var soma = 0 // Inicializando a variável soma
    var contador = 3 //Inicializa o contador com o primeiro múltiplo de 3

    while (contador <= num) {
        soma += contador // Adiciona o valor do contador a soma
        contador += 3 // Incremento o contador em 3 para obter o próximo múltiplo de 3
    }
    print("A soma dos múltiplos de 3 até $num é: $soma")
}