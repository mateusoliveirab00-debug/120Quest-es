fun main(){

//algoritmo 8   [Capítulo 1 - Conceitos iniciais]
//Algoritmo para jogar o jogo da forca:
//1 - escolher a palavra;
//2 - montar o diagrama do jogo;
//3 - enquanto ((houver lacunas vazias) e (corpo incompleto))faça
//    se (acertar uma letra)
//    escrever na lacuna correspondente;
//    senão
//    desenhar uma parte do corpo na forca;

    println("Jogador 1, digite a palavra:")
    val palavra = readln()

    // monta as lacunas com _
    var lacunas = ""
    for (i in 0 until palavra.length) {
        lacunas = lacunas + "_"
    }

    var erros = 0

    while (lacunas.contains("_") && erros < 6) {
        println(lacunas)
        println("Jogador 2, digite uma letra:")
        val letra = readln()

        if (palavra.contains(letra)) {
            // escreve a letra na lacuna certa
            var novo = ""
            for (i in 0 until palavra.length) {
                if (palavra[i].toString() == letra) {
                    novo = novo + letra
                } else {
                    novo = novo + lacunas[i]
                }
            }
            lacunas = novo
        } else {
            erros = erros + 1
            println("Errou! Desenha uma parte do corpo ($erros)")
        }
    }

    if (lacunas.contains("_")) {
        println("Você perdeu! A palavra era $palavra")
    } else {
        println("Você ganhou! A palavra era $palavra")
    }

}
