fun main(){

//algoritmo 47   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com um número no formato CDU e imprimir invertido: UDC. (Exemplo: 123, sairá 321.) O
//número deverá ser armazenado em outra variável antes de ser impresso.

    print("Digite um número de 3 dígitos: ")
    val num = readln().toInt()
    val c = num / 100
    val d = num % 100 / 10
    val u = num % 10
    val num1 = u * 100 + d * 10 + c
    println("número: $num")
    println("invertido: $num1")

}
