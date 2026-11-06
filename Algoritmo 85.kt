fun main(){

//algoritmo 85   [Capítulo 3 - exemplos do texto]
//Exemplo clássico de ses aninhados: ler três números e armazenar na variável max o maior
//entre os três, imprimindo-o. (No livro: "Você descobriu o que faz esse algoritmo?")

    print("Digite o 1º número: ")
    val a = readln().toDouble()
    print("Digite o 2º número: ")
    val b = readln().toDouble()
    print("Digite o 3º número: ")
    val c = readln().toDouble()

    var max = 0.0
    if (a > b) {
        if (a > c) {
            max = a
        } else {
            max = c
        }
    } else {
        if (b > c) {
            max = b
        } else {
            max = c
        }
    }
    println(max)

}
