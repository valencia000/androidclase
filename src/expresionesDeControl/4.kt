package expresionesDeControl

fun main() {
    bucle@ for (i in 0..3) {
        for (j in 0..3) {
            println("i=$i, j=$j")
            if (i + j == 5) {
                println("Corte total cuando i+j = 5")
                break@bucle
            }
        }
    }
}
