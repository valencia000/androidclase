package bucles

fun main() {
    val pinCorrecto = "1234"
    var intentos = 0
    var pinIngresado: String
    do {
        intentos++
        print("Intento $intentos - Ingresa tu PIN: ")
        pinIngresado = readLine() ?: ""
        if (pinIngresado == pinCorrecto) {
            println("PIN correcto, acceso concedido.")
            break
        } else {
            println("PIN incorrecto.")
        }
    } while (intentos < 3)
    if (pinIngresado != pinCorrecto) {
        println("Has agotado los intentos.")
    }
}
