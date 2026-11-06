fun main(){

//algoritmo 48   [Lista 1 - Leia, imprima, atribuição e funções]
//Antes de o racionamento de energia ser decretado, quase ninguém falava em quilowatts; mas,
//agora, todos incorporaram essa palavra em seu vocabulário. Sabendo-se que 100 quilowatts de
//energia custa um sétimo do salário mínimo, fazer um algoritmo que receba o valor do salário
//mínimo e a quantidade de quilowatts gasta por uma residência e calcule. Imprima:
//• o valor em reais de cada quilowatt
//• o valor em reais a ser pago
//• o novo valor a ser pago por essa residência com um desconto de 10%.

    print("Digite o salário mínimo: ")
    val sm = readln().toDouble()
    print("Digite a quantidade de quilowatts: ")
    val qtd = readln().toDouble()

    val preco = sm / 7 / 100
    val valor = preco * qtd
    val desconto = valor * 0.9
    println("valor de cada quilowatt: $preco")
    println("valor a ser pago: $valor")
    println("valor com desconto de 10%: $desconto")

}
