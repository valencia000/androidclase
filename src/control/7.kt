package control

fun main() {
    print("Ingresa el primer número: ")
    val a = readLine()?.toIntOrNull()
    print("Ingresa el segundo número: ")
    val b = readLine()?.toIntOrNull()
    print("Ingresa el tercer número: ")
    val c = readLine()?.toIntOrNull()

    if (a == null || b == null || c == null) {
        println("Entrada inválida. Asegúrate de ingresar solo números.")
        return
    }

    val mayor = maxOf(a, b, c)
    val menor = minOf(a, b, c)

    println("Mayor: $mayor")
    println("Menor: $menor")

    val repetidos = when {
        a == b && b == c -> "Los tres números son iguales."
        a == b || a == c || b == c -> "Hay números repetidos."
        else -> "Todos los números son diferentes."
    }

    println(repetidos)
}
