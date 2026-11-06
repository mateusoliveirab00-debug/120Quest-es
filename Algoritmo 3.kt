fun main(){

//algoritmo 3   [Capítulo 1 - Conceitos iniciais]
//Algoritmo para trocar lâmpadas
//1 - se (lâmpada estiver fora de alcance)
//    pegar a escada;
//2 - pegar a lâmpada;
//3 - se (lâmpada estiver quente)
//    pegar pano;
//4 - Tirar lâmpada queimada;
//5 - Colocar lâmpada boa;

    println("A lâmpada está fora de alcance? (s/n)")
    val alcance = readln()
    if (alcance == "s") {
        println("1 - pegar a escada")
    }

    println("2 - pegar a lâmpada")

    println("A lâmpada está quente? (s/n)")
    val quente = readln()
    if (quente == "s") {
        println("3 - pegar pano")
    }

    println("4 - tirar lâmpada queimada")
    println("5 - colocar lâmpada boa")

}
