fun main(){

//algoritmo 79   [Lista 1 - Leia, imprima, atribuição e funções]
//Uma pessoa resolveu fazer uma aplicação em uma poupança programada. Para calcular seu
//rendimento, ela deverá fornecer o valor constante da aplicação mensal, a taxa e o número de
//meses. Sabendo-se que a fórmula usada para este cálculo é:
//valor acumulado = P * ((1 + i)^n - 1) / i
//onde: i = taxa, P = aplicação mensal, n = número de meses

    print("Digite o valor da aplicação mensal: ")
    val p = readln().toDouble()
    print("Digite a taxa (exemplo 0.01): ")
    val i = readln().toDouble()
    print("Digite o número de meses: ")
    val n = readln().toDouble()
    val acumulado = p * (Math.pow(1 + i, n) - 1) / i
    println("valor acumulado: $acumulado")

}
