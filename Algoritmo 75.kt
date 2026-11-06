fun main(){

//algoritmo 75   [Lista 1 - Leia, imprima, atribuição e funções]
//Criar um algoritmo que leia o peso de uma pessoa, só a parte inteira, calcular e imprimir:
//• o peso da pessoa em gramas
//• novo peso, em gramas, se a pessoa engordar 12%

    print("Digite o peso (só a parte inteira): ")
    val peso = readln().toInt()
    val gramas = peso * 1000
    val novoPeso = gramas * 1.12
    println("peso em gramas: $gramas")
    println("novo peso em gramas: $novoPeso")

}
