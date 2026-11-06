fun main(){

//algoritmo 6   [Capítulo 1 - Conceitos iniciais]
//Algoritmo para descascar batatas
//1 - pegar faca, bacia e batatas;
//2 - colocar água na bacia;
//3 - enquanto (houver batatas)
//    descascar batatas;

    println("1 - pegar faca, bacia e batatas")
    println("2 - colocar água na bacia")

    print("Quantas batatas tem? ")
    var batatas = readln().toInt()

    while (batatas > 0) {
        println("3 - descascar uma batata")
        batatas = batatas - 1
    }

    println("acabaram as batatas")

}
