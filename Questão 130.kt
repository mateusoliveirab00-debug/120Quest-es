fun main(){

//algoritmo 130   [Lista 2 - Estrutura do Se]
//Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra
//for menor que R$ 20,00; caso contrário, o lucro será de 30%. Entrar com o valor do produto e
//imprimir o valor da venda.

    print("digite o valor do produto: ")
    val valor = readln().replace(",", ".").toDouble()
    if (valor < 20) {
        println("Valor de venda: ${valor * 1.45}")
    } else {
        println("Valor de venda: ${valor * 1.3}")
    }

}
