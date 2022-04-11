// Lista de exercícios
//
//2. Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu

fun main() {
    print("Digite a sua idade: ")
    val idade = readln().toInt()
    val dias: Int = idade*365

    println("Você viveu $dias dias")
}