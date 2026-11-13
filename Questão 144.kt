fun main(){

//algoritmo 144   [Lista 2 - Estrutura do Se]
//O banco XXX concederá um crédito especial com juros de 2% aos seus clientes de acordo com o
//saldo médio no último ano. Fazer um algoritmo que leia o saldo médio de um cliente e calcule
//o valor do crédito de acordo com a tabela a seguir. Imprimir uma mensagem informando o saldo
//médio e o valor do crédito.
//SALDO MÉDIO - PERCENTUAL
//de 0 a 500 - nenhum crédito
//de 501 a 1000 - 30% do valor do saldo médio
//de 1001 a 3000 - 40% do valor do saldo médio
//acima de 3001 - 50% do valor do saldo médio
//Obs.: a solução do livro calcula só o crédito pela tabela e não usa os juros de 2%.

    print("digite o saldo médio: ")
    val saldoMedio = readln().replace(",", ".").toDouble()
    val credito: Double
    if (saldoMedio < 501) {
        credito = 0.0
    } else {
        if (saldoMedio < 1001) {
            credito = saldoMedio * 0.3
        } else {
            if (saldoMedio < 3001) {
                credito = saldoMedio * 0.4
            } else {
                credito = saldoMedio * 0.5
            }
        }
    }
    if (credito != 0.0) {
        println("Como seu saldo era de: $saldoMedio seu crédito será de: $credito")
    } else {
        println("Como seu saldo era de: $saldoMedio você não terá nenhum crédito")
    }

}
