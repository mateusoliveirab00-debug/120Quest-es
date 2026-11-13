fun main(){

//algoritmo 136   [Lista 2 - Estrutura do Se]
//Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas
//começaram a fazer pesquisas para descobrir um bom plano, não muito caro. Um vendedor de um
//plano de saúde apresentou a tabela a seguir. Criar um algoritmo que entre com o nome e a
//idade de uma pessoa e imprimir o nome e o valor que ela deverá pagar.
//• até 10 anos - R$ 30,00
//• acima de 10 até 29 anos - R$ 60,00
//• acima de 29 até 45 anos - R$ 120,00
//• acima de 45 até 59 anos - R$ 150,00
//• acima de 59 até 65 anos - R$ 250,00
//• maior que 65 anos - R$ 400,00

    print("Entre com o nome: ")
    val nome = readln()
    print("Entre com a idade: ")
    val idade = readln().toInt()
    if (idade <= 10) {
        println("$nome pagará R\$ 30,00")
    } else {
        if (idade <= 29) {
            println("$nome pagará R\$ 60,00")
        } else {
            if (idade <= 45) {
                println("$nome pagará R\$ 120,00")
            } else {
                if (idade <= 59) {
                    println("$nome pagará R\$ 150,00")
                } else {
                    if (idade <= 65) {
                        println("$nome pagará R\$ 250,00")
                    } else {
                        println("$nome pagará R\$ 400,00")
                    }
                }
            }
        }
    }

}
