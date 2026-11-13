fun main(){

//algoritmo 126   [Lista 2 - Estrutura do Se]
//Ler um número e imprimir se ele é igual a 5, a 200, a 400, se está no intervalo entre 500 e
//1000, inclusive, ou se ele está fora dos escopos anteriores.

    print("digite o valor de X: ")
    val x = readln().replace(",", ".").toDouble()
    if (x == 5.0) {
        println("O número é o 5")
    } else {
        if (x == 200.0) {
            println("O número é o 200")
        } else {
            if (x == 400.0) {
                println("O número é o 400")
            } else {
                if (x >= 500.0 && x <= 1000.0) {
                    println("Intervalo 500-1000")
                } else {
                    println("Fora do escopo")
                }
            }
        }
    }

}
