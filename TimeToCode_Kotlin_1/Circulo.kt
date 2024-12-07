fun main() {
    val pi: Double = 3.141592653
    print("Qual o raio? ")

    val r = readln().toDouble()
    val area = (r * r) * pi
    print("A área do círculo é igual a ${"%.2f".format(area)}!")
}
    //Circulo - Versão Alternativo
    fun main() {
        val pi = 3.141592653
        print("Qual o raio? ")
        val raio = readln().toDouble()
        val area = calcularAreaDoCirculo(raio, pi)

        println("A área do círculo é igual a $area!")
    }

fun calcularAreaDoCirculo(raio: Double, pi: Double): Double {
    return (raio * raio) * pi
}
    // Alterações realizadas:
    // Função Separada para Cálculo da Área: Criei uma função chamada calcularAreaDoCirculo que recebe o raio e o valor de pi como parâmetros e retorna a área do círculo.
    // Variável para Armazenar a Área: Armazenei o resultado do cálculo da área na variável area para depois imprimi-la.
    // Formatando o Código: Mantive o código organizado e claro, facilitando a leitura e compreensão.