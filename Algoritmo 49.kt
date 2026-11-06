fun main(){

//algoritmo 49   [Lista 1 - Leia, imprima, atribuição e funções]
//Entrar com um nome e imprimir:
//todo nome:
//primeiro caractere:
//ultimo caractere:
//do primeiro ate o terceiro:
//quarto caractere:
//todos menos o primeiro:
//os dois ultimos:

    print("Digite o nome: ")
    val nome = readln()
    println("todo nome: $nome")
    println("primeiro caractere: ${nome[0]}")
    println("ultimo caractere: ${nome[nome.length - 1]}")
    println("do primeiro ate o terceiro: ${nome.substring(0, 3)}")
    println("quarto caractere: ${nome[3]}")
    println("todos menos o primeiro: ${nome.substring(1)}")
    println("os dois ultimos: ${nome.substring(nome.length - 2)}")

}
