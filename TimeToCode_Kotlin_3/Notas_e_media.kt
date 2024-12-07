fun main(){

    var numero = 1
    var soma = 0.0

    while (numero <= 6) {
        println("Informe a nota $numero :")
        val nota = readln().toDouble()


        if(nota >= 0 && nota <= 10) {
            soma = soma + nota
            numero = numero + 1
        }else {
            println("Erro! Digite um nota entre 0 e 10.")
        }
    }

    var media = soma / 6
    println("A média final é: $media")
}
    //Média_nota_6 - Versão Alternativa
    fun main() {
        var soma = 0.0

        for (i in 1..6) {
            while (true) {
                println("Informe a nota $i:")
                val nota = readln().toDouble()

                if (nota in 0.0..10.0) {
                    soma += nota
                    break
                } else {
                    println("Erro! Digite uma nota entre 0 e 10.")
                }
            }
        }

        val media = soma / 6
        println("A média final é: $media")
    }
    //Alterações realizadas:
    //Uso de Loop for: Utilizei um loop for para simplificar a iteração de 1 a 6.
    //Loop while Aninhado: Mantive o loop while para garantir que a nota esteja dentro do intervalo correto antes de continuar.
    //Uso de Intervalo em Kotlin: Utilizei nota in 0.0..10.0 para verificar se a nota está dentro do intervalo de 0 a 10, o que torna o código mais idiomático.
    //Formatação do Código: Melhorei a formatação para torná-lo mais limpo e organizado.