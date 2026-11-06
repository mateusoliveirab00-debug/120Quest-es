fun main(){

//algoritmo 73   [Lista 1 - Leia, imprima, atribuição e funções]
//Criar um algoritmo que receba um número real, calcular e imprimir:
//• a parte inteira do número
//• a parte fracionária do número
//• o número arredondado

    print("Digite um número real: ")
    val num = readln().toDouble()
    val inteira = num.toInt()
    val fracionaria = num - inteira
    val arredondado = Math.round(num)
    println("parte inteira: $inteira")
    println("parte fracionária: $fracionaria")
    println("arredondado: $arredondado")

}
