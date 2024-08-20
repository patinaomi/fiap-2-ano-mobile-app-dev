// Crie um programa que faça a conversão de temperatura
// Considere que: Celsius = 25.0C
// Fahrenheit = Celsius * 9/5 + 32
// Kelvin é Celsius + 273.15

fun converterTemp(celsius : Float) {
    
    var fahrenheit = celsius * 9/5 + 32
    var kelvin = celsius + 273.15
    
    println("Celsius: $celsius")
    println("Fahrenheit: $fahrenheit")
    println("Kelvin: $kelvin")
}
fun main() {
    
    print("Digite a temperatura: ")
    var celsius = readLine()!!.toFloat()
    
    converterTemp(celsius)      
}
