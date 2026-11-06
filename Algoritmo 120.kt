fun main(){

//algoritmo 120   [Lista 2 - Estrutura do Se]
//Entrar com três números e armazená-los em três variáveis com os seguintes nomes: maior,
//intermediário e menor (suponha números diferentes).
//Solução nº 1: ses aninhados. Solução nº 2: troca de valores (ordena a, b e c e depois
//atribui).

    print("Digite o 1º número: ")
    val a = readln().toDouble()
    print("Digite o 2º número: ")
    val b = readln().toDouble()
    print("Digite o 3º número: ")
    val c = readln().toDouble()

    // Solução 1 (ses aninhados)
    var maior = 0.0
    var intermediario = 0.0
    var menor = 0.0
    if (a > b) {
        if (c > a) {
            maior = c
            intermediario = a
            menor = b
        } else {
            if (c > b) {
                maior = a
                intermediario = c
                menor = b
            } else {
                maior = a
                intermediario = b
                menor = c
            }
        }
    } else {
        if (c > b) {
            maior = c
            intermediario = b
            menor = a
        } else {
            if (c > a) {
                maior = b
                intermediario = c
                menor = a
            } else {
                maior = b
                intermediario = a
                menor = c
            }
        }
    }
    println("maior: $maior")
    println("intermediário: $intermediario")
    println("menor: $menor")

    // Solução 2 (trocando os valores)
    var x = a
    var y = b
    var z = c
    var aux = 0.0
    if (x > y) {
        aux = x
        x = y
        y = aux
    }
    if (x > z) {
        aux = x
        x = z
        z = aux
    }
    if (y > z) {
        aux = y
        y = z
        z = aux
    }
    maior = z
    intermediario = y
    menor = x
    println("maior: $maior")
    println("intermediário: $intermediario")
    println("menor: $menor")

}
