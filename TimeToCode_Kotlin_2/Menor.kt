fun main(){
    var list = mutableListOf<Int>()

    for (i in 1..6){
        println("Insira (seis) valores: ")
        list.add(readln().toInt())
    }

    var soma_total: Int
    val menor72: Int = 72

    soma_total = list.filter { it < menor72 }.sum()
    println("A soma total é $soma_total")
}
    //Menor - Versão Alternativa
    fun main() {
        val list = mutableListOf<Int>()

        for (i in 1..6) {
            print("Insira o valor ${i} de 6: ")
            list.add(readln().toInt())
        }

        val limite = 72
        val somaTotal = list.filter { it < limite }.sum()

        println("Valores inseridos: $list")
        println("A soma dos valores menores que $limite é $somaTotal")
    }
    //Alterações realizadas:
    //Mensagens de Entrada: Ajustei as mensagens para indicar qual valor está sendo inserido (ex: "Insira o valor 1 de 6").
    //Nomeação de Variáveis: Renomeei menor72 para limite para deixar mais claro o propósito dessa variável.
    //Formatação do Código: Melhorei a formatação e a legibilidade do código, tornando-o mais organizado e fácil de entender.