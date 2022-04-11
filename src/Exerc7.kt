// Lista de exercícios
//
//7. Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
// calcular e escrever a área do retângulo

fun main() {
    println("Digite a base de um retângulo ")
    val base = readln().toInt()
    println("Digite a altura desse retângulo ")
    val altura = readln().toInt()
    val area: Int = base*altura
    println("A área dese retângulo é $area")

}