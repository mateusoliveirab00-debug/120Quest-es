fun main(){

//algoritmo 133   [Lista 2 - Estrutura do Se]
//Segundo uma tabela médica, o peso ideal está relacionado com a altura e o sexo. Fazer um
//algoritmo que receba a altura e o sexo de uma pessoa, calcular e imprimir o seu peso ideal,
//utilizando as seguintes fórmulas:
//• para homens: (72.7 * H) - 58
//• para mulheres: (62.1 * H) - 44.7

    print("entre com a altura (m): ")
    val h = readln().replace(",", ".").toDouble()
    print("entre com o sexo M / F: ")
    val sexo = readln()
    val peso: Double
    if (sexo == "M" || sexo == "m") {
        peso = 72.7 * h - 58
    } else {
        peso = 62.1 * h - 44.7
    }
    println("seu peso ideal: $peso")

}
