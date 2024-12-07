fun main() {

    val planeta = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")
    println("Qual o nome do planeta: ")
    val planetadigitado = readLine()
    if (planetadigitado in (planeta))
    {
        println("Planeta $planetadigitado já tá na lista.")
    }
    else println("O planeta  $planetadigitado não está na lista.")}

    // Plenata - Versão Alternativa
    fun main() {
        // Crie uma lista de planetas que inclua "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"
        // Peça ao usuário para digitar o nome de um planeta e verifique se está na lista

        val planetas = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")
        println("Qual o nome do planeta:")
        val planetadigitado = readLine()

        if (planetadigitado in planetas) {
            println("O planeta $planetadigitado já está na lista.")
        } else {
            println("O planeta $planetadigitado não está na lista.")
        }
    }
    //Alterações realizadas:
    //Renomeação da variável planeta para planetas: Faz mais sentido, pois estamos lidando com uma lista de planetas.
    //Formatação e Indentação: Melhorei a formatação para tornar o código mais limpo e legível.
    //Correção da mensagem: Ajustei a gramática das mensagens para "O planeta $planetadigitado já está na lista" e "O planeta $planetadigitado não está na lista".

