fun main(){

//algoritmo 82   [Capítulo 3 - exemplos do texto]
//Ler um número e, se ele for maior do que 20, então imprimir a metade do número.
//Solução nº 1: usa a variável met. Solução nº 2: não cria a variável met (a saída é a mesma).

    print("Digite um número: ")
    val numero = readln().toDouble()

    // Solução 1
    if (numero > 20) {
        val met = numero / 2
        println("metade: $met")
    }

    // Solução 2
    if (numero > 20) {
        println("metade: ${numero / 2}")
    }

}
