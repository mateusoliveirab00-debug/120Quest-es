fun main(){

//algoritmo 157   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que leia uma data (no formato ddmmaaaa) e imprimir se a data é válida ou
//não.

    print("data no formato ddmmaaaa: ")
    val data = readln().toInt()
    val dia = data / 1000000
    val mes = data % 1000000 / 10000
    val ano = data % 10000

    var valida = true
    if (ano < 1) {
        valida = false
    }
    if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
        valida = false
    } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
        valida = false
    } else if (mes == 2) {
        val bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0
        if (bissexto) {
            if (dia > 29) { valida = false }
        } else {
            if (dia > 28) { valida = false }
        }
    }

    if (valida) {
        println("DATA VÁLIDA")
    } else {
        println("DATA INVÁLIDA")
    }

}
