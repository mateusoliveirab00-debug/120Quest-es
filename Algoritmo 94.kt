fun main(){

//algoritmo 94   [Lista 2 - Estrutura do Se]
//Entrar com um número e imprimir uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3.

    print("Digite um número: ")
    val numero = readln().toInt()
    if (numero % 3 == 0) {
        println("é múltiplo de 3")
    } else {
        println("não é múltiplo de 3")
    }

}
