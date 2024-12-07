fun main () {
    val nome_do_carro : String = "fusca"
    print(nome_do_carro)
}
    //Fusca - Versão Alternativo
    fun main() {
        print("Digite o nome do seu carro favorito: ")
        val nomeDoCarro = readln()
        println("Seu carro favorito é o $nomeDoCarro!")
    }
    //Alterações realizadas:
    // Prompt de Entrada: Adicionei um prompt para que o usuário digite o nome do carro favorito.
    //Variável de Entrada: Atualizei a variável nomeDoCarro para receber a entrada do usuário.
    //Mensagem Amigável: Adicionei uma mensagem que inclui o nome do carro favorito digitado pelo usuário.