fun main(){

//algoritmo 160   [Lista 2 - Estrutura do Se]
//Entrar com o valor de x e imprimir y:
//y = f(x) =
//    1,  se x <= 1
//    2,  se 1 < x <= 2
//    x², se 2 < x <= 3
//    x³, se x > 3

    print("digite o valor de x: ")
    val x = readln().replace(",", ".").toDouble()
    val y: Double
    if (x <= 1) {
        y = 1.0
    } else {
        if (x <= 2) {
            y = 2.0
        } else {
            if (x <= 3) {
                y = x * x
            } else {
                y = x * x * x
            }
        }
    }
    println("valor de f(x): $y")

}
