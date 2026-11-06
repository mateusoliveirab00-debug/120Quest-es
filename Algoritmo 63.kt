fun main(){

//algoritmo 63   [Lista 1 - Leia, imprima, atribuição e funções]
//Criar um algoritmo que efetue o cálculo do salário líquido de um professor. Os dados
//fornecidos serão: valor da hora aula, número de aulas dadas no mês e percentual de desconto
//do INSS.

    print("Digite o valor da hora aula: ")
    val valorHora = readln().toDouble()
    print("Digite o número de aulas dadas: ")
    val aulas = readln().toInt()
    print("Digite o percentual de desconto do INSS: ")
    val inss = readln().toDouble()
    val bruto = valorHora * aulas
    val desconto = bruto * inss / 100
    val liquido = bruto - desconto
    println("salário líquido: $liquido")

}
