// Crie um programa que verifica se o usuário tem acesso ao sistema ou não

fun main() {
    print("Usuário: ")
    var usuario = readlnOrNull()

    print("Senha: ")
    var senha = readlnOrNull()

    if (usuario != null) {
        if (usuario.lowercase() == "vinny" && senha == "123456"){
            println("Acesso Permitido")
        } else {
            println("Acesso Negado")
        }
    }
}
