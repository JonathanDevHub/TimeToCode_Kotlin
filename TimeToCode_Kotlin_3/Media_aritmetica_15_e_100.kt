fun main(){
    var contador = 0
    var numero = 15
    var soma = 0

    contador = 101 - 15

    while (numero <= 100){
        soma = soma + numero
        numero = numero + 1

    }

    var media = soma / contador


    println("A média aritmética entre 15 e 100 é: $media")
}
    //Média_Aritmética - Versão Alternativa
    fun main() {
        val inicio = 15
        val fim = 100
        var soma = 0

        for (numero in inicio..fim) {
            soma += numero
        }

        val contador = fim - inicio + 1
        val media = soma / contador

        println("A média aritmética entre $inicio e $fim é: $media")
    }
    //Alterações realizadas:
    //Uso de val em vez de var: Usei val para variáveis que não mudam, garantindo imutabilidade e melhorando a legibilidade.
    //Substituição do while por for: Substituí o loop while por um loop for, que é mais idiomático e legível para este tipo de contagem.
    //Cálculo da Contagem: Ajustei o cálculo de contador para ser fim - inicio + 1, refletindo corretamente a quantidade de números no intervalo.
    //Formatação do Código: Melhorei a formatação para torná-lo mais organizado e fácil de entender.