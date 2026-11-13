fun main(){

//algoritmo 147   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que informe a quantidade total de calorias de uma refeição a partir da
//escolha do usuário que deverá informar o prato, a sobremesa e bebida (veja a tabela a
//seguir).
//PRATO: Vegetariano 180cal - Peixe 230cal - Frango 250cal - Carne 350cal
//SOBREMESA: Abacaxi 75cal - Sorvete diet 110cal - Mousse diet 170cal - Mousse chocolate
//200cal
//BEBIDA: Chá 20cal - Suco de laranja 70cal - Suco de melão 100cal - Refrigerante diet 65cal
//Obs.: os menus do código do livro aparecem trocados; aqui seguem a tabela.

    var calorias = 0

    println("Prato: 1- Vegetariano 2- Peixe 3- Frango 4- Carne")
    print("Digite o prato: ")
    val prato = readln().toInt()
    when (prato) {
        1 -> calorias += 180
        2 -> calorias += 230
        3 -> calorias += 250
        4 -> calorias += 350
        else -> println("prato inválido (nenhuma caloria somada)")
    }

    println("Sobremesa: 1- Abacaxi 2- Sorvete diet 3- Mousse diet 4- Mousse de chocolate")
    print("Digite a sobremesa: ")
    val sobremesa = readln().toInt()
    when (sobremesa) {
        1 -> calorias += 75
        2 -> calorias += 110
        3 -> calorias += 170
        4 -> calorias += 200
        else -> println("sobremesa inválida (nenhuma caloria somada)")
    }

    println("Bebida: 1- Chá 2- Suco de laranja 3- Suco de melão 4- Refrigerante diet")
    print("Digite a bebida: ")
    val bebida = readln().toInt()
    when (bebida) {
        1 -> calorias += 20
        2 -> calorias += 70
        3 -> calorias += 100
        4 -> calorias += 65
        else -> println("bebida inválida (nenhuma caloria somada)")
    }

    println("Total de calorias: $calorias")

}
