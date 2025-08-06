package expresionesDeControlConTryCatch

fun main() {
    val texto = "abc"
    val divisor = 0

    try {
        val numero = texto.toInt()
        val resultado = numero / divisor
        println("Resultado: $resultado")
    } catch (e: Exception) {
        when (e) {
            is NumberFormatException -> println("Error: Conversión inválida.")
            is ArithmeticException -> println("Error: División por cero.")
            else -> println("Otro error: ${e.message}")
        }
    }
}
