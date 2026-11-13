fun main(){

//algoritmo 124   [Lista 2 - Estrutura do Se]
//Ler três números, os possíveis lados de um triângulo, e imprimir a classificação segundo os
//ângulos.

    print("digite o 1º lado: ")
    val a = readln().replace(",", ".").toDouble()
    print("digite o 2º lado: ")
    val b = readln().replace(",", ".").toDouble()
    print("digite o 3º lado: ")
    val c = readln().replace(",", ".").toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        // Teorema de Pitágoras: compara o quadrado do maior lado com a soma dos quadrados dos outros
        val maior: Double
        val lados: Double
        if (a > b && a > c) {
            maior = a * a; lados = b * b + c * c
        } else {
            if (b > c) {
                maior = b * b; lados = a * a + c * c
            } else {
                maior = c * c; lados = a * a + b * b
            }
        }
        if (maior == lados) {
            println("Triângulo retângulo")
        } else {
            if (maior > lados) {
                println("Triângulo obtusângulo")
            } else {
                println("Triângulo acutângulo")
            }
        }
    } else {
        println("As medidas não formam um triângulo")
    }

}
