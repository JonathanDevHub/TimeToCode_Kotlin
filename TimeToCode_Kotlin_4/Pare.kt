fun main() {

    var estudantes = 0
    val alunos="PARE"
    while (true) {
        println("Digite o nome do estudante: ")
        val alunos = readLine()
        estudantes = estudantes + 1

        if (alunos == "PARE") {
            println("\n  Estudantes cadastrados: ${alunos}")
            println("Quantidade de alunos cadastrados:${estudantes}")
            break
        }

    }
}
    //Pare - Versão Alternativa
    fun main() {
        var estudantes = 0

        while (true) {
            println("Digite o nome do estudante (ou digite PARE para terminar): ")
            val nome = readLine()

            if (nome == "PARE") {
                println("\nEstudantes cadastrados: $estudantes")
                break
            }

            estudantes++
        }

        println("Quantidade de alunos cadastrados: $estudantes")
    }
    //Alterações realizadas:
    //Removi a redefinição desnecessária da variável alunos: alunos foi definida dentro do loop e usada novamente, o que poderia causar confusão.
    //Corrigi a lógica para incrementar estudantes corretamente: Coloquei a verificação de PARE antes do incremento.
    //Melhorei a mensagem de saída: Clarifiquei a mensagem ao final para mostrar a quantidade de alunos cadastrados corretamente.
    //Atualizei a variável nome: Para claridade, a variável que recebe a entrada do usuário foi renomeada para nome.


