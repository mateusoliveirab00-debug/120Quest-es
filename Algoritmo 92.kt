fun main(){

//algoritmo 92   [Lista 2 - Estrutura do Se]
//Construir um algoritmo que leia dois números e efetue a adição. Caso o valor somado seja
//maior que 20, este deverá ser apresentado somando-se a ele mais 8; caso o valor somado seja
//menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.

    print("Digite o 1º número: ")
    val num1 = readln().toDouble()
    print("Digite o 2º número: ")
    val num2 = readln().toDouble()
    val soma = num1 + num2
    if (soma > 20) {
        println("resultado: ${soma + 8}")
    } else {
        println("resultado: ${soma - 5}")
    }

}
