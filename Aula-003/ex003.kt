// Crie um programa para Calculadora de Média escolar, considere 3 notas

fun mediaAluno(numA : Float, numB : Float, numC : Float) : Float {
    var resultado = (numA + numB + numC) / 3
    return resultado
}

fun main() {
    var res = mediaAluno(6.6f, 7.8f, 8.9f)
    println("A média do aluno é $res")

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