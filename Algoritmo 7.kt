fun main(){

//algoritmo 7   [Capítulo 1 - Conceitos iniciais]
//Algoritmo para fazer uma prova
//1 - ler a prova;
//2 - pegar a caneta;
//3 - enquanto ((houver questão em branco) e (tempo não terminou))faça
//    se (souber a questão)
//    resolvê-la;
//    senão
//    pular para outra;
//4 - entregar a prova;

    println("1 - ler a prova")
    println("2 - pegar a caneta")

    print("Quantas questões em branco tem? ")
    var emBranco = readln().toInt()
    print("Quantos minutos faltam? ")
    var tempo = readln().toInt()

    while (emBranco > 0 && tempo > 0) {
        println("Você sabe a questão? (s/n)")
        val sabe = readln()
        if (sabe == "s") {
            println("resolvendo a questão")
            emBranco = emBranco - 1
        } else {
            println("pulando para outra")
        }
        tempo = tempo - 1
    }

    println("4 - entregar a prova")

}
