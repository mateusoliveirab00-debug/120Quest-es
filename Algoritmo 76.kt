fun main(){

//algoritmo 76   [Lista 1 - Leia, imprima, atribuição e funções]
//Criar um algoritmo que leia um número entre 0 e 60 e imprimir o seu sucessor, sabendo que o
//sucessor de 60 é 0. Não pode ser utilizado nenhum comando de seleção e nem de repetição.

    print("Digite um número de 0 a 60: ")
    val num = readln().toInt()
    val sucessor = (num + 1) % 61
    println("sucessor: $sucessor")

}
