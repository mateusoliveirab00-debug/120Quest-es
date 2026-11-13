fun main(){

//algoritmo 123   [Lista 2 - Estrutura do Se]
//Ler três números, os possíveis lados de um triângulo, e imprimir a classificação segundo os
//lados.

    print("digite o 1º lado: ")
    val a = readln().replace(",", ".").toDouble()
    print("digite o 2º lado: ")
    val b = readln().replace(",", ".").toDouble()
    print("digite o 3º lado: ")
    val c = readln().replace(",", ".").toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && a == c) {
            println("Triângulo equilátero")
        } else {
            if (a == b || a == c || b == c) {
                println("Triângulo isósceles")
            } else {
                println("Triângulo escaleno")
            }
        }
    } else {
        println("As medidas não formam um triângulo")
    }

}
