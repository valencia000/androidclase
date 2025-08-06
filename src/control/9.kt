package control

fun main() {
    print("Ingresa tu rol (admin, moderador, usuario, invitado): ")
    val rolInput = readLine()?.lowercase()

    if (rolInput.isNullOrBlank()) {
        println("Rol inválido.")
        return
    }

    val permisos = when (rolInput) {
        "admin" -> "Permisos completos: gestionar usuarios, contenido y configuración."
        "moderador" -> "Permisos medios: gestionar contenido y usuarios limitadamente."
        "usuario" -> "Permisos básicos: acceder y utilizar funciones estándar."
        "invitado" -> "Permisos limitados: solo vista de contenido público."
        else -> "Rol no reconocido. Acceso denegado."
    }

    println("Permisos asignados: $permisos")
}
