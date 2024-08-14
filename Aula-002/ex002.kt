// Ex 002: Crie uma função que calcule a soma dos quadrados de dois números
fun somaQuadrados(numA: Int, numB: Int) : Int { // Esse int do final é o tipo do retorno
    val quadA = numA * numA
    val quadB = numB * numB
    val result = quadA + quadB

    // return numA * numA + numB * numB Dá pra fazer mais diretão
    return result
}

fun main() {
    val a = 2
    val b = 3
    val result = somaQuadrados(a, b)    
    println(result)

    //Pra pedir pro usuário
    print("Digite o primeiro número: ")
    val numA = readLine()!!.toInt() //Lembra um pouco C#
    print("Digite o segundo número: ")
    val numB = readLine()!!.toInt()

    val resultado = somaQuadrados(numA, numB)
}