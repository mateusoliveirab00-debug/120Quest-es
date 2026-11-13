fun main(){

//algoritmo 140   [Lista 2 - Estrutura do Se]
//Um restaurante faz uma promoção semanal de descontos para clientes de acordo com as iniciais
//do nome da pessoa. Criar um algoritmo que leia o primeiro nome do cliente, o valor de sua
//conta e se o nome iniciar com as letras A, D, M ou S, dar um desconto de 30%. Para o cliente
//cujo nome não se inicia por nenhuma dessas letras, exibir a mensagem "Que pena. Nesta semana
//o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará".
//Obs.: no PDF a letra D foi digitalizada como O no enunciado; a solução do livro testa A, D,
//M e S.

    print("Digite o primeiro nome: ")
    val nome = readln()
    print("Digite o valor da conta: ")
    val vc = readln().replace(",", ".").toDouble()
    val l = nome.take(1).uppercase()
    if (l == "A" || l == "D" || l == "M" || l == "S") {
        println("$nome, valor da conta com desconto: R\$ ${"%.2f".format(vc * 0.7)}")
    } else {
        println("Que pena. Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará")
    }

}
