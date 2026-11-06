fun main(){

//algoritmo 40   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com dois números inteiros e imprimir a seguinte saída:
//dividendo:
//divisor:
//quociente:
//resto:

    print("Digite o dividendo: ")
    val dividendo = readln().toInt()
    print("Digite o divisor: ")
    val divisor = readln().toInt()
    val quociente = dividendo / divisor
    val resto = dividendo % divisor
    println("dividendo: $dividendo")
    println("divisor: $divisor")
    println("quociente: $quociente")
    println("resto: $resto")

}
