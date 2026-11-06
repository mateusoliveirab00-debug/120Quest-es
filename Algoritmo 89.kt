fun main(){

//algoritmo 89   [Capítulo 3 - exemplos do texto]
//Alternativa de múltipla escolha (escolha/caso). Escrever um algoritmo que leia um peso na
//Terra e o número de um planeta e imprima o valor do seu peso neste planeta. A relação de
//planetas é dada a seguir juntamente com o valor das gravidades relativas à Terra:
//# gravidade relativa - Planeta
//1 - 0,37 - Mercúrio
//2 - 0,88 - Vênus
//3 - 0,38 - Marte
//4 - 2,64 - Júpiter
//5 - 1,15 - Saturno
//6 - 1,17 - Urano
//Para calcular o peso no planeta use a fórmula: Pplaneta = (Pterra / 10) * gravidade

    println("planetas que podem ser analisados:")
    println("1 mercúrio")
    println("2 vênus")
    println("3 marte")
    println("4 júpiter")
    println("5 saturno")
    println("6 urano")
    print("escolha o planeta: ")
    val op = readln().toInt()
    print("digite o peso na terra: ")
    val pterra = readln().toDouble()

    when (op) {
        1 -> println("peso no planeta: ${(pterra / 10) * 0.37}")
        2 -> println("peso no planeta: ${(pterra / 10) * 0.88}")
        3 -> println("peso no planeta: ${(pterra / 10) * 0.38}")
        4 -> println("peso no planeta: ${(pterra / 10) * 2.64}")
        5 -> println("peso no planeta: ${(pterra / 10) * 1.15}")
        6 -> println("peso no planeta: ${(pterra / 10) * 1.17}")
        else -> println("este planeta não pode ser analisado")
    }

}
