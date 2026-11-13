fun main(){

//algoritmo 156   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que leia uma data (dia, mês e ano em separado) e imprima se a data é
//válida ou não.

    print("digite o dia: ")
    val dia = readln().toInt()
    print("digite o mês: ")
    val mes = readln().toInt()
    print("digite o ano: ")
    val ano = readln().toInt()

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
