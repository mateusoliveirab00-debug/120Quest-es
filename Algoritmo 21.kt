fun main(){

//algoritmo 21   [Capítulo 2 - exemplos do texto (sem enunciado formal)]
//Exemplo do livro: testar a hierarquia (precedência) dos operadores: + - * / % div ** . No
//Kotlin, * / % têm a mesma precedência (da esquerda para a direita), diferente do livro, onde
//% vinha antes de *.

    println("TESTANDO HIERARQUIA")
    println("12 + 5 / 2 é igual a: ${12 + 5 / 2.0}")
    println("(12 + 5) / 2 é igual a: ${(12 + 5) / 2.0}")
    println("64**1/4 é igual a: ${Math.pow(64.0, 1.0) / 4}")
    println("64**(1/4) é igual a: ${Math.pow(64.0, 1.0 / 4)}")
    println("3 * (7 % 5) é igual a: ${3 * (7 % 5)}")
    println("(3 * 7) % 5 é igual a: ${(3 * 7) % 5}")
    println("3 * 7 div 5 é igual a: ${3 * 7 / 5}")
    println("(3 * 7) div 5 é igual a: ${(3 * 7) / 5}")

}
