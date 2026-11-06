fun main(){

//algoritmo 98   [Lista 2 - Estrutura do Se]
//A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários.
//O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo
//que permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo
//pode ou não ser concedido.

    print("Digite o salário bruto: ")
    val salario = readln().toDouble()
    print("Digite o valor da prestação: ")
    val prestacao = readln().toDouble()
    if (prestacao <= salario * 0.30) {
        println("empréstimo pode ser concedido")
    } else {
        println("empréstimo não pode ser concedido")
    }

}
