fun main(){

//algoritmo 50   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com a base e a altura de um retângulo e imprimir a seguinte saída:
//perimetro:
//area:
//diagonal:

    print("Digite a base: ")
    val base = readln().toDouble()
    print("Digite a altura: ")
    val altura = readln().toDouble()
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = Math.sqrt(base * base + altura * altura)
    println("perimetro: $perimetro")
    println("area: $area")
    println("diagonal: $diagonal")

}
