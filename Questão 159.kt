import kotlin.math.*

fun main(){

//algoritmo 159   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que entre com o valor de x, calcule e imprima o valor de f(x).
//f(x) = (5x + 3) / raiz(x² - 16)

    print("digite o valor de x: ")
    val x = readln().replace(",", ".").toDouble()
    if (x > 4 || x < -4) {
        val fx = (5 * x + 3) / sqrt(x * x - 16)
        println("f(x)= $fx")
    } else {
        println("NÃO PODE SER FEITA")
    }

}
