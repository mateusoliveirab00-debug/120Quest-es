fun main(){

//algoritmo 131   [Lista 2 - Estrutura do Se]
//A turma de Programação, por ter muitos alunos, será dividida em dias de provas. Após um
//estudo feito pelo coordenador, decidiu-se dividi-la em três grupos. Fazer um algoritmo que
//leia o nome do aluno e indicar a sala em que ele deverá fazer as provas, tendo em vista a
//tabela a seguir e sabendo-se que todas as salas se encontram no bloco F:
//A - K: sala 101
//L - N: sala 102
//O - Z: sala 103

    print("Digite o nome: ")
    val nome = readln()
    val l = nome.take(1).uppercase()      // inicial em maiúscula (letras acentuadas não são tratadas)
    if (l >= "A" && l <= "K") {
        println("$nome sala: 101 (bloco F)")
    } else {
        if (l >= "L" && l <= "N") {
            println("$nome sala: 102 (bloco F)")
        } else {
            if (l >= "O" && l <= "Z") {
                println("$nome sala: 103 (bloco F)")
            } else {
                println("NOME INVÁLIDO")
            }
        }
    }

}
