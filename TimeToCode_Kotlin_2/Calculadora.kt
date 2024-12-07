fun main(){
    println("\n---> Cálculadorinha1 <--- \n\n OPERADORES: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n Escolha: " )
    var opcao = readln().toInt()

    println("Insira o Primeiro valor: ")
    var valor1 = readln().toInt()

    println("Insira o Segundo valor: ")
    var valor2 = readln().toInt()

    var calculo = when(opcao){
        1 -> valor1 + valor2
        2 -> valor1 - valor2
        3 -> valor1 * valor2
        4 -> if (valor2 != 0 ) valor1 / valor2 else{
            println("Não é Possivel dividir por zero!")
        } else -> {
            println("Opçao inválida")
            return
        }
    }

    if(opcao == 1){
        println("A soma é  $valor1 + $valor2 = $calculo")
    }
    else if (opcao == 2){
        println("A subtração é  $valor1 - $valor2 =  $calculo")
    }
    else if (opcao == 3){
        println("A multiplicação é  $valor1 * $valor2 = $calculo")
    }
    else{
        println("A divisão e $valor1 / $valor2 =  $calculo")
    }
}
    //Calculadora - Versão Alternativa
    fun main() {
        println(
            """
        ---> Cálculadorinha1 <--- 
        OPERADORES: 
        1 - Adição 
        2 - Subtração 
        3 - Multiplicação 
        4 - Divisão 
        Escolha: 
        """.trimIndent()
        )
        val opcao = readln().toInt()

        println("Insira o Primeiro valor: ")
        val valor1 = readln().toInt()

        println("Insira o Segundo valor: ")
        val valor2 = readln().toInt()

        val calculo = when (opcao) {
            1 -> valor1 + valor2
            2 -> valor1 - valor2
            3 -> valor1 * valor2
            4 -> if (valor2 != 0) valor1 / valor2 else {
                println("Não é possível dividir por zero!")
                return
            }
            else -> {
                println("Opção inválida")
                return
            }
        }

        when (opcao) {
            1 -> println("A soma é: $valor1 + $valor2 = $calculo")
            2 -> println("A subtração é: $valor1 - $valor2 = $calculo")
            3 -> println("A multiplicação é: $valor1 * $valor2 = $calculo")
            4 -> println("A divisão é: $valor1 / $valor2 = $calculo")
        }
    }
    //Alterações realizadas:
    //Formatação da Mensagem Inicial: Usei trimIndent() para melhorar a formatação da mensagem inicial e torná-la mais limpa.
    //Consistência na Nomeação de Variáveis: Usei val em vez de var para variáveis que não mudam, garantindo imutabilidade.
    //Verificação de Divisão por Zero: Adicionei uma verificação para divisão por zero dentro da expressão when, com uma mensagem clara.
    //Formatação das Mensagens de Saída: Uniformizei as mensagens de saída, tornando-as mais claras e consistentes.