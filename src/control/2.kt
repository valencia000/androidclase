package control

fun main() {
    print("Ingresa la nota (0 a 100): ")
    val notaInput = readLine()
    val nota = notaInput?.toIntOrNull()

    if (nota == null || nota < 0 || nota > 100) {
        println("Nota inválida. Ingresa un número entre 0 y 100.")
        return
    }

    val resultado = when (nota) {
        in 90..100 -> "Excelente"
        in 70..89 -> "Bueno"
        in 50..69 -> "Regular"
        else -> "Reprobado"
    }

    println("Clasificación: $resultado")
}
