package expresionesDeControl

fun main() {
    bucle@ for (i in 0..3) {
        for (j in 0..3) {
            if (i == j) continue@bucle
            println("i=$i, j=$j")
        }
    }
}
