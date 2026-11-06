fun main(){

//algoritmo 23   [Capítulo 2 - exemplos do texto (sem enunciado formal)]
//Entrar com um número inteiro de 3 casas e imprimir o algarismo da casa das dezenas.

    print("Digite número de três casas: ")
    val a = readln().toInt()
    val d = a % 100 / 10
    println("algarismo da casa das dezenas: $d")

}
