fun main() {

    val listaDeComprasFrutas = mutableListOf("Banana", "Morango", "Maça", "Uva.")

    while (listaDeComprasFrutas.isNotEmpty()){
        println(" Fruta na lista disponível $listaDeComprasFrutas:")
        val frutanalista = readLine()
        if (frutanalista!=null)
            if (frutanalista in (listaDeComprasFrutas)) {
                listaDeComprasFrutas.remove(frutanalista)
                println("Fruta removida da lista")
            } else {
                println("Fruta indisponível no nosso mercado.")

            }
        println("Lista de compras finalizada")}
}
    //Frutas - Versão Alternativa
    fun main() {
        // Crie uma lista de compras com algumas frutas
        val listaDeComprasFrutas = mutableListOf("Banana", "Morango", "Maçã", "Uva")

        while (listaDeComprasFrutas.isNotEmpty()) {
            println("Frutas disponíveis na lista: $listaDeComprasFrutas")
            println("Digite o nome de uma fruta para remover:")

            val frutanalista = readLine()

            if (frutanalista != null) {
                if (frutanalista in listaDeComprasFrutas) {
                    listaDeComprasFrutas.remove(frutanalista)
                    println("Fruta removida da lista")
                } else {
                    println("Fruta indisponível no nosso mercado.")
                }
            }
        }

        println("Lista de compras finalizada")
    }
    //Alterações realizadas:
    //Correção do Loop: Mudei a mensagem "Lista de compras finalizada" para fora do loop while, para que ela só seja exibida quando a lista estiver vazia.
    //Melhoria na Formatação: Organizei o código para torná-lo mais limpo e legível.
    //Ajuste na Mensagem: Clarifiquei a mensagem de frutas disponíveis e a solicitação de remoção.