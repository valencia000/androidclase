package control

fun main() {
    print("Ingresa un solo carácter: ")
    val input = readLine()

    if (input.isNullOrEmpty() || input.length != 1) {
        println("Entrada inválida. Debes ingresar un solo carácter.")
        return
    }

    val caracter = input[0]

    val tipo = when {
        caracter.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u') -> "Vocal"
        caracter.isLetter() -> "Consonante"
        caracter.isDigit() -> "Número"
        else -> "Símbolo especial"
    }

    println("El carácter '$caracter' es: $tipo")
}
