package control

fun main() {
    print("Ingresa tu edad: ")
    val edadInput = readLine()?.toIntOrNull()

    if (edadInput == null || edadInput < 0) {
        println("Edad inválida.")
        return
    }

    print("¿Tienes invitación especial? (sí/no): ")
    val invitacionInput = readLine()?.lowercase()

    val tieneInvitacion = invitacionInput == "sí" || invitacionInput == "si"

    val accesoPermitido = edadInput >= 18 || tieneInvitacion

    if (accesoPermitido) {
        println("Acceso permitido.")
    } else {
        println("Acceso denegado.")
    }
}
