package expresionesDeControl

fun hayAprobado(notas: List<Int>): Boolean {
    for (nota in notas) {
        if (nota > 60) return true
    }
    return false
}

fun main() {
    val notas = listOf(40, 55, 72, 38)
    println("¿Hay algún aprobado? ${hayAprobado(notas)}")
}
