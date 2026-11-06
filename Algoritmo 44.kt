fun main(){

//algoritmo 44   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com o número e a base em que se deseja calcular o logaritmo desse número e
//imprimi-lo.

    print("Digite o número: ")
    val num = readln().toDouble()
    print("Digite a base: ")
    val base = readln().toDouble()
    val log = Math.log(num) / Math.log(base)
    println("logaritmo: $log")

}
