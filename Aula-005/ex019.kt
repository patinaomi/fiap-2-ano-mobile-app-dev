// Exercício DETRAN: Criar um programa que verifica se o usuário possui ou não carteira de habilitação.

fun main() {

    val idade = 25
    val possuiCarteiraDemotorista = true // Ele possui CNH

    // Verificar se a pessoa é maior de idade e se possui CNH

    if(idade >=18 && possuiCarteiraDemotorista) {
        println("Você pode dirigir legalmente")
    } else {
        println("Você não pode dirigir legalmente")
    }

    val temIngresso = false
    val estaComCamisaDoTime = true

    // Verifica se a pessoa tem ingresso OU está com a camisa do time
    if (temIngresso || estaComCamisaDoTime) {
        println("Você pode entrar no estádio")
    } else {
        println("Você não pode entrar no estádio")
    }
}