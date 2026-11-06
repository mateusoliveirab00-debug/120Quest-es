fun main(){

//algoritmo 91   [Lista 2 - Estrutura do Se]
//Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição; caso o
//resultado seja maior que 10, apresentá-lo.

    print("Digite o 1º número: ")
    val num1 = readln().toInt()
    print("Digite o 2º número: ")
    val num2 = readln().toInt()
    val soma = num1 + num2
    if (soma > 10) {
        println("soma: $soma")
    }

}
