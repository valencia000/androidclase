package expresionesDeControlConTryCatch

fun main() {
    val entrada = "abc"
    val divisor = 0

    try {
        val numero = try {
            entrada.toInt()
        } catch (e: NumberFormatException) {
            println("Error de conversión.")
            return
        }

        try {
            val resultado = numero / divisor
            println("Resultado: $resultado")
        } catch (e: ArithmeticException) {
            println("Error: División por cero.")
        }

    } catch (e: Exception) {
        println("Error inesperado: ${e.message}")
    }
}
