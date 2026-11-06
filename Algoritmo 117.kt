fun main(){

//algoritmo 117   [Lista 2 - Estrutura do Se]
//Entrar com três números e armazenar o maior número na variável de nome maior (suponha
//números diferentes).
//Obs. do livro: esta é uma solução alternativa e melhor para o algoritmo anterior.
//Solução nº 1: compara a com b e depois o vencedor com c. Solução nº 2: parte de maior = a e
//vai comparando.

    print("Digite o 1º número: ")
    val a = readln().toDouble()
    print("Digite o 2º número: ")
    val b = readln().toDouble()
    print("Digite o 3º número: ")
    val c = readln().toDouble()

    // Solução 1
    var maior = 0.0
    if (a > b) {
        maior = a
    } else {
        maior = b
    }
    if (c > maior) {
        maior = c
    }
    println("maior: $maior")

    // Solução 2
    var maior2 = a
    if (b > maior2) {
        maior2 = b
    }
    if (c > maior2) {
        maior2 = c
    }
    println("maior: $maior2")

}
