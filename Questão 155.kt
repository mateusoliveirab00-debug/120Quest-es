fun main(){

//algoritmo 155   [Lista 2 - Estrutura do Se]
//Ler uma palavra e, se ela começar pela letra L ou D (também deve ser considerado l ou d),
//formar uma nova palavra que terá os dois primeiros caracteres e o último, caso contrário a
//nova palavra será formada por todos os caracteres menos o primeiro.

    print("digite a palavra: ")
    val pal = readln()
    if (pal.isEmpty()) {
        println("palavra vazia")
    } else {
        val letra = pal.take(1)
        val nova: String
        if (letra == "l" || letra == "L" || letra == "d" || letra == "D") {
            nova = pal.take(2) + pal.last()      // strnprim + strult
        } else {
            nova = pal.drop(1)                   // strresto
        }
        println("palavra: $nova")
    }

}
