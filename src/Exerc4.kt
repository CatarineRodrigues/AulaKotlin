/* Lista de exercícios

4. Crie um algoritmo que, dada uma temperatura em graus célsius, exiba uma mensagem informando o tipo do clima,
de acordo com as seguintes condições:
a. se a temperatura estiver até 18 graus, o clima é frio;
b. se a temperatura estiver entre 19 e 23 graus, o clima é agradável;
c. se a temperatura estiver entre 24 e 35 graus, o clima é quente;
d. se a temperatura estiver acima de 35 graus, o clima é muito quente  */

fun main() {
    print("Insira a temperatura da sua cidade ")
    val temperatura = readln().toInt()
    when {
        temperatura < 19  -> println("O clima é frio")
        temperatura >= 19 && temperatura < 24 -> println("O clima é agradável")
        temperatura > 23 && temperatura <= 35 -> println("O clima é quente")
        temperatura > 35 -> println("O clima é muito quente")
        else -> println("Clima não identificado")

    }
}