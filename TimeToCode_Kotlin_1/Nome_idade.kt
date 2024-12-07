fun main () {
    print("Qual seu nome? ")
    val n = readln()
    print("Qual sua idade? ")
    val i = readln().toInt()
    print("Seu nome é $n e sua idade é $i !")
}
    //Nome_idade - Versão Alternativa
    fun main() {
        println("Olá! Vamos começar a nossa interação. 😊")

        print("Qual seu nome? ")
        val nome = readln()

        print("Qual sua idade? ")
        val idade: Int = try {
            readln().toInt()
        } catch (e: NumberFormatException) {
            println("Por favor, insira um número válido para a idade.")
            return
        }

        println("Seu nome é $nome e sua idade é $idade!")
        println("É um prazer conhecê-lo(a), $nome! 🎉")
    }
    //Alterações realizadas:
    //Saudação Inicial: Adicionei uma mensagem de saudação para tornar a interação mais amigável.
    //Verificação de Entrada: Incluí uma verificação para garantir que a idade seja um número válido, utilizando um bloco try-catch.
    //Mensagens de Saída Melhoradas: Adicionei uma mensagem final para tornar a saída mais acolhedora e interativa.