// Lista de exercícios
//
//8. Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor destas variáveis.
// Isto é, x deve ficar com o valor de y e y deve ficar com o valor de x. Mostre os valores depois da troca

fun main() {
    println("Digite um número para X ")
    var x = readln().toInt()
    println("Digite outro número para Y")
    var y = readln().toInt()
    var transicao = x
    x = y
    y = transicao
    println("O novo valor de X é $x e o novo valor de Y é $y")
}