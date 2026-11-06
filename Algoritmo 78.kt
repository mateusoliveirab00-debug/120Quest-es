fun main(){

//algoritmo 78   [Lista 1 - Leia, imprima, atribuição e funções]
//Dado um polígono convexo de n lados, podemos calcular o número de diagonais diferentes (nd)
//desse polígono pela fórmula: nd = n (n - 3) / 2. Fazer um algoritmo que leia quantos lados
//tem o polígono, calcule e escreva o número de diagonais diferentes (nd) do mesmo.

    print("Digite o número de lados: ")
    val n = readln().toInt()
    val nd = n * (n - 3) / 2
    println("número de diagonais: $nd")

}
