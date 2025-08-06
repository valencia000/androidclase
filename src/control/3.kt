package control

fun main() {
    print("Ingresa tu edad: ")
    val edadInput = readLine()
    val edad = edadInput?.toIntOrNull()

    if (edad == null || edad < 0) {
        println("Edad inválida. Por favor, ingresa un número válido.")
        return
    }

    val tarifa = when {
        edad < 12 -> "Tarifa infantil"
        edad in 12..64 -> "Tarifa general"
        else -> "Tarifa de adulto mayor"
    }

    println("Categoría: $tarifa")
}
