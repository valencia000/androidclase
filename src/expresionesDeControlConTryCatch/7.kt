package expresionesDeControlConTryCatch

fun verificarEdad(edad: Int) {
    if (edad < 0) throw IllegalArgumentException("La edad no puede ser negativa.")
    println("Edad válida: $edad")
}

fun main() {
    try {
        verificarEdad(-5)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
