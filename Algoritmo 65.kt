fun main(){

//algoritmo 65   [Lista 1 - Leia, imprima, atribuição e funções]
//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: volume =
//3.14159 * R² * altura.

    print("Digite o raio: ")
    val raio = readln().toDouble()
    print("Digite a altura: ")
    val altura = readln().toDouble()
    val volume = 3.14159 * raio * raio * altura
    println("volume da lata: $volume")

}
