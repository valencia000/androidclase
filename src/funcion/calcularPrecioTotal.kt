package funcion

fun calcularPrecioTotal(
    precioBase: Double,
    impuesto: Double = 21.0,
    descuento: Double = 10.0
): Double {
    val precioConDescuento = precioBase * (1 - descuento / 100)
    val precioConImpuesto = precioConDescuento * (1 + impuesto / 100)
    return precioConImpuesto
}

fun main() {
    print("Ingresa el precio del producto que deseas adquirir: ")
    val precioBase = readLine()?.toDoubleOrNull()

    if (precioBase != null && precioBase >= 0) {
        val total = calcularPrecioTotal(precioBase)
        println(" El Precio total del producto con su descuento del 10% y su impuesto del 21% es : $total")
    } else {
        println(" inválido. Debes ingresar un número positivo.")
    }
}

