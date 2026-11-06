fun main(){

//algoritmo 77   [Lista 1 - Leia, imprima, atribuição e funções]
//Ler dois números reais e imprimir o quadrado da diferença do primeiro valor pelo segundo e a
//diferença dos quadrados.

    print("Digite o 1º número: ")
    val a = readln().toDouble()
    print("Digite o 2º número: ")
    val b = readln().toDouble()
    val quadradoDaDif = (a - b) * (a - b)
    val difDosQuadrados = a * a - b * b
    println("quadrado da diferença: $quadradoDaDif")
    println("diferença dos quadrados: $difDosQuadrados")

}
