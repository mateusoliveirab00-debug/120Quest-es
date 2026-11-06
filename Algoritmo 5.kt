fun main(){

//algoritmo 5   [Capítulo 1 - Conceitos iniciais]
//Algoritmo para fazer um bolo simples
//1 - pegar os ingredientes;
//2 - se (roupa branca)
//    colocar avental;
//3 - se (tiver batedeira)
//    bater os ingredientes na batedeira;
//    senão
//    bater os ingredientes à mão;
//4 - colocar a massa na forma;
//5 - colocar a forma no forno;
//6 - aguardar o tempo necessário;
//7 - retirar o bolo;

    println("1 - pegar os ingredientes")

    println("Está de roupa branca? (s/n)")
    val roupa = readln()
    if (roupa == "s") {
        println("2 - colocar avental")
    }

    println("Tem batedeira? (s/n)")
    val batedeira = readln()
    if (batedeira == "s") {
        println("3 - bater os ingredientes na batedeira")
    } else {
        println("3 - bater os ingredientes à mão")
    }

    println("4 - colocar a massa na forma")
    println("5 - colocar a forma no forno")
    println("6 - aguardar o tempo necessário")
    println("7 - retirar o bolo")

}
