fun main () {
    print("Qual a base? ")

    val base = readln().toDouble()
    print("Qual a altura? ")

    val altura = readln().toDouble()
    print( "A área do triângulo é igual a ${base * altura}!")
}
    //Retângulo - Versão Alternativa
    fun main() {
        print("Qual a base? ")
        val base = readln().toDouble()

        print("Qual a altura? ")
        val altura = readln().toDouble()

        val area = (base * altura) / 2
        println("A área do triângulo é igual a ${"%.2f".format(area)}!")
    }
    //Alterações realizadas:
    //Cálculo Correto da Área: A fórmula foi corrigida para (base × altura)/2 .
    //Formatação do Resultado: Usei String.format("%.2f", area) para limitar o resultado a duas casas decimais.
    //Mensagens Amigáveis: As mensagens de entrada e saída foram mantidas para facilitar a interação.