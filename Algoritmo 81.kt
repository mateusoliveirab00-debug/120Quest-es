fun main(){

//algoritmo 81   [Lista 1 - Leia, imprima, atribuição e funções]
//Criar um algoritmo que, dado um número de conta corrente com três dígitos, retorne o seu
//dígito verificador, o qual é calculado da seguinte maneira:
//Exemplo: número da conta: 235
//• Somar o número da conta com o seu inverso: 235 + 532 = 767
//• multiplicar cada dígito pela sua ordem posicional e somar estes resultados: 7 6 7 -> 7x1 +
//6x2 + 7x3 = 7 + 12 + 21 = 40
//• o último dígito desse resultado é o dígito verificador da conta (40 -> 0).

    print("Digite a conta com 3 dígitos: ")
    val conta = readln().toInt()

    val d1 = conta / 100
    val d2 = conta % 100 / 10
    val d3 = conta % 10
    val inverso = d3 * 100 + d2 * 10 + d1
    val soma = conta + inverso

    val s1 = soma / 100
    val s2 = soma % 100 / 10
    val s3 = soma % 10
    val total = s1 * 1 + s2 * 2 + s3 * 3
    val digito = total % 10
    println("dígito verificador: $digito")

}
