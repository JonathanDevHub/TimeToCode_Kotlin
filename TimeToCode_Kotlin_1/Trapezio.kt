fun main () {
    println("Vamos calcular a área do trapézio! \nQual a base maior? ")

    val bmaior = readln().toDouble()
    println("Qual a base menor? ")

    val bmenor = readln().toDouble()
    println("Qual a altura? ")

    val h = readln().toDouble()
    print( "A área do Trapézio é igual a ${((bmaior +bmenor)*h)/2}!")
}
    //Trapezio - Versão Alternativa
    fun main() {
        println("Vamos calcular a área do trapézio!")

        print("Qual a base maior? ")
        val baseMaior = readln().toDouble()

        print("Qual a base menor? ")
        val baseMenor = readln().toDouble()

        print("Qual a altura? ")
        val altura = readln().toDouble()

        val area = ((baseMaior + baseMenor) * altura) / 2
        println("A área do trapézio é igual a ${"%.2f".format(area)}!")
    }
    //Alterações realizadas:
    //Consistência na Nomeação de Variáveis: Renomeei as variáveis para baseMaior, baseMenor e altura para manter a consistência e melhorar a legibilidade.
    //Formatação do Resultado: Usei String.format("%.2f", area) para limitar o resultado a duas casas decimais, tornando o valor mais legível.
    //Estrutura do Código: Melhorei a estrutura do código para garantir que todas as mensagens sejam claras e a interação seja amigável.