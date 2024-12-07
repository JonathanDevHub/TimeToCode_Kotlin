fun main(){
    println("Insira um valor: ")
    val valor:  Int = readln().toInt()

    if(valor > 0){
        println("O valor é positivo!")
    } else if (valor < 0){
        println("O valor é negativo!")
    } else {
        println("O valor é ZERO!")
    }
}
    //Negativo_positivo - Versão Alternativa
    fun main() {
        println("Insira um valor: ")
        val valor: Int = readln().toInt()

        if (valor > 0) {
            println("O valor é positivo!")
        } else if (valor < 0) {
            println("O valor é negativo!")
        } else {
            println("O valor é zero!")
        }
    }
    //Alterações realizadas:
    //Consistência de Mensagens: Altere a mensagem para "O valor é zero!" em vez de "O valor é ZERO!" para manter a consistência no estilo.
    //Formatação do Código: Removi espaços desnecessários para melhorar a legibilidade.