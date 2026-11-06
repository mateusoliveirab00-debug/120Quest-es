fun main(){

//algoritmo 52   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com o lado de um quadrado e imprimir:
//perimetro:
//area:
//diagonal:

    print("Digite o lado: ")
    val lado = readln().toDouble()
    val perimetro = 4 * lado
    val area = lado * lado
    val diagonal = lado * Math.sqrt(2.0)
    println("perimetro: $perimetro")
    println("area: $area")
    println("diagonal: $diagonal")

}
