fun main(){

//algoritmo 122   [Lista 2 - Estrutura do Se]
//Ler três números e imprimir se eles podem ou não ser lados de um triângulo.

    print("digite o 1º lado: ")
    val a = readln().replace(",", ".").toDouble()
    print("digite o 2º lado: ")
    val b = readln().replace(",", ".").toDouble()
    print("digite o 3º lado: ")
    val c = readln().replace(",", ".").toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        println("Podem ser lados de um triângulo")
    } else {
        println("Não podem ser lados de um triângulo")
    }

}
