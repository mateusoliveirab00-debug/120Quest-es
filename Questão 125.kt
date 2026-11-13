fun main(){

//algoritmo 125   [Lista 2 - Estrutura do Se]
//Entrar com a idade de uma pessoa e informar:
//• se é maior de idade
//• se é menor de idade
//• se é maior de 65 anos
//Obs.: a solução do livro imprime uma só mensagem e considera 65 anos ou mais como "maior de
//65".

    print("digite sua idade: ")
    val idade = readln().toInt()
    if (idade >= 65) {
        println("maior de 65")
    } else {
        if (idade >= 18) {
            println("maior de idade")
        } else {
            println("menor de idade")
        }
    }

}
