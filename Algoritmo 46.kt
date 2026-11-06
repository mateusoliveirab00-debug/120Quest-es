fun main(){

//algoritmo 46   [Lista 1 - Leia, imprima, atribuição e funções]
//Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima o novo saldo,
//considerando o reajuste de 1%.

    print("Digite o saldo: ")
    val saldo = readln().toDouble()
    val novoSaldo = saldo * 1.01
    println("novo saldo: $novoSaldo")

}
