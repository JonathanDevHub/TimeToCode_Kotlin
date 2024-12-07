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
    //Maior_valor - Versão Alternativa
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
    //Consistência de Mensagens: Alterei a mensagem para "O valor é zero!" em vez de "O valor é ZERO!" para manter a consistência no estilo.
    //Formatação do Código: Removi espaços desnecessários para melhorar a legibilidade.