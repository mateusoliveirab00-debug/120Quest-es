fun main(){

//algoritmo 128   [Lista 2 - Estrutura do Se]
//Entrar com um verbo no infinitivo e imprimir uma das mensagens:
//• verbo não está no infinitivo
//• verbo da 1ª conjugação
//• verbo da 2ª conjugação
//• verbo da 3ª conjugação

    print("digite o verbo: ")
    val verbo = readln()
    val ultima = verbo.takeLast(1).lowercase()

    if (ultima == "r") {
        // a vogal temática é a penúltima letra (posição tamanho - 2)
        val vogal = verbo.getOrNull(verbo.length - 2)?.lowercase() ?: ""
        if (vogal == "a") {
            println("1ª conjugação")
        } else {
            if (vogal == "e" || vogal == "o") {      // o: pôr e derivados (compor, repor...)
                println("2ª conjugação")
            } else {
                if (vogal == "i") {
                    println("3ª conjugação")
                } else {
                    println("não existe verbo com terminação ${vogal}r")
                }
            }
        }
    } else {
        println("não é um verbo no infinitivo")
    }

}
