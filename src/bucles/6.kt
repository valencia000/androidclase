package bucles

fun main() {
    val lista = listOf(1, 3, 5, 7, 9)
    var index = 0
    while (index < lista.size) {
        if (lista[index] == 7) {
            println("Número 7 encontrado en la posición $index")
            break
        }
        index++
    }
}
