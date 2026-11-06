fun main(){

//algoritmo 24   [Capítulo 2 - exemplos do texto (sem enunciado formal)]
//Exemplo do livro: entrar com um número de 3 casas e imprimir o algarismo das dezenas, agora
//com div antes de %. No livro, d <- a div 10 % 10 dava erro (o % era feito primeiro); a
//solução foi usar parênteses: d <- (a div 10) % 10.

    print("Digite número de três casas: ")
    val a = readln().toInt()
    val d = (a / 10) % 10
    println("algarismo da casa das dezenas: $d")

}
