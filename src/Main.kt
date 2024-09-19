fun main() {
    val cpu = (1..10).random()

    println("Por favor escolha um numero entre 1 e 10:")
    val player = readln().toIntOrNull()

    if (player in 1..10) {
        if (player == cpu) {
            println("O CPU escolheu : $cpu")
            println("Parabens acertou no numero")
        } else {
            println("O CPU escolheu : $cpu")
            println("Perdeu ;(")
        }
    } else {
        println("Input Invalido")
    }
}