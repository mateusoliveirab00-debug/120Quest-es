fun main(){

//algoritmo 41   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos são
//respectivamente: 1, 2, 3 e 4.

    print("Digite o 1º número: ")
    val a = readln().toDouble()
    print("Digite o 2º número: ")
    val b = readln().toDouble()
    print("Digite o 3º número: ")
    val c = readln().toDouble()
    print("Digite o 4º número: ")
    val d = readln().toDouble()
    val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10
    println("média ponderada: $mp")

}
