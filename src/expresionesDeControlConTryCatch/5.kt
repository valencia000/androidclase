package expresionesDeControlConTryCatch

fun main() {
    val a = 10
    val b = 0

    try {
        val resultado = a / b
        println("Resultado: $resultado")
    } catch (e: ArithmeticException) {
        println("Error: División por cero.")
    } finally {
        println("Operación finalizada.")
    }
}
