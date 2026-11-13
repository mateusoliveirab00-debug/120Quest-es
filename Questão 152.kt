fun main(){

//algoritmo 152   [Lista 2 - Estrutura do Se]
//Criar um algoritmo que a partir da idade e peso do paciente calcule a dosagem de determinado
//medicamento e imprima a receita informando quantas gotas do medicamento o paciente deve
//tomar por dose. Considere que o medicamento em questão possui 500 mg por ml, e que cada ml
//corresponde a 20 gotas.
//• Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou acima de 60
//quilos devem tomar 1000 mg; com peso abaixo de 60 quilos devem tomar 875 mg.
//• Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo peso corpóreo
//conforme a tabela a seguir:
//5 kg a 9 kg = 125 mg
//9.1 kg a 16 kg = 250 mg
//16.1 kg a 24 kg = 375 mg
//24.1 kg a 30 kg = 500 mg
//acima de 30 kg = 750 mg

    print("digite o peso (kg): ")
    val peso = readln().replace(",", ".").toDouble()
    print("digite a idade (anos): ")
    val idade = readln().toInt()

    val mgPorGota = 500 / 20.0        // 500 mg por ml e 20 gotas por ml = 25 mg por gota

    if (peso < 5) {
        println("não pode tomar o remédio porque não tem peso. Consulte o médico.")
    } else {
        val dose: Int
        if (idade >= 12) {
            if (peso >= 60) { dose = 1000 } else { dose = 875 }
        } else {
            if (peso <= 9) {
                dose = 125
            } else {
                if (peso <= 16) {
                    dose = 250
                } else {
                    if (peso <= 24) {
                        dose = 375
                    } else {
                        if (peso <= 30) { dose = 500 } else { dose = 750 }
                    }
                }
            }
        }
        println("Tomar ${dose / mgPorGota} gotas")
    }

}
