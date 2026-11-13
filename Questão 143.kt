fun main(){

//algoritmo 143   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que verifique a(s) letra(s) central(is) de uma palavra. Se o número de
//caracteres for ímpar, ele verifica se a letra central é uma vogal; caso contrário, verifica
//se é um dos dígrafos rr ou ss (só precisa testar letras minúsculas).

    print("digite uma palavra: ")
    val pal = readln()

    if (pal.isEmpty()) {
        println("palavra vazia")
    } else if (pal.length % 2 == 0) {
        // tamanho par: as duas letras centrais
        val n1 = pal.length / 2
        val centrais = pal[n1 - 1].toString() + pal[n1]
        if (centrais == "rr" || centrais == "ss") {
            println("É rr OU ss")
        } else {
            println("NÃO É rr OU ss")
        }
    } else {
        // tamanho ímpar: a letra central
        val central = pal[pal.length / 2]
        if (central == 'a' || central == 'e' || central == 'i' || central == 'o' || central == 'u') {
            println("É VOGAL")
        } else {
            println("NÃO É VOGAL")
        }
    }

}
