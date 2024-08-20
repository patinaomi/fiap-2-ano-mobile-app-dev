// Busca de Elementos dentro de um Array

fun main() {

    // Array de strings
    val names = arrayOf("Alice", "Bob", "Charlie", "David", "Emma")
    val searchName = "Charlie" // Elemento a ser buscado
    var found = false // Variável para verificar se o elemento foi encontrado

    // Loop para verificar se o elemento está presente
    for (name in names) {

//        Da pra usar com contains
//        if (searchName.contains(name)) {
//            found = true
//        }

        if (name == searchName) {
            found = true
            break
        }
    }

    if(found) {
        println("$searchName is found")
    }
    else {
        println("$searchName is not found")
    }






}