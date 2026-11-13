fun main(){

//algoritmo 149   [Lista 2 - Estrutura do Se]
//Um comerciante calcula o valor da venda, tendo em vista a tabela a seguir:
//VALOR DA COMPRA - VALOR DA VENDA
//Valor < R$ 10,00 - lucro de 70%
//R$ 10,00 <= valor < R$ 30,00 - lucro de 50%
//R$ 30,00 <= valor < R$ 50,00 - lucro de 40%
//Valor >= R$ 50,00 - lucro de 30%
//Criar o algoritmo que possa entrar com nome do produto e valor da compra e imprimir o nome
//do produto e o valor da venda.

    print("digite o nome do produto: ")
    val nomeP = readln()
    print("digite o valor da compra: ")
    val vCompra = readln().replace(",", ".").toDouble()
    val vVenda: Double
    if (vCompra < 10) {
        vVenda = vCompra * 1.7
    } else {
        if (vCompra < 30) {
            vVenda = vCompra * 1.5
        } else {
            if (vCompra < 50) {
                vVenda = vCompra * 1.4
            } else {
                vVenda = vCompra * 1.3
            }
        }
    }
    println("$nomeP será vendido por R\$ ${"%.2f".format(vVenda)}")

}
