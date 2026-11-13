fun main(){

//algoritmo 145   [Lista 2 - Estrutura do Se]
//A biblioteca de uma universidade deseja fazer um algoritmo que leia o nome do livro que será
//emprestado, o tipo de usuário (professor ou aluno) e possa imprimir um recibo conforme
//mostrado a seguir. Considerar que o professor tem dez dias para devolver o livro e o aluno
//só três dias.
//Nome do livro:
//Tipo de usuário:
//Total de dias:

    print("digite o nome do livro: ")
    val livro = readln()
    print("digite professor / aluno: ")
    val tipo = readln()
    val t = tipo.lowercase()
    val dias = if (t == "professor") 10 else if (t == "aluno") 3 else 0

    if (dias == 0) {
        println("Tipo de usuário desconhecido")
    } else {
        println("Nome do livro: $livro")
        println("Tipo de usuário: $tipo")
        println("Total de dias: $dias")
    }

}
