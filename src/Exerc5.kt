// Lista de exercícios
//
//5. Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo

fun main() {
    print("Digite um número: ")
    val num = readln().toInt()
    if (num > 0) println("$num é positivo") else println("$num é negativo")

}