fun main(){
    println("Informe o primiero número: ")
    var numero = readln().toInt()

    println("Informe o segundo número: ")
    var numero2 = readln().toInt()

    if (numero < numero2){
        var soma = 0
        var resultado = 0
        var i = numero

        while (i <=numero2){
            soma = soma + i
            resultado = resultado + 1
            i = i + 1
        }

        var media = soma / resultado
        println("A média aritmética é: $media")
    }
    else{
        println("Erro: O primeiro número deve ser menor que o segundo número.")
    }

}
    //Média_aritmética - Versão Alternativa
    fun main() {
        println("Informe o primeiro número: ")
        val numero1 = readln().toInt()

        println("Informe o segundo número: ")
        val numero2 = readln().toInt()

        if (numero1 < numero2) {
            var soma = 0
            var contador = 0

            for (i in numero1..numero2) {
                soma += i
                contador++
            }

            val media = soma / contador
            println("A média aritmética é: $media")
        } else {
            println("Erro: O primeiro número deve ser menor que o segundo número.")
        }
    }
    //Alterações realizadas:
    //Consistência na Nomeação de Variáveis: Usei numero1 e numero2 para maior clareza e consistência.
    //Uso de val em vez de var: Substituí var por val para variáveis que não mudam após a leitura.
    //Substituição do while por for: Usei um loop for que é mais idiomático e legível para iterar sobre um intervalo.
    //Nomeação de Variáveis: Substituí resultado por contador para deixar claro que essa variável armazena a quantidade de números no intervalo.
    //Formatação do Código: Melhorei a formatação para torná-lo mais limpo e organizado.