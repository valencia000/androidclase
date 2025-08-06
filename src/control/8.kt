package control

fun main() {
    print("Ingresa el nombre del archivo (con extensión): ")
    val archivo = readLine()

    if (archivo.isNullOrBlank() || !archivo.contains(".")) {
        println("Nombre de archivo inválido.")
        return
    }

    val extension = archivo.substringAfterLast(".").lowercase()

    val tipo = when (extension) {
        "jpg", "jpeg", "png", "gif" -> "Imagen"
        "pdf" -> "Documento"
        "txt" -> "Texto plano"
        "doc", "docx" -> "Documento de Word"
        "xls", "xlsx" -> "Hoja de cálculo"
        "mp3", "wav" -> "Audio"
        "mp4", "avi", "mov" -> "Video"
        else -> "Tipo de archivo desconocido"
    }

    println("Tipo de archivo: $tipo")
}
