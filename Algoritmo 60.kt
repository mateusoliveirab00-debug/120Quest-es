fun main(){

//algoritmo 60   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com a razão de uma PA e o valor do 1º termo. Calcular e imprimir o 10º termo da
//série.

    print("Digite o 1º termo: ")
    val termo = readln().toInt()
    print("Digite a razão: ")
    val razao = readln().toInt()
    val decimo = termo + 9 * razao
    println("10º termo: $decimo")

}
