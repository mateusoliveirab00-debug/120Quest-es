fun main(){

//algoritmo 146   [Lista 2 - Estrutura do Se]
//Fazer um algoritmo que leia o percurso em quilômetros, o tipo do carro e informe o consumo
//estimado de combustível, sabendo-se que um carro tipo C faz 12 km com um litro de gasolina,
//um tipo B faz 9 km e o tipo A, 8 km por litro.
//Obs.: no PDF o enunciado repete "tipo C" no lugar do A, e o código do livro usa 10 km/l para
//o tipo B; aqui seguimos o enunciado (9 km/l).

    print("digite o tipo de carro (A / B / C): ")
    val tipo = readln()
    print("digite o percurso (km): ")
    val percurso = readln().replace(",", ".").toDouble()

    val kmPorLitro = when (tipo.uppercase()) {
        "A" -> 8.0
        "B" -> 9.0
        "C" -> 12.0
        else -> 0.0
    }

    if (kmPorLitro == 0.0) {
        println("Modelo inexistente")
    } else {
        println("Consumo estimado em litros: ${"%.2f".format(percurso / kmPorLitro)}")
    }

}
