fun main (){
    var list = mutableListOf<Int>()

    for (i in 1 .. 6){
        println("Insira (seis) valores: ")
        list.add(readln().toInt())
    }
    println(list)

    var media: Int
    var  media_Total: Int
    media = list.sum()
    media_Total = media / list.count()

    println("O calculo total é $media")
    println("A média aritmetica é $media_Total")
}
    //Média - Versão Alternativa
    fun main() {
        val list = mutableListOf<Int>()

        for (i in 1..6) {
            print("Insira o valor ${i} de 6: ")
            list.add(readln().toInt())
        }

        println("Valores inseridos: $list")

        val soma = list.sum()
        val mediaAritmetica = soma / list.size

        println("O cálculo total é $soma")
        println("A média aritmética é $mediaAritmetica")
    }
    //Alterações realizadas:
    //Mensagens de Entrada: Ajustei as mensagens para indicar qual valor está sendo inserido (ex: "Insira o valor 1 de 6").
    //Nomeação de Variáveis: Renomeei media para soma para tornar mais claro que essa variável armazena a soma dos valores.
    //Cálculo da Média Aritmética: Utilizei list.size em vez de list.count() para obter o tamanho da lista.
    //Formatação do Código: Melhorei a formatação e a legibilidade do código, tornando-o mais limpo e organizado.