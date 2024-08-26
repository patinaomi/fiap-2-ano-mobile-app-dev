// Imprimindo múltiplos de 0 a 50

fun main() {
    for(i in 1..50) {
        if(i % 5 == 0) {
            println(i)
        }
    }

    for(i in 0..50 step 5) {
        println(i)
    }
}
