fun main(){

//algoritmo 134   [Lista 2 - Estrutura do Se]
//A confederação brasileira de natação irá promover eliminatórias para o próximo mundial.
//Fazer um algoritmo que receba a idade de um nadador e imprimir a sua categoria segundo a
//tabela a seguir:
//Categoria - Idade
//Infantil A - 5 a 7 anos
//Infantil B - 8 a 10 anos
//Juvenil A - 11 a 13 anos
//Juvenil B - 14 a 17 anos
//Sênior - maiores de 18 anos

    print("entre com a idade: ")
    val idade = readln().toInt()
    if (idade < 5) {
        println("não existe categoria para essa idade")
    } else {
        if (idade <= 7) {
            println("categoria Infantil A")
        } else {
            if (idade <= 10) {
                println("categoria Infantil B")
            } else {
                if (idade <= 13) {
                    println("categoria Juvenil A")
                } else {
                    if (idade <= 17) {
                        println("categoria Juvenil B")
                    } else {
                        println("categoria Sênior")
                    }
                }
            }
        }
    }

}
