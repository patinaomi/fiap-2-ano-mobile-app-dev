// Exercício - maior ou menor de idade

fun main() {

    // Solicita ao usuário para digitar a idade
    print("Digite a sua idade: ")
    val idadeInput = readln() //Lê a entrada do usuário como uma String

    // Verifica se a entrada da idade é nula
    if(idadeInput == null) {
        println("Entrada inválida.")
        return // Sai da função se a entrada for nula
    }

    // Tenta converter a entrada de idade para um valor numérioco
    val idade = idadeInput.toIntOrNull()

    // Verifica se a conversão foi bem-sucedida ou se a entrada é inválida
    if(idade == null){
        println("Idade inválida. Por favor, insira um número válido")
        return // Sai da função main se a conversão não for bem-sucedida
    }

    // Verifica se a idade é maior ou igual a 18
    if (idade >= 18) {
        println("Você é maior de idade.")
    } else {
        println("Você é menor de idade.")
    }

    // Usando operador ternário
    var result = if (idade >= 18) "Você é maior de idade." else "Você é menor de idade."
    println(result)

}