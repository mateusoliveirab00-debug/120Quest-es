fun main(){

//algoritmo 158   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que entre com o valor de x, calcule e imprima o valor de f(x).
//f(x) = 8 / (2 - x)

    print("digite o valor de x: ")
    val x = readln().replace(",", ".").toDouble()
    if (x != 2.0) {
        val fx = 8 / (2 - x)
        println("f(x)= $fx")
    } else {
        println("NÃO PODE SER FEITA")
    }

}
