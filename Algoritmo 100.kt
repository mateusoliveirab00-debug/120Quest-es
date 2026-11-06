fun main(){

//algoritmo 100   [Lista 2 - Estrutura do Se]
//Ler um número inteiro de 4 casas e imprimir se é ou não múltiplo de quatro o número formado
//pelos algarismos que estão nas casas das unidades de milhar e das centenas.

    print("Digite um número de 4 algarismos: ")
    val num = readln().toInt()
    val n = num / 100
    if (n % 4 == 0) {
        println("$n é múltiplo de 4")
    } else {
        println("$n não é múltiplo de 4")
    }

}
