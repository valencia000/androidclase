package expresionesDeControlConTryCatch

fun convertirANumero(texto: String): Int {
    return try {
        texto.toInt()
    } catch (e: NumberFormatException) {
        0
    }
}

fun main() {
    val entrada = "no-numero"
    val resultado = convertirANumero(entrada)
    println("Resultado: $resultado")
}
