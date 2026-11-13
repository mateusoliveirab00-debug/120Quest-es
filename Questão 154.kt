fun main(){

//algoritmo 154   [Lista 2 - Estrutura do Se]
//A polícia rodoviária resolveu fazer cumprir a lei e cobrar dos motoristas o DUT. Sabendo-se
//que o mês em que o emplacamento do carro deve ser renovado é determinado pelo último número
//da placa do mesmo, criar um algoritmo que, a partir da leitura da placa do carro, informe o
//mês em que o emplacamento deve ser renovado.
//Obs.: ler a placa do carro em uma variável caractere (string).

    print("digite a placa: ")
    val placa = readln()
    val p = placa.takeLast(1)       // último caractere (strult)
    when (p) {
        "1" -> println("janeiro")
        "2" -> println("fevereiro")
        "3" -> println("março")
        "4" -> println("abril")
        "5" -> println("maio")
        "6" -> println("junho")
        "7" -> println("julho")
        "8" -> println("agosto")
        "9" -> println("setembro")
        "0" -> println("outubro")
        else -> println("opção inválida")
    }

}
