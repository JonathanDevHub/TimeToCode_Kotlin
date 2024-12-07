fun main(){

    var tabuada = 1
    var contador = 0

    println("Informe um número: ")
    var numero = readln().toInt()

    while (tabuada <= numero){
        println("A tabuada do $tabuada: ")

        contador = 1

        while (contador <= 10){
            println("$tabuada x $contador = ${tabuada * contador}")
            contador = contador + 1
        }

        tabuada = tabuada + 1

    }
}
    //Tabuada - Versão Alternativa
    fun main() {
        println("Informe um número: ")
        val numero = readln().toInt()

        for (tabuada in 1..numero) {
            println("A tabuada do $tabuada:")

            for (contador in 1..10) {
                println("$tabuada x $contador = ${tabuada * contador}")
            }
        }
    }
    //Alterações realizadas:
    //Uso de val em vez de var: Utilizei val para numero, já que seu valor não muda.
    //Substituição de while por for: Usei loops for para simplificar e tornar o código mais idiomático e legível.
    //Formatação do Código: Melhorei a formatação para tornar o código mais limpo e organizado.