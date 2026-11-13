fun main(){

//algoritmo 127   [Lista 2 - Estrutura do Se]
//Entrar com nome, nota da PR1 e nota da PR2 de um aluno. Imprimir nome, nota da PR1, nota da
//PR2, média e uma das mensagens: Aprovado, Reprovado ou em Prova Final (a média é 7 para
//aprovação, menor que 3 para reprovação e as demais em prova final).

    print("digite o nome: ")
    val nome = readln()
    print("digite a 1ª nota: ")
    val nota1 = readln().replace(",", ".").toDouble()
    print("digite a 2ª nota: ")
    val nota2 = readln().replace(",", ".").toDouble()
    val media = (nota1 + nota2) / 2
    println("$nome - PR1: $nota1 - PR2: $nota2 - média: $media")
    if (media >= 7) {
        println("Aprovado")
    } else {
        if (media < 3) {
            println("Reprovado")
        } else {
            println("em Prova Final")
        }
    }

}
