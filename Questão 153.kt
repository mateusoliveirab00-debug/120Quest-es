fun main(){

//algoritmo 153   [Lista 2 - Estrutura do Se]
//O prefeito do Rio de Janeiro contratou uma firma especializada para manter os níveis de
//poluição considerados ideais para um país do 1º mundo. As indústrias, maiores responsáveis
//pela poluição, foram classificadas em três grupos. Sabendo-se que a escala utilizada varia
//de 0,05 e que o índice de poluição aceitável é até 0,25, fazer um algoritmo que possa
//imprimir intimações de acordo com o índice e a tabela a seguir:
//índice - indústrias que receberão intimação
//0,3 - 1º grupo
//0,4 - 1º e 2º grupos
//0,5 - 1º, 2º e 3º grupos

    print("digite o índice de poluição: ")
    val indice = readln().replace(",", ".").toDouble()
    if (indice >= 0.5) {
        println("suspender atividades das indústrias dos grupos 1, 2 e 3")
    } else {
        if (indice >= 0.4) {
            println("suspender atividades das indústrias dos grupos 1 e 2")
        } else {
            if (indice >= 0.3) {
                println("suspender atividades das indústrias do grupo 1")
            } else {
                println("índice de poluição aceitável para todos os grupos")
            }
        }
    }

}
