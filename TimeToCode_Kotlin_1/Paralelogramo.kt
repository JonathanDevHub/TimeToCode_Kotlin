fun main () {
    print("Qual a base? ")

    val base = readln().toDouble()
    print("Qual a altura? ")

    val altura = readln().toDouble()
    print( "A área do Paralelogramo é igual a ${base * altura}!")
}
    //Paralelograma - Versão Alternativa
    fun main() {
        println("Vamos calcular a área do Paralelogramo!")

        print("Qual a base? ")
        val base = readln().toDouble()

        print("Qual a altura? ")
        val altura = readln().toDouble()

        val area = base * altura
        println("A área do Paralelogramo é igual a ${"%.2f".format(area)}!")
    }
    //Alterações realizadas:
    //Mensagem Inicial: Adicionei uma mensagem de saudação para tornar a interação mais amigável.
    //Formatação do Resultado: Usei String.format("%.2f", area) para limitar o resultado a duas casas decimais, tornando o valor mais legível.
    //Armazenamento da Área: Armazenei o resultado do cálculo na variável area antes de exibi-lo.