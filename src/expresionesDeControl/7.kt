package expresionesDeControl

fun main() {
    for (i in 1..8) {
        if (i % 2 != 0) continue
        println(i)
    }
}
