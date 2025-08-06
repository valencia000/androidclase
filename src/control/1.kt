package control

fun main() {
    print("Ingresa una contraseña: ")
    val contraseña = readLine() ?: ""

    val longitud = contraseña.length

    val mensaje = when {
        longitud < 6 -> "Muy débil"
        longitud in 6..8 -> "Débil"
        else -> "Fuerte"
    }

    println("Fortaleza de la contraseña: $mensaje")
}

