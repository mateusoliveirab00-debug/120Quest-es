fun main(){

//algoritmo 70   [Lista 1 - Leia, imprima, atribuição e funções]
//Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o
//garçom. Fazer um algoritmo que leia o valor gasto com despesas realizadas em um restaurante
//e imprima o valor total com a gorjeta.

    print("Digite o valor da conta: ")
    val conta = readln().toDouble()
    val total = conta * 1.10
    println("valor total com gorjeta: $total")

}
