fun main(){

//algoritmo 148   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que leia o destino do passageiro, se a viagem inclui retorno (ida e
//volta) e informar o preço da passagem conforme a tabela a seguir.
//DESTINO - IDA - IDA E VOLTA
//Região Norte - R$ 500,00 - R$ 900,00
//Região Nordeste - R$ 350,00 - R$ 650,00
//Região Centro-Oeste - R$ 350,00 - R$ 600,00
//Região Sul - R$ 300,00 - R$ 550,00
//Obs.: o código do livro imprime R$ 950,00 para ida e volta ao Norte; aqui seguimos a tabela
//(R$ 900,00).

    val regioes = listOf("Região Norte", "Região Nordeste", "Região Centro-Oeste", "Região Sul")
    val idas = intArrayOf(500, 350, 350, 300)
    val idasEVoltas = intArrayOf(900, 650, 600, 550)

    print("Digite 1- Região Norte 2- Região Nordeste 3- Região Centro-Oeste 4- Região Sul: ")
    val op = readln().toInt()
    print("Digite 1- Ida 2- Ida e Volta: ")
    val iv = readln().toInt()

    if (op !in 1..4 || iv !in 1..2) {
        println("Opção inexistente")
    } else {
        val valor = if (iv == 1) idas[op - 1] else idasEVoltas[op - 1]
        val tipo = if (iv == 1) "ida" else "ida e volta"
        println("O valor da passagem de $tipo para a ${regioes[op - 1]} é R\$ $valor,00")
    }

}
