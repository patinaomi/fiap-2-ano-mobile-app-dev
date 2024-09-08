// Revisão de Collections

fun main() {

    // Array - São do mesmo tipo
    var cidades = arrayOf<String>("São Paulo", "Belo Horizonte", "Rio de Janeiro", "Curitiba", "Porto Alegre")
    // cidades.forEach { println(it) }
    println(cidades[1])

    cidades[2] = "Florianópolis"
    println(cidades[2])

    // ArrayList - uma lista dinâmica
    var frutas = ArrayList<String>()
    frutas.add("banana")

    println(frutas.contains("Banana".lowercase()))

    //Set, não permite elementos repetidos
    var filmes = HashSet<String> ()
    var catalogo = listOf(
        "Amelie",
        "Filme 2",
        "Como eu Era antes de você"
    )

    filmes.addAll(catalogo)
    println(filmes) // Vai ser adicionado em ordem alfabetica

    // Criando um HashSet de Strings
    val nomes = HashSet<String>()
    var alunos = listOf("Alice", "Bruno", "Carlos", "Diana")

    nomes.addAll(alunos)
    // Adicionando elementos
    nomes.add("Eduardo")
    nomes.add("Carlos")  // Este elemento não será adicionado novamente, pois já existe

    // Iterando sobre os elementos
    for (nome in nomes) {
        println(nome)
    }

    // Verificando se um elemento existe
    println(nomes.contains("Bruno"))  // Saída: true

    // Removendo elementos
    nomes.remove("Alice")
    println(nomes)

    // Criando um HashMap usando a classe HashMap
    val alunos2 = HashMap<String, Int>()

    // Adicionando elementos ao HashMap
    alunos2["Ana"] = 90
    alunos2["Bruno"] = 85
    alunos2["Carlos"] = 88

    // Acessando elementos
    println("Nota de Ana: ${alunos2["Ana"]}")  // Saída: Nota de Ana: 90

    // Atualizando elementos
    alunos2["Ana"] = 95
    println("Nova nota de Ana: ${alunos2["Ana"]}")  // Saída: Nova nota de Ana: 95

    // Removendo elementos
    alunos2.remove("Bruno")
    println("Após remover Bruno: $alunos2")  // Saída: Após remover Bruno: {Ana=95, Carlos=88}

    // Iterando sobre o HashMap
    for ((nome, nota) in alunos2) {
        println("$nome: $nota")
    }

    //Coalescência nula (para evitar null pointer exception)
    fun obterNome(): String? {
        return null
    }

    val nome = obterNome() ?: "Desconhecido"
    println(nome)  // Saída: Desconhecido



}