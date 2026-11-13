fun main(){

//algoritmo 135   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que leia a idade de uma pessoa e informar a sua classe eleitoral:
//• não-eleitor (abaixo de 16 anos)
//• eleitor obrigatório (entre 18 e 65 anos)
//• eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)
//Obs.: o código do livro não separa os de 16 e 17 anos (marca-os como obrigatórios); aqui
//eles são facultativos, como pede o enunciado.

    print("digite a idade: ")
    val idade = readln().toInt()
    if (idade < 16) {
        println("Não eleitor")
    } else {
        if (idade < 18 || idade > 65) {
            println("Eleitor facultativo")
        } else {
            println("Eleitor obrigatório")
        }
    }

}
