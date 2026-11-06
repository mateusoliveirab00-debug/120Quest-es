fun main(){

//algoritmo 43   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com um número e imprimir o logaritmo desse número na base 10.

    print("Digite o número: ")
    val num = readln().toDouble()
    val log = Math.log(num) / Math.log(10.0)
    println("logaritmo: $log")

}
