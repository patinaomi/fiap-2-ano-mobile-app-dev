// Desafio Prático Lanchonete Vinny
// Crie um sistema de geração de comanda para lanchonete
// Inicie criando variáveis para o controle de preço e quantidade de produtos
// Exibir: A quantidade e preço dos produtos, soma taxa e o total
// Use os valores: 3 Coxinha e 2 Cervejas
// Preço: Coxinha R$ 5,00 e Cerveja R$ 15,00

fun main() {
    val precoCoxinha = 5.0f
    val precoCerveja = 15.0f

    print("Digite a quantidade de Coxinhas: ")
    val qtdCoxinha = readln().toInt()

    print("Digite a quantidade de Cervejas: ")
    val qtdCerveja = readln().toInt()

    val totalCoxinha = qtdCoxinha * precoCoxinha
    val totalCerveja = qtdCerveja * precoCerveja
    val total = totalCoxinha + totalCerveja


    println("-----------------------------")
    println("           CONSOLE           ")
    println("-----------------------------")
    println("    .: Lanchonete Vinny :.   ")
    println("-----------------------------")
    println("$qtdCoxinha Coxinhas \t\t\tR$ $totalCoxinha")
    println("$qtdCerveja Cervejas \t\t\tR$ $totalCerveja")
    println("Somatória \t\t\tR$$total")
    println("Taxa 10% \t\t\tR$${total * 0.1}")
    println("-----------------------------")
    println("-----------------------------")
    println("Conta Final \t\t\tR$${total + (total * 0.1)}")



}