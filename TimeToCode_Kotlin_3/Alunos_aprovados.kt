fun main (){
    var aprovados = 0

    while (true){
        println("Informe a primeira nota: ")
        var nota1 = readln().toDouble()

        println("Informe a segunda nota: ")
        var nota2 = readln().toDouble()

        var media = (nota1 + nota2) / 2

        if (media >= 9.5){
            println("Parabéns! Você foi aprovado. Sua média é: $media")
            aprovados = aprovados + 1
        }
        else{
            println("Você não foi aprovado. Sua média é: $media")
        }

        println("Deseja calcular a média de outro aluno? Informe: Sim ou Nao: ")
        var resposta = readln()

        if (resposta == "Não" || resposta == "Nao"){
            println("A quantidade de alunos aprovados são: $aprovados")
            break
        }
    }
}
    //Alunos_aprovados - Versão Alternativa
    fun main() {
        var aprovados = 0

        while (true) {
            println("Informe a primeira nota: ")
            val nota1 = readln().toDouble()

            println("Informe a segunda nota: ")
            val nota2 = readln().toDouble()

            val media = (nota1 + nota2) / 2

            if (media >= 9.5) {
                println("Parabéns! Você foi aprovado. Sua média é: $media")
                aprovados++
            } else {
                println("Você não foi aprovado. Sua média é: $media")
            }

            println("Deseja calcular a média de outro aluno? Informe: Sim ou Nao: ")
            val resposta = readln()

            if (resposta.equals("Não", ignoreCase = true) || resposta.equals("Nao", ignoreCase = true)) {
                println("A quantidade de alunos aprovados são: $aprovados")
                break
            }
        }
    }
    //Alterações realizadas:
    //Uso de val em vez de var: Usei val para variáveis que não precisam ser mutáveis, o que melhora a segurança e legibilidade do código.
    //Operador de Incremento: Usei ++ para incrementar a variável aprovados.
    //Comparação de Strings Ignorando Maiúsculas/Minúsculas: Usei equals com ignoreCase = true para tornar a comparação das respostas mais robusta.
    //Formatação do Código: Melhorei a formatação para torná-lo mais organizado e legível.