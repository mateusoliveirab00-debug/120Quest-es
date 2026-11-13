fun main(){

//algoritmo 121   [Lista 2 - Estrutura do Se]
//Efetuar a leitura de cinco números inteiros diferentes e identificar o maior e o menor
//valor.
//Obs. do livro: o teste de "diferentes" é necessário porque o exercício fala sobre os números
//serem diferentes. Com várias entradas o algoritmo fica longo; as estruturas de repetição vão
//melhorá-lo.

    print("digite o 1º número: ")
    val n1 = readln().toInt()
    print("digite o 2º número: ")
    val n2 = readln().toInt()
    print("digite o 3º número: ")
    val n3 = readln().toInt()
    print("digite o 4º número: ")
    val n4 = readln().toInt()
    print("digite o 5º número: ")
    val n5 = readln().toInt()

    if (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 && n2 != n3 && n2 != n4 &&
        n2 != n5 && n3 != n4 && n3 != n5 && n4 != n5) {
        var maior: Int
        var menor: Int
        if (n1 > n2) {
            maior = n1; menor = n2
        } else {
            maior = n2; menor = n1
        }
        if (n3 > maior) { maior = n3 } else { if (n3 < menor) { menor = n3 } }
        if (n4 > maior) { maior = n4 } else { if (n4 < menor) { menor = n4 } }
        if (n5 > maior) { maior = n5 } else { if (n5 < menor) { menor = n5 } }
        println("Maior= $maior")
        println("Menor= $menor")
    } else {
        println("Os valores devem ser diferentes")
    }

}
