fun main(){

//algoritmo 20   [Capítulo 2 - exemplos do texto (sem enunciado formal)]
//Exemplo do livro: testar a maioria das funções de string (tamanho, concatenação, cópia,
//primeiro, último, resto, elemento da posição e primeiros/últimos elementos) com duas
//palavras digitadas.

    print("digite palavra 1: ")
    val c = readln()
    print("digite palavra 2: ")
    val c1 = readln()

    val d = c
    val d1 = c + c1

    println("tamanho da 1a palavra: ${c.length}")
    println("concatenando sem armazenar: ${c + c1}")
    println("o conteudo de d: $d")
    println("concatenacao com armazenamento: $d1")
    println("primeiro caractere: ${c[0]}")
    println("ultimo caractere: ${c[c.length - 1]}")
    println("todos menos o primeiro: ${c.substring(1)}")
    println("o elemento da posicao 3: ${c[3]}")
    println("os tres primeiros elementos: ${c.substring(0, 3)}")
    println("os elementos apos os tres primeiros: ${c.substring(3)}")
    println("os tres ultimos elementos: ${c.substring(c.length - 3)}")

}
