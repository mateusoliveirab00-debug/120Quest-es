fun main(){

//algoritmo 97   [Lista 2 - Estrutura do Se]
//Entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não é
//divisível por nenhum destes.

    print("Digite um número: ")
    val numero = readln().toInt()
    if (numero % 10 == 0) {
        println("divisível por 10")
    } else {
        if (numero % 5 == 0) {
            println("divisível por 5")
        } else {
            if (numero % 2 == 0) {
                println("divisível por 2")
            } else {
                println("não é divisível por 10, 5 ou 2")
            }
        }
    }

}
