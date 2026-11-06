fun main(){

//algoritmo 66   [Lista 1 - Leia, imprima, atribuição e funções]
//Efetuar o cálculo da quantidade de litros de combustível gastos em uma viagem, sabendo-se
//que o carro faz 12 km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a
//velocidade média.
//Utilizar as seguintes fórmulas: distância = tempo x velocidade.
//litros usados = distância / 12.
//O algoritmo deverá apresentar os valores da velocidade média, tempo gasto na viagem,
//distância percorrida e a quantidade de litros utilizados na viagem.

    print("Digite o tempo gasto (horas): ")
    val tempo = readln().toDouble()
    print("Digite a velocidade média: ")
    val velocidade = readln().toDouble()
    val distancia = tempo * velocidade
    val litros = distancia / 12
    println("velocidade média: $velocidade")
    println("tempo gasto: $tempo")
    println("distância percorrida: $distancia")
    println("litros usados: $litros")

}
