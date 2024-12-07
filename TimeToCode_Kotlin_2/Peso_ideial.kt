fun main(){
    println("----> SEJAM BEM VINDOS <----\n" + "Insira seu genêro:\n" + "1 - Feminino\n" + "2 - Masculino")
    var opcao_genero: Int = readln().toInt()

    println("Insira sua Altura: ")
    var altura = readln().toDouble()

    val peso = when(opcao_genero){
        1 -> (62.1 * altura) - 44.7
        2 ->  (72.7 * altura) - 58
        else ->{
            println("Valor de genêro invalido!")
            return
        }
    }
    println("O total do seu peso é %.2f ".format(peso))

    if(opcao_genero == 1){
        println("Genêro Femino")
    }else{
        println("Genêro Masculino")
    }
}
    //Peso_ideial - Versão Alternativa
    fun main() {
        // Exercicio 10

        println(
            """
        ----> SEJAM BEM VINDOS <----
        Insira seu gênero:
        1 - Feminino
        2 - Masculino
    """.trimIndent()
        )
        val opcaoGenero = readln().toInt()

        println("Insira sua altura: ")
        val altura = readln().toDouble()

        val peso = when (opcaoGenero) {
            1 -> (62.1 * altura) - 44.7
            2 -> (72.7 * altura) - 58
            else -> {
                println("Valor de gênero inválido!")
                return
            }
        }
        println("O peso ideal é %.2f kg".format(peso))

        val genero = if (opcaoGenero == 1) "Feminino" else "Masculino"
        println("Gênero: $genero")
    }
    //Alterações realizadas:
    //Consistência na Nomeação de Variáveis: Usei opcaoGenero em vez de opcao_genero para manter a consistência com as convenções de nomenclatura Kotlin.
    //Formatação da Mensagem de Boas-Vindas: Usei trimIndent() para melhorar a formatação da mensagem de boas-vindas.
    //Correção de Ortografia: Corrigi "genêro" para "gênero" e "Femino" para "Feminino".
    //Cálculo do Peso: Melhorei a mensagem de saída para "O peso ideal é %.2f kg" para maior clareza.
    //Simplificação do Código: Usei uma variável genero para exibir o gênero após o cálculo.