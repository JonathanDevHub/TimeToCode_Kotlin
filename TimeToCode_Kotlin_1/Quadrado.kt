fun main () {
    println("Vamos calcular a área do Quadrado! \nQual a medida do lado base? ")

    val lado = readln().toDouble()
    print( "A área do Quadrado é igual a ${lado * lado}!")
}
    //Quadrado - Versão Alternativa
    fun main() {
        println("Vamos calcular a área do Quadrado!")

        print("Qual a medida do lado do quadrado? ")
        val lado = readln().toDouble()

        val area = lado * lado
        println("A área do Quadrado é igual a ${"%.2f".format(area)}!")
    }
    //Alterações realizadas:
    //Mensagem Inicial: Mantive a saudação inicial para tornar a interação mais amigável.
    //Formatação do Resultado: Usei String.format("%.2f", area) para limitar o resultado a duas casas decimais, tornando o valor mais legível.
    //Armazenamento da Área: Armazenei o resultado do cálculo na variável area antes de exibi-lo.