fun main(){

//algoritmo 129   [Lista 2 - Estrutura do Se]
//Entrar com o salário de uma pessoa e imprimir o desconto do INSS segundo a tabela a seguir:
//menor ou igual a R$ 600,00 - isento
//maior que R$ 600,00 e menor ou igual a R$ 1200,00 - 20%
//maior que R$ 1200,00 e menor ou igual a R$ 2000,00 - 25%
//maior que R$ 2000,00 - 30%

    print("digite o salário: ")
    val salario = readln().replace(",", ".").toDouble()
    val desconto: Double
    if (salario <= 600) {
        desconto = 0.0
    } else {
        if (salario <= 1200) {
            desconto = salario * 0.2
        } else {
            if (salario <= 2000) {
                desconto = salario * 0.25
            } else {
                desconto = salario * 0.30
            }
        }
    }
    println("desconto: $desconto")

}
