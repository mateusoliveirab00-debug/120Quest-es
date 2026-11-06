fun main(){

//algoritmo 64   [Lista 1 - Leia, imprima, atribuição e funções]
//Ler uma temperatura em graus centígrados e apresentá-la convertida em graus Fahrenheit. A
//fórmula de conversão é: F = (9 * C + 160) / 5, onde F é a temperatura em Fahrenheit e C é a
//temperatura em centígrados.

    print("Digite a temperatura em graus centígrados: ")
    val c = readln().toDouble()
    val f = (9 * c + 160) / 5
    println("temperatura em Fahrenheit: $f")

}
