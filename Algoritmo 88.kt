fun main(){

//algoritmo 88   [Capítulo 3 - exemplos do texto]
//Algoritmo Calculadora: mostrar um menu (+ para somar, - para subtrair, * para multiplicar, /
//para dividir), ler a opção e, de acordo com ela, ler dois números e imprimir o resultado. Se
//a opção não existir, imprimir "OPÇÃO NÃO DISPONÍVEL!".

    println("*************")
    println("*CALCULADORA*")
    println("*************")
    println("+ para somar")
    println("- para subtrair")
    println("* para multiplicar")
    println("/ para dividir")
    print("Digite a opção: ")
    val op = readln()

    if (op == "+" || op == "-" || op == "*" || op == "/") {
        print("Digite o 1º número: ")
        val a = readln().toDouble()
        print("Digite o 2º número: ")
        val b = readln().toDouble()
        if (op == "+") {
            println("SOMA: ${a + b}")
        } else if (op == "-") {
            println("SUBTRAÇÃO: ${a - b}")
        } else if (op == "*") {
            println("MULTIPLICAÇÃO: ${a * b}")
        } else {
            println("DIVISÃO: ${a / b}")
        }
    } else {
        println("OPÇÃO NÃO DISPONÍVEL!")
    }

}
