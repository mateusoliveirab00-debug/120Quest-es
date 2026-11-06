fun main(){

//algoritmo 51   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com o raio de um círculo e imprimir a seguinte saída:
//perimetro:
//area:

    print("Digite o raio: ")
    val raio = readln().toDouble()
    val perimetro = 2 * Math.PI * raio
    val area = Math.PI * raio * raio
    println("perimetro: $perimetro")
    println("area: $area")

}
