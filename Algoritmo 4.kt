fun main(){

//algoritmo 4   [Capítulo 1 - Conceitos iniciais]
//Algoritmo para o fim de semana
//1 - vejo a previsão do tempo;
//2 - se (fizer sol)
//    vou à praia;
//    senão
//    vou estudar;
//3 - almoçar
//4 - ver televisão
//5 - dormir

    println("1 - ver a previsão do tempo")

    println("Vai fazer sol? (s/n)")
    val sol = readln()
    if (sol == "s") {
        println("2 - ir à praia")
    } else {
        println("2 - ir estudar")
    }

    println("3 - almoçar")
    println("4 - ver televisão")
    println("5 - dormir")

}
