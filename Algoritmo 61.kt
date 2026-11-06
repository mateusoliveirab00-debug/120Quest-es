fun main(){

//algoritmo 61   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com a razão de uma PG e o valor do 1º termo. Calcular e imprimir o 5º termo da série.

    print("Digite o 1º termo: ")
    val termo = readln().toDouble()
    print("Digite a razão: ")
    val razao = readln().toDouble()
    val quinto = termo * Math.pow(razao, 4.0)
    println("5º termo: $quinto")

}
