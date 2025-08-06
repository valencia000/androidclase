package control

fun main() {
    print("Ingresa la temperatura en grados Celsius: ")
    val tempInput = readLine()
    val temperatura = tempInput?.toDoubleOrNull()

    if (temperatura == null) {
        println("Entrada inválida. Ingresa un número válido.")
        return
    }

    val estado = when {
        temperatura < 0 -> "Bajo cero"
        temperatura in 0.0..14.9 -> "Fría"
        temperatura in 15.0..25.0 -> "Agradable"
        else -> "Calurosa"
    }

    println("La temperatura es: $estado")
}
