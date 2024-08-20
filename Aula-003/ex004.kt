// Crie um programa para Calculadora de Média escolar, considere 3 notas
// Exercício feito com entrada de dados

fun mediaNotas(nota1 : Float, nota2 : Float, nota3 : Float) : Float {
    return (nota1 + nota2 + nota3) / 3
}

fun main() {
    //Pedindo para o usuário
    print("Digite a 1º nota: ")
    var nota1 = readln().toFloat()

    print("Digite a 2º nota: ")
    var nota2 = readln().toFloat()

    print("Digite a 3º nota: ")
    var nota3 = readln().toFloat()

    var result = mediaNotas(nota1, nota2, nota3)
    println("A média do aluno é %.2f".format(result))
}