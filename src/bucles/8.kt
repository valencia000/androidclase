package bucles

fun main() {
    val notas = mapOf("Ana" to 85, "Luis" to 60, "Marta" to 45)
    for ((estudiante, nota) in notas) {
        val estado = if (nota >= 60) "Aprobado" else "Reprobado"
        println("$estudiante: $estado")
    }
}
