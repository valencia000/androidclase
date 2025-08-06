package expresionesDeControlConTryCatch

fun main() {
    val texto = "12a"

    val resultado = runCatching {
        texto.toInt()
    }

    resultado
        .onSuccess { println("Número convertido: $it") }
        .onFailure { println("Error al convertir: ${it.message}") }
}
