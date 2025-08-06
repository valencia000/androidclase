package expresionesDeControlConTryCatch

fun main() {
    val a = 10
    val b = 5
    val operador = "/"

    try {
        val resultado = when (operador) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            else -> throw IllegalArgumentException("Operador no válido")
        }
        println("Resultado: $resultado")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
