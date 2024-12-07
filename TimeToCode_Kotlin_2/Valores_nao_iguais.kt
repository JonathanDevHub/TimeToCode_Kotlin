fun main(){
    println("Insira o primeiro valor: ")
    val numero1: Int = readln().toInt()

    println("Insira o segundo valor: ")
    val numero2: Int = readln().toInt()

    if(numero1 > numero2){
        println("O número $numero1, é maior!")
    }else if (numero2 > numero1){
        println("O número $numero2, é maior!")
    } else {
        println("O valores são iguais!")
    }

}
    //Valores_não_iguais - Versão Alternativa
    fun main() {
        // Exercicio 1
        println("Insira o primeiro valor: ")
        val numero1: Int = readln().toInt()

        println("Insira o segundo valor: ")
        val numero2: Int = readln().toInt()

        if (numero1 > numero2) {
            println("O número $numero1 é maior!")
        } else if (numero2 > numero1) {
            println("O número $numero2 é maior!")
        } else {
            println("Os valores são iguais!")
        }
    }
    //Alterações realizadas:
    //Correção de Erro de Digitação: Corrigi a mensagem final para "Os valores são iguais!".
    //Formatação do Código: Removi espaços desnecessários para melhorar a legibilidade.