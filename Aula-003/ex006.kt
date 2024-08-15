// Crie um perfil de usuário em Kotlin, vamos aplicar os conceitos aprendidos sobre variáveis em kotlin para criar um programa simples que simule o armazenamento e exibição de informações de um perfil de usuáriocrie um arquivo kotlin com extensão .kotlin
// Declare variáveis para armazenar informações de um perfil de usuário como nome, idade email e se ousuário está ativo ou inativo
// Atribua valores as variáveis de acordo com os dados que você escolher
// Utilize println() para exibir as informaçãoes do perfil do usuário no console

fun main() {

    println("--- NOVO CADASTRO ---")
    print("Digite o nome do usuário: ")
    var nome = readLine()!!

    print("Digite a idade do usuário: ")
    var idade = readLine()!!.toInt()

    print("Digite o e-mail do usuário: ")
    var email = readLine()!!

    var isAtivo = false
    var status = if(isAtivo) "Ativado" else "Desativado"
    
    println("--- Impressão dos Dados ---")
    println("Nome: $nome")
    println("Idade: $idade")
    println("E-mail: $email")
    println("Status: $status")
}