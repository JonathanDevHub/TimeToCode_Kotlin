fun main(){
    println("\n---> URNA ELETRÔNICA < --- \n")

    println("Você possuí Titulo Eleitoral: (SIM/NÃO)")
    var titulo_eleitoral: String = readln().toString()

    if(titulo_eleitoral == "s"){
        println("Você Possui titulo eleitoral\n")
    }
    else {
        println("Você não tem titulo eleitoral. Não pode votar!\n")
        return
    }

    println("Insira seu Ano de Nascimento: ")
    var ano_nascimento = readln().toInt()
    val anoAtual = 2024
    var calcIdade = anoAtual - ano_nascimento

    if(calcIdade >= 16){
        println("Pode votar, pois sua idade é $calcIdade")
    }
    else{
        println("Não pode votar!")
    }
}
    //Votar - Versão Alternativa
    fun main() {
        println("\n---> URNA ELETRÔNICA <---\n")

        println("Você possui Título Eleitoral: (SIM/NÃO)")
        val tituloEleitoral = readln().trim().lowercase()

        if (tituloEleitoral == "sim" || tituloEleitoral == "s") {
            println("Você possui título eleitoral.\n")
        } else {
            println("Você não tem título eleitoral. Não pode votar!\n")
            return
        }

        println("Insira seu Ano de Nascimento: ")
        val anoNascimento = readln().toInt()
        val anoAtual = 2024
        val calcIdade = anoAtual - anoNascimento

        if (calcIdade >= 16) {
            println("Pode votar, pois sua idade é $calcIdade.")
        } else {
            println("Não pode votar!")
        }
    }
    //Alterações realizadas:
    //Consistência no Texto: Corrigi a grafia de "possui" e "título eleitoral" para padronizar o texto.
    //Verificação de Entrada: Utilize trim().lowercase() para tornar a entrada do usuário mais robusta, aceitando "sim" e "s" em qualquer caso (maiúsculo ou minúsculo).
    //Nomeação de Variáveis: Usei val em vez de var para variáveis que não mudam, garantindo imutabilidade.
    //Formatação do Código: Melhorei a formatação e a legibilidade do código, tornando-o mais limpo e organizado.