// Crie um programa para Calculadora de Média escolar, considere 3 notas
// Exercício feito com entrada de dados
fun mediaNotas(nota1 : Float, nota2 : Float, nota3 : Float) : Float {
    return (nota1 + nota2 + nota3) / 3
}

fun main() {
    //Pedindo para o usuário
    print("Digite a 1 nota: ")
    var nota1 = readLine()!!.toFloat()

    print("Digite a 2 nota: ")
    var nota2 = readLine()!!.toFloat()

    print("Digite a 3 nota: ")
    var nota3 = readLine()!!.toFloat()

    var result = mediaAluno(nota1, nota2, nota3)
    var resultFormatado = String.format("%.2f", result) //Para formatar com 2 casas
    println("A média do aluno é $resultFormatado")
}