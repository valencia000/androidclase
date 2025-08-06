package bucles

fun main() {
    var sumaPares = 0
    for (num in 1..20) {
        if (num % 2 == 0) sumaPares += num
    }
    println("Suma de pares entre 1 y 20: $sumaPares")
}
