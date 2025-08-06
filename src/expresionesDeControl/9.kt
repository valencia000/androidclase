package expresionesDeControl

fun indicePrimeraVocal(texto: String): Int? {
    val vocales = listOf('a', 'e', 'i', 'o', 'u')
    for ((indice, letra) in texto.withIndex()) {
        if (letra.lowercaseChar() in vocales) return indice
    }
    return null
}

fun main() {
    val palabra = "kotlin"
    println("Índice de primera vocal: ${indicePrimeraVocal(palabra)}")
}
