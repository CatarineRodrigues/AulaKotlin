// Lista de exercícios
//
//3. Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5

fun main() {
    print("Digite um número: ")
    val num = readln().toInt()
    if (num % 5 == 0) println("$num é múltiplo de 5") else println("$num não é múltiplo de 5")

}