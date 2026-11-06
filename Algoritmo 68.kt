fun main(){

//algoritmo 68   [Lista 1 - Leia, imprima, atribuição e funções]
//Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a
//variável A passe a ter o valor da variável B e que a variável B passe a ter o valor da
//variável A. Apresentar os valores trocados.

    print("Digite o valor de A: ")
    var a = readln().toDouble()
    print("Digite o valor de B: ")
    var b = readln().toDouble()

    val aux = a
    a = b
    b = aux

    println("A = $a")
    println("B = $b")

}
