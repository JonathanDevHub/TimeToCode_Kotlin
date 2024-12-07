fun main(){
    var maior = 0

    println("Informe o 1° número: ")
    var numero = readln().toInt()

    println("Informe o 2° número: ")
    var numero2 = readln().toInt()

    println("Informe o 3° número: ")
    var numero3 = readln().toInt()

    println("Informe o 4° número: ")
    var numero4 = readln().toInt()

    maior = numero

    if (numero2 > maior) {
        maior = numero2
    }
    if (numero3 > maior){
        maior = numero3
    }
    if (numero4 > maior){
        maior = numero4
    }

    println("O 1° número é: $numero")
    println("O Último número é: $numero4")
    println("O número maior é: $maior")

}
    //Primeiro_último_e_maior_número - Versão Alternativa
    fun main() {
        println("Informe o 1° número: ")
        val numero1 = readln().toInt()

        println("Informe o 2° número: ")
        val numero2 = readln().toInt()

        println("Informe o 3° número: ")
        val numero3 = readln().toInt()

        println("Informe o 4° número: ")
        val numero4 = readln().toInt()

        val maior = listOf(numero1, numero2, numero3, numero4).maxOrNull() ?: 0

        println("O 1° número é: $numero1")
        println("O Último número é: $numero4")
        println("O maior número é: $maior")
    }
    //Alterações realizadas:
    //Uso de val em vez de var: Substituí var por val para garantir que as variáveis sejam imutáveis, já que seus valores não mudam após a leitura.
    //Uso de Listas: Utilize listas e a função maxOrNull() para encontrar o maior número de forma mais concisa e clara.
    //Correção da Mensagem Final: Uniformizei o estilo das mensagens de saída, ajustando "O número maior é" para "O maior número é" para maior clareza.