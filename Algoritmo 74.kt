fun main(){

//algoritmo 74   [Lista 1 - Leia, imprima, atribuição e funções]
//Para vários tributos, a base de cálculo é o salário mínimo. Fazer um algoritmo que leia o
//valor do salário mínimo e o valor do salário de uma pessoa. Calcular e imprimir quantos
//salários mínimos ela ganha.

    print("Digite o salário mínimo: ")
    val salMin = readln().toDouble()
    print("Digite o salário da pessoa: ")
    val salario = readln().toDouble()
    val qtd = salario / salMin
    println("a pessoa ganha $qtd salários mínimos")

}
