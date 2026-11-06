fun main(){

//algoritmo 9   [Capítulo 1 - Conceitos iniciais]
//Algoritmo para jogar o jogo da velha:
//enquanto ((existir um quadrado livre) e (ninguém perdeu(ganhou) o jogo))
//    espere a jogada do adversário, continue depois
//    se (existir um quadrado livre)
//        se (centro livre)
//            jogue no centro
//        senão
//            se (adversário tem 2 quadrados em linha com o terceiro desocupado)
//                jogue neste quadrado desocupado
//            senão
//                se (há algum canto livre)
//                    jogue neste canto

    // Você joga com X e o computador joga com O
    // Casas: 1 2 3 / 4 5 6 / 7 8 9
    val t = arrayOf(" ", " ", " ", " ", " ", " ", " ", " ", " ")

    // as 8 linhas possíveis para ganhar
    val linhas = arrayOf(
        intArrayOf(0, 1, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8),
        intArrayOf(0, 3, 6), intArrayOf(1, 4, 7), intArrayOf(2, 5, 8),
        intArrayOf(0, 4, 8), intArrayOf(2, 4, 6)
    )

    fun mostrar() {
        println(" ${t[0]} | ${t[1]} | ${t[2]}")
        println("---+---+---")
        println(" ${t[3]} | ${t[4]} | ${t[5]}")
        println("---+---+---")
        println(" ${t[6]} | ${t[7]} | ${t[8]}")
    }

    fun ganhou(j: String): Boolean {
        for (l in linhas) {
            if (t[l[0]] == j && t[l[1]] == j && t[l[2]] == j) {
                return true
            }
        }
        return false
    }

    fun existeLivre(): Boolean {
        for (i in 0..8) {
            if (t[i] == " ") {
                return true
            }
        }
        return false
    }

    // adversário tem 2 quadrados em linha com o terceiro desocupado
    fun achaBloqueio(): Int {
        for (l in linhas) {
            var qtdX = 0
            var livre = -1
            for (c in l) {
                if (t[c] == "X") {
                    qtdX = qtdX + 1
                }
                if (t[c] == " ") {
                    livre = c
                }
            }
            if (qtdX == 2 && livre != -1) {
                return livre
            }
        }
        return -1
    }

    mostrar()

    while (existeLivre() && !ganhou("X") && !ganhou("O")) {
        // espera a jogada do adversário
        print("Sua jogada (1-9): ")
        var casa = readln().toInt() - 1
        while (casa < 0 || casa > 8 || t[casa] != " ") {
            print("Jogada inválida, digite de novo: ")
            casa = readln().toInt() - 1
        }
        t[casa] = "X"

        if (existeLivre() && !ganhou("X")) {
            var jogada = -1

            // se o centro está livre, joga no centro
            if (t[4] == " ") {
                jogada = 4
            }
            // senão, se o adversário tem 2 em linha, joga no terceiro
            if (jogada == -1) {
                jogada = achaBloqueio()
            }
            // senão, joga em um canto livre
            if (jogada == -1) {
                for (c in intArrayOf(0, 2, 6, 8)) {
                    if (t[c] == " " && jogada == -1) {
                        jogada = c
                    }
                }
            }
            // se não deu nenhuma, joga em qualquer livre
            if (jogada == -1) {
                for (i in 0..8) {
                    if (t[i] == " " && jogada == -1) {
                        jogada = i
                    }
                }
            }

            t[jogada] = "O"
            println("Minha jogada: ${jogada + 1}")
        }
        mostrar()
    }

    if (ganhou("X")) {
        println("Você ganhou!")
    } else if (ganhou("O")) {
        println("Eu ganhei!")
    } else {
        println("Deu velha!")
    }

}
