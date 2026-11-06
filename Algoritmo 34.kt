fun main(){

//algoritmo 34   [Lista 1 - Leia, imprima, atribuição e funções]
//Ler um número inteiro e imprimir seu sucessor e seu antecessor.

    print("Digite um número: ")
    val numero = readln().toInt()
    val ant = numero - 1
    val suc = numero + 1
    println("sucessor: $suc")
    println("antecessor: $ant")

}
