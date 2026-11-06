fun main(){

//algoritmo 80   [Lista 1 - Leia, imprima, atribuição e funções]
//Criar um algoritmo que leia a quantidade de fitas que uma locadora de vídeo possui e o valor
//que ela cobra por cada aluguel, mostrando as informações pedidas a seguir:
//• Sabendo que um terço das fitas são alugadas por mês, exiba o faturamento anual da
//locadora;
//• Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor do aluguel.
//Sabendo que um décimo das fitas alugadas no mês são devolvidas com atraso, calcule o valor
//ganho com multas por mês;
//• Sabendo ainda que 2% de fitas se estragam ao longo do ano, e um décimo do total é comprado
//para reposição, exiba a quantidade de fitas que a locadora terá no final do ano.

    print("Digite a quantidade de fitas: ")
    val fitas = readln().toInt()
    print("Digite o valor do aluguel: ")
    val aluguel = readln().toDouble()

    // um terço das fitas é alugado por mês
    val alugadas = fitas / 3.0
    val faturamento = alugadas * aluguel * 12
    println("faturamento anual: $faturamento")

    // um décimo das alugadas volta com atraso, multa de 10%
    val atrasadas = alugadas / 10
    val multas = atrasadas * aluguel * 0.10
    println("multas por mês: $multas")

    // 2% estragam e um décimo do total é comprado
    val fitasFinal = fitas - fitas * 0.02 + fitas / 10.0
    println("fitas no final do ano: $fitasFinal")

}
