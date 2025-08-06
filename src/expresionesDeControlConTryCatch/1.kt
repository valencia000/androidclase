package expresionesDeControlConTryCatch

fun main() {
    val numerador = 10
    val divisor = 0

    try {
        val resultado = numerador / divisor
        println("Resultado: $resultado")
    } catch (e: ArithmeticException) {
        println("Error: No se puede dividir por cero.")
    }
}
