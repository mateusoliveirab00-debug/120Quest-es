fun main(){

//algoritmo 19   [Capítulo 2 - exemplos do texto (sem enunciado formal)]
//Exemplo do livro: testar a maioria das funções numéricas (raiz, exp, log, seno, potência,
//valor absoluto e conversão entre real e inteiro).

    println("raiz: ${Math.sqrt(64.0)}")
    println("raiz com exp e log: ${Math.exp(1.0 / 2 * Math.log(64.0))}")
    println("seno de 45 graus: ${Math.sin(Math.toRadians(45.0))}")
    println("potencia com exp e log: ${Math.exp(3 * Math.log(8.0))}")
    println("potencia com pow: ${Math.pow(8.0, 3.0)}")
    println("raiz cubica: ${Math.exp(1.0 / 3 * Math.log(8.0))}")
    println("absoluto: ${Math.abs(-8)}")
    println("absoluto: ${Math.abs(8)}")
    println("convertendo para inteiro 5.5: ${Math.round(5.5)}")
    println("convertendo para inteiro 6.5: ${Math.round(6.5)}")
    println("convertendo para inteiro 5.45: ${Math.round(5.45)}")
    println("convertendo para inteiro 5.51: ${Math.round(5.51)}")
    println("convertendo para real 87: ${87.toDouble()}")
    println("convertendo para int 3/4: ${Math.round(3 / 4.0)}")

}
