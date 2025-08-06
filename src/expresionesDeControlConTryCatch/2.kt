package expresionesDeControlConTryCatch


fun main() {
    val texto = "abc"

    try {
        val numero = texto.toInt()
        println("Número convertido: $numero")
    } catch (e: NumberFormatException) {
        println("Error: '$texto' no es un número válido.")
    }
}
