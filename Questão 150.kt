import kotlin.math.*

fun main(){

//algoritmo 150   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que leia um ângulo em graus e apresente:
//• o seno do ângulo, se o ângulo pertencer a um quadrante par;
//• o co-seno do ângulo, se o ângulo pertencer a um quadrante ímpar.
//Obs.: considera ângulos de 0 a 360 graus (2º quadrante: 90 a 180; 4º quadrante: 270 a 360).

    print("digite o ângulo em graus: ")
    val ang = readln().replace(",", ".").toDouble()
    val rang = ang * PI / 180
    if ((ang > 90 && ang <= 180) || (ang > 270 && ang <= 360)) {
        println("seno: ${sin(rang)}")
    } else {
        println("co-seno: ${cos(rang)}")
    }

}
