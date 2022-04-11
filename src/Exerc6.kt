// Lista de exercícios
//
//6. Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais.
// Considere a cotação do dolar atual
// 4,69 Real brasileiro

fun main() {
    print("Digite um valor: ")
    val num = readln().toFloat()
    var real = num * 4.69f
    println("O valor U$ $num em reais é R$ $real")

}