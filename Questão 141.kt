fun main(){

//algoritmo 141   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que leia o nome e o total de pontos de três finalistas de um campeonato
//de pingue-pongue e exibir a colocação da seguinte forma:
//Vencedor: ________ XXXX ptos
//Segundo colocado: ________ XXXX ptos
//Terceiro colocado: ________ XXXX ptos

    print("digite o 1º nome: ")
    val nome1 = readln()
    print("digite os pontos: ")
    val pontos1 = readln().toInt()
    print("digite o 2º nome: ")
    val nome2 = readln()
    print("digite os pontos: ")
    val pontos2 = readln().toInt()
    print("digite o 3º nome: ")
    val nome3 = readln()
    print("digite os pontos: ")
    val pontos3 = readln().toInt()

    var n1 = nome1; var p1 = pontos1
    var n2 = nome2; var p2 = pontos2
    var n3 = nome3; var p3 = pontos3
    var aux: Int
    var auxn: String

    // ordena em ordem decrescente de pontos, trocando também os nomes
    if (p1 < p2) { aux = p1; p1 = p2; p2 = aux; auxn = n1; n1 = n2; n2 = auxn }
    if (p1 < p3) { aux = p1; p1 = p3; p3 = aux; auxn = n1; n1 = n3; n3 = auxn }
    if (p2 < p3) { aux = p2; p2 = p3; p3 = aux; auxn = n2; n2 = n3; n3 = auxn }

    println("VENCEDOR: $n1 $p1 pontos")
    println("SEGUNDO COLOCADO: $n2 $p2 pontos")
    println("TERCEIRO COLOCADO: $n3 $p3 pontos")

}
