fun main(){

//algoritmo 132   [Lista 2 - Estrutura do Se]
//Fazer um algoritmo que possa converter uma determinada quantia dada em reais para uma das
//seguintes moedas:
//• f - franco suíço
//• l - libra esterlina
//• d - dólar
//• m - marco alemão

    print("digite o valor em reais a ser convertido: ")
    val r = readln().replace(",", ".").toDouble()
    println("digite f - franco suíço, l - libra esterlina, d - dólar, m - marco alemão")
    print("moeda: ")
    val moeda = readln()
    val m = moeda.lowercase()

    if (m == "f") {
        print("digite o valor de um franco suíço em reais: ")
        val cotacao = readln().replace(",", ".").toDouble()
        println("Total de francos suíços: ${r / cotacao}")
    } else {
        if (m == "l") {
            print("digite o valor de uma libra esterlina em reais: ")
            val cotacao = readln().replace(",", ".").toDouble()
            println("Total de libras esterlinas: ${r / cotacao}")
        } else {
            if (m == "d") {
                print("digite o valor de um dólar em reais: ")
                val cotacao = readln().replace(",", ".").toDouble()
                println("Total de dólares: ${r / cotacao}")
            } else {
                if (m == "m") {
                    print("digite o valor de um marco alemão em reais: ")
                    val cotacao = readln().replace(",", ".").toDouble()
                    println("Total de marcos alemães: ${r / cotacao}")
                } else {
                    println("moeda desconhecida")
                }
            }
        }
    }

}
