import kotlin.math.*

fun main(){

//algoritmo 137   [Lista 2 - Estrutura do Se]
//Ler três valores inteiros (variáveis a, b e c) e efetuar o cálculo da equação de segundo
//grau, apresentando: as duas raízes, se para os valores informados for possível fazer o
//cálculo (delta positivo ou zero); a mensagem "Não há raízes reais", se não for possível
//fazer o cálculo (delta negativo); e a mensagem "Não é equação do segundo grau", se o valor
//de a for igual a zero.

    print("Entre com o valor de a: ")
    val a = readln().replace(",", ".").toDouble()
    print("Entre com o valor de b: ")
    val b = readln().replace(",", ".").toDouble()
    print("Entre com o valor de c: ")
    val c = readln().replace(",", ".").toDouble()
    if (a == 0.0) {
        println("Não é equação do 2º grau")
    } else {
        val delta = b * b - 4 * a * c
        if (delta >= 0) {
            val raizDelta = sqrt(delta)
            val x1 = (-b + raizDelta) / (2 * a)
            val x2 = (-b - raizDelta) / (2 * a)
            println("X1= $x1\t\tX2= $x2")
        } else {
            println("Não há raízes reais")
        }
    }

}
