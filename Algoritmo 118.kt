fun main(){

//algoritmo 118   [Lista 2 - Estrutura do Se]
//Entrar com três números e imprimi-los em ordem crescente (suponha números diferentes).
//Obs. do livro: várias são as soluções para colocar três números em ordem crescente,
//decrescente, maior e menor ou intermediário. Esta solução armazena na variável a o menor
//valor; na variável b, o segundo valor; e na variável c, o maior valor.

    print("Digite o 1º número: ")
    var a = readln().toDouble()
    print("Digite o 2º número: ")
    var b = readln().toDouble()
    print("Digite o 3º número: ")
    var c = readln().toDouble()
    var aux = 0.0

    if (a > b) {
        aux = a
        a = b
        b = aux
    }
    if (a > c) {
        aux = a
        a = c
        c = aux
    }
    if (b > c) {
        aux = b
        b = c
        c = aux
    }

    println("ordem crescente: $a $b $c")

}
