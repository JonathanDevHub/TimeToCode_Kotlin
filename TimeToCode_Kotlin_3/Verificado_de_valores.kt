fun main (){

    var valorDentro = 0
    var valorFora = 0
    var i = 1

    while (i <= 10){
        println("Informe um valor $i:")
        val valor = readln().toInt()

        if(valor >= 24 && valor <= 42){
            valorDentro = valorDentro + 1
        }else{
            valorFora = valorFora + 1
        }
        i = i + 1
    }

    println("A quantidade de valores dentro do intervalor de 24, 42 é: $valorDentro")
    println("A quantidade de valores fora do intervalo de 24, 42 é: $valorFora")
}
    //Verificador_de_valores - Versão Alternativa
    fun main() {
        var valorDentro = 0
        var valorFora = 0

        for (i in 1..10) {
            println("Informe o valor $i:")
            val valor = readln().toInt()

            if (valor in 24..42) {
                valorDentro++
            } else {
                valorFora++
            }
        }

        println("A quantidade de valores dentro do intervalo de 24 a 42 é: $valorDentro")
        println("A quantidade de valores fora do intervalo de 24 a 42 é: $valorFora")
    }
    //Alterações realizadas:
    //Uso de Loop for: Utilizei um loop for para simplificar a iteração de 1 a 10.
    //Operadores de Incremento: Usei ++ para incrementar valorDentro e valorFora.
    //Verificação de Intervalo: Substituí if(valor >= 24 && valor <= 42) por if (valor in 24..42) para uma verificação de intervalo mais idiomática e legível.
    //Formatação do Código: Melhorei a formatação para tornar o código mais limpo e organizado.