fun main () {
    print("Qual a base? ")

    val base = readln().toDouble()
    print("Qual a altura? ")

    val altura = readln().toDouble()
    print( "A área do Triângulo é igual a ${(base * altura)/2}!")
}
    //Triangulo - Versão Alternativa
    fun main() {
        print("Qual a base? ")
        val base = readln().toDouble()

        print("Qual a altura? ")
        val altura = readln().toDouble()

        val area = (base * altura) / 2
        println("A área do Triângulo é igual a ${"%.2f".format(area)}!")
    }
    //Alterações realizadas:
    //Formatação do Resultado: Usei String.format("%.2f", area) para limitar o resultado a duas casas decimais, deixando o valor mais legível.
    //Armazenamento da Área: Armazenei o resultado do cálculo na variável area antes de exibi-lo.