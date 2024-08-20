// Crie um programa para Calculadora de Média escolar, considere 3 notas

fun mediaAluno(numA : Float, numB : Float, numC : Float) : Float {
    var resultado = (numA + numB + numC) / 3
    return resultado
}

fun main() {
    var res = mediaAluno(6.6f, 7.8f, 8.9f)
    println("A média do aluno é %.2f".format(res))

    // Por curiosidade, daria pra usar o format e colocar vários interpoladores
    //println("As notas são: %.2f, %.2f, %.2f e a média do aluno é %.2f".format(nota1, nota2, nota3, media))
}