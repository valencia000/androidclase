package bucles

fun main() {
    val numeros = arrayOf(2, 3, 4)
    var producto = 1
    for (n in numeros) {
        producto *= n
    }
    println("Producto: $producto")
}
