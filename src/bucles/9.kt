package bucles

fun main() {
    val letras = listOf('a', 'b', 'c', 'd')
    for ((indice, letra) in letras.withIndex()) {
        println("Índice $indice: $letra")
    }
}
