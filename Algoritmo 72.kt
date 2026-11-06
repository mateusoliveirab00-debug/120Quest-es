fun main(){

//algoritmo 72   [Lista 1 - Leia, imprima, atribuição e funções]
//Criar um algoritmo que leia o valor de um depósito e o valor da taxa de juros. Calcular e
//imprimir o valor do rendimento e o valor total depois do rendimento.

    print("Digite o valor do depósito: ")
    val deposito = readln().toDouble()
    print("Digite a taxa de juros: ")
    val taxa = readln().toDouble()
    val rendimento = deposito * taxa / 100
    val total = deposito + rendimento
    println("rendimento: $rendimento")
    println("total: $total")

}
