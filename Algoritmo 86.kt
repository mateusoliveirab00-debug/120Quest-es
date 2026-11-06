fun main(){

//algoritmo 86   [Capítulo 3 - exemplos do texto]
//Ler um número e imprimir se ele é positivo, negativo ou nulo.

    print("Digite um número: ")
    val num = readln().toDouble()
    if (num > 0) {
        println("POSITIVO")
    } else {
        if (num < 0) {
            println("NEGATIVO")
        } else {
            println("NULO")
        }
    }

}
