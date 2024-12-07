fun main () {
    println("Vamos calcular a área do Quadrado! \nQual a diagonal maior do losango? ")

    val dmaior = readln().toDouble()
    println("Qual a diagonal menor do losango? ")

    val dmenor = readln().toDouble()
    print( "A área do Losango é igual a ${(dmaior * dmenor)/2}!")
}
    //Losango - Versão Alternativo
    fun main() {
        println("Vamos calcular a área do Losango!")

        print("Qual a diagonal maior do losango? ")
        val dmaior = readln().toDouble()

        print("Qual a diagonal menor do losango? ")
        val dmenor = readln().toDouble()

        val area = (dmaior * dmenor) / 2
        println("A área do losango é igual a ${"%.2f".format(area)}!")
    }
    //Alterações realizadas:
    //Correção do Texto Inicial: Corrigi a frase inicial para "Vamos calcular a área do Losango!".
    //Formatação do Resultado: Usei String.format("%.2f", area) para limitar o resultado a duas casas decimais, tornando o valor mais legível.
    //Variável de Área: Armazenei o resultado do cálculo na variável area antes de exibi-lo.