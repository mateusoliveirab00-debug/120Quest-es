fun main(){

//algoritmo 119   [Lista 2 - Estrutura do Se]
//Entrar com três números e imprimi-los em ordem decrescente (suponha números diferentes).

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

    println("ordem decrescente: $c $b $a")

}
