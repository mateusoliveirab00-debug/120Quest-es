fun main(){

//algoritmo 138   [Lista 2 - Estrutura do Se]
//Ler um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso o usuário digite um
//número fora desse intervalo, deverá aparecer uma mensagem informando que não existe mês com
//este número.
//Solução nº 1: ses aninhados. Solução nº 2: escolha/caso (when no Kotlin).

    print("digite um número de 1 a 12: ")
    val num = readln().toInt()

    // Solução nº 1 (ses encadeados)
    if (num == 1) {
        println("Solução 1 - janeiro")
    } else if (num == 2) {
        println("Solução 1 - fevereiro")
    } else if (num == 3) {
        println("Solução 1 - março")
    } else if (num == 4) {
        println("Solução 1 - abril")
    } else if (num == 5) {
        println("Solução 1 - maio")
    } else if (num == 6) {
        println("Solução 1 - junho")
    } else if (num == 7) {
        println("Solução 1 - julho")
    } else if (num == 8) {
        println("Solução 1 - agosto")
    } else if (num == 9) {
        println("Solução 1 - setembro")
    } else if (num == 10) {
        println("Solução 1 - outubro")
    } else if (num == 11) {
        println("Solução 1 - novembro")
    } else if (num == 12) {
        println("Solução 1 - dezembro")
    } else {
        println("Solução 1 - não existe mês correspondente")
    }

    // Solução nº 2 (escolha/caso)
    when (num) {
        1 -> println("Solução 2 - janeiro")
        2 -> println("Solução 2 - fevereiro")
        3 -> println("Solução 2 - março")
        4 -> println("Solução 2 - abril")
        5 -> println("Solução 2 - maio")
        6 -> println("Solução 2 - junho")
        7 -> println("Solução 2 - julho")
        8 -> println("Solução 2 - agosto")
        9 -> println("Solução 2 - setembro")
        10 -> println("Solução 2 - outubro")
        11 -> println("Solução 2 - novembro")
        12 -> println("Solução 2 - dezembro")
        else -> println("Solução 2 - não existe mês correspondente a este número")
    }

}
