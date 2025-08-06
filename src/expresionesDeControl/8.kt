package expresionesDeControl

fun main() {
    val numeros = listOf(3, 5, 8, -1, 6)
    var suma = 0
    for (n in numeros) {
        if (n < 0) break
        suma += n
    }
    println("Suma hasta primer negativo: $suma")
}
