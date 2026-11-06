fun main(){

//algoritmo 99   [Lista 2 - Estrutura do Se]
//Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das centenas é
//par ou ímpar.

    print("Digite um número de 3 algarismos: ")
    val num = readln().toInt()
    val centena = num / 100
    if (centena % 2 == 0) {
        println("a centena é par")
    } else {
        println("a centena é ímpar")
    }

}
