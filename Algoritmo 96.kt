fun main(){

//algoritmo 96   [Lista 2 - Estrutura do Se]
//Entrar com um número e informar se ele é divisível por 3 e por 7.

    print("Digite um número: ")
    val numero = readln().toInt()
    if (numero % 3 == 0 && numero % 7 == 0) {
        println("é divisível por 3 e por 7")
    } else {
        println("não é divisível por 3 e por 7")
    }

}
