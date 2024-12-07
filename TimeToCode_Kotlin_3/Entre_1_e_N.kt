fun main(){

    println("Informe um número: ")
    var numero = readln().toInt()

    if (numero > 0){
        var i = 1

        while (i <= numero){
            println(i)
            i = i + 1
        }

    }
    else {
        println("O número deve ser maior que ZERO. Tente novamente.")
    }
}
    //Entre_1_e_N - Versão Alternativa
    fun main() {
        println("Informe um número: ")
        val numero = readln().toInt()

        if (numero > 0) {
            for (i in 1..numero) {
                println(i)
            }
        } else {
            println("O número deve ser maior que ZERO. Tente novamente.")
        }
    }
    //Alterações realizadas:
    //Uso de val em vez de var: Substituí var por val para numero, que não precisa ser mutável, aumentando a segurança do código.
    //Substituição do while por for: Usei um loop for para iterar de 1 até numero, tornando o código mais idiomático e legível.
    //Formatação do Código: Melhorei a formatação para tornar o código mais limpo e organizado.