fun main(){

//algoritmo 139   [Lista 2 - Estrutura do Se]
//Sabendo que somente os municípios que possuem mais de 20.000 eleitores aptos têm segundo
//turno nas eleições para prefeito caso o primeiro colocado não tenha mais do que 50% dos
//votos, fazer um algoritmo que leia o nome do município, a quantidade de eleitores aptos, o
//número de votos do candidato mais votado e informar se ele terá ou não segundo turno em sua
//eleição municipal.
//Obs.: a solução do livro compara os votos com a metade dos eleitores aptos.

    print("Digite o nome do município: ")
    val nome = readln()
    print("número de eleitores aptos: ")
    val ne = readln().toInt()
    print("número de votos do candidato mais votado: ")
    val votos = readln().toInt()
    if (ne > 20000 && votos <= ne / 2.0) {
        println("$nome terá segundo turno")
    } else {
        println("$nome não terá segundo turno")
    }

}
