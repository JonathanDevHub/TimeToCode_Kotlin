fun main (){
    var contador = 31

    while (contador >= 1){
        contador = contador - 1
        println("Detonação em: $contador")

    }

    println("EXPLOSÃO")
}
    //Bomba_relógio - Versão Alternativa
    fun main() {
        var contador = 31

        while (contador > 0) {
            contador -= 1
            println("Detonação em: $contador")
        }

        println("EXPLOSÃO")
    }
    //Alterações realizadas:
    //Condicional do Loop: Usei > 0 em vez de >= 1 para simplificar a condição do loop.
    //Operador de Decremento: Substituí contador = contador - 1 por contador -= 1 para simplificar o código.
    //Formatação do Código: Melhorei a formatação para torná-lo mais limpo e organizado.