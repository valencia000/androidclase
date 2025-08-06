package control

fun main() {
    print("Ingresa un número del 1 al 7: ")
    val numeroInput = readLine()
    val numero = numeroInput?.toIntOrNull()

    if (numero == null || numero !in 1..7) {
        println("Número inválido. Debe estar entre 1 y 7.")
        return
    }

    val dia = when (numero) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Día inválido"
    }

    println("Día de la semana: $dia")
}
