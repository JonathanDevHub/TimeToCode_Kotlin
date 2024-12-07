fun main (){
    println("Informe um número: ")
    var numero = readln().toInt()

    println("Informe o segundo número: ")
    var numero2 = readln().toInt()

    while (numero2 <= 0){
        println("Número não aceito. Por favor, informe um número que seja positivo e maior que zero: ")
        numero2 = readln().toInt()
    }

    if (numero2 > 0){
        var resultado = (numero / numero2)
        println("O resultado da divisão dos dois números é: $resultado")
    }
}
    //Calculadora_de_divisao - Versão Alternativa
    fun main() {
        println("Informe um número: ")
        val numero1 = readln().toInt()

        println("Informe o segundo número: ")
        var numero2 = readln().toInt()

        while (numero2 <= 0) {
            println("Número não aceito. Por favor, informe um número que seja positivo e maior que zero: ")
            numero2 = readln().toInt()
        }

        val resultado = numero1 / numero2
        println("O resultado da divisão dos dois números é: $resultado")
    }
    //Alterações realizadas:
    //Consistência na Nomeação de Variáveis: Usei numero1 e numero2 para maior clareza e consistência.
    //Uso de val em vez de var: Substituí var por val para variáveis que não mudam, garantindo imutabilidade.
    //Remoção de Condicional Redundante: Removi a condição if (numero2 > 0) no final, já que o loop while garante que numero2 será positivo.
    //Formatação do Código: Melhorei a formatação para torná-lo mais limpo e organizado.