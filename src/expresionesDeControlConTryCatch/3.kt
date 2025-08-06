package expresionesDeControlConTryCatch

import java.io.File
import java.io.FileNotFoundException

fun main() {
    try {
        val archivo = File("archivo_inexistente.txt")
        val contenido = archivo.readText()
        println(contenido)
    } catch (e: FileNotFoundException) {
        println("Error: El archivo no existe.")
    }
}
