fun main(){

//algoritmo 142   [Lista 2 - Estrutura do Se]
//Em um campeonato nacional de arco-e-flecha, tem-se equipes de três jogadores para cada
//estado. Sabendo-se que os arqueiros de uma equipe não obtiveram o mesmo número de pontos,
//criar um algoritmo que informe se uma equipe foi classificada, de acordo com a seguinte
//especificação:
//• ler os pontos obtidos por cada jogador da equipe;
//• mostrar esses valores em ordem decrescente;
//• se a soma dos pontos for maior do que 100, imprimir a média aritmética entre eles; senão,
//imprimir a mensagem "Equipe desclassificada".
//Obs.: o código do livro mostra os valores em ordem crescente; aqui seguimos o enunciado
//(decrescente).

    print("Digite os pontos do primeiro jogador: ")
    val j1 = readln().toInt()
    print("Digite os pontos do segundo jogador: ")
    val j2 = readln().toInt()
    print("Digite os pontos do terceiro jogador: ")
    val j3 = readln().toInt()
    var p1 = j1
    var p2 = j2
    var p3 = j3
    var aux: Int

    if (p1 < p2) { aux = p1; p1 = p2; p2 = aux }
    if (p1 < p3) { aux = p1; p1 = p3; p3 = aux }
    if (p2 < p3) { aux = p2; p2 = p3; p3 = aux }
    println("p1=$p1  p2=$p2  p3=$p3")

    val soma = p1 + p2 + p3
    if (soma > 100) {
        println("Média= ${"%.2f".format(soma / 3.0)}")
    } else {
        println("Equipe desclassificada!")
    }

}
