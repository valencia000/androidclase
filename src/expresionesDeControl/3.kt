package expresionesDeControl

fun primerMultiploDe4(lista: List<Int>): Int? {
    for (numero in lista) {
        if (numero % 4 == 0) return numero
    }
    return null
}

fun main() {
    val lista = listOf(3, 5, 7, 8, 12)
    val resultado = primerMultiploDe4(lista)
    println("Primer múltiplo de 4: $resultado")
}
