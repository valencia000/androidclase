package expresionesDeControl

fun main() {
    for (posicion in 1..10) {
        println("Avanzando a posición $posicion")
        if (posicion == 6) {
            println("¡Salida encontrada en la posición $posicion!")
            break
        }
    }
}
