fun main(){

//algoritmo 151   [Lista 2 - Estrutura do Se]
//Um endocrinologista deseja controlar a saúde de seus pacientes e, para isso, se utiliza do
//Índice de Massa Corporal (IMC). Sabendo-se que o IMC é calculado através da seguinte
//fórmula: IMC = peso / altura²
//Onde: peso é dado em kg e altura é dada em metros.
//Criar um algoritmo que apresente o nome do paciente e sua faixa de risco, baseando-se na
//seguinte tabela:
//IMC - FAIXA DE RISCO
//abaixo de 20 - abaixo do peso
//a partir de 20 até 25 - normal
//acima de 25 até 30 - excesso de peso
//acima de 30 até 35 - obesidade
//acima de 35 - obesidade mórbida

    print("digite o nome do paciente: ")
    val nome = readln()
    print("digite o peso (kg): ")
    val peso = readln().replace(",", ".").toDouble()
    print("digite a altura (m): ")
    val altura = readln().replace(",", ".").toDouble()
    val imc = peso / (altura * altura)

    val faixa: String
    if (imc < 20) {
        faixa = "abaixo do peso"
    } else {
        if (imc <= 25) {
            faixa = "normal"
        } else {
            if (imc <= 30) {
                faixa = "excesso de peso"
            } else {
                if (imc <= 35) {
                    faixa = "obesidade"
                } else {
                    faixa = "obesidade mórbida"
                }
            }
        }
    }
    println("$nome - IMC: ${"%.2f".format(imc)} - $faixa")

}
