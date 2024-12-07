fun main(){
    var list = mutableListOf<Int>()

    for (i in 1..3){
        println("Insira (três valores): ")
        list.add(readln().toInt())
    }

    var maior: Int

    if (list[0] > list[1] && list[0] > list[2]){
        maior = list[0]

    }else if (list[1] > list[0] && list[1] > list[2]){

        maior = list[1]
    }else {
        maior = list[2]
    }

    println("O maior é $maior")

    var menor: Int

    if (list[0] < list[1] && list[0] < list[2]){

        menor = list[0]
    }else if (list[1] < list[0] && list[1] < list[2]){

        menor = list[1]
    }else {

        menor = list[2]
    }

    println("O menor é $menor")


    var media: Int

    if(list[0] != maior && list[0] != menor){
        media = list[0]
    } else if (list[1] != maior && list[1] != menor){
        media = list[1]
    } else {
        media = list[2]
    }
    println("O valor do meio é $media")
    var soma: Int = media + maior
    print("A soma dos dois maiores números é $soma")
}
    //Primeiro_e_segundo_maior - Versão Alternativa
    fun main() {
        val list = mutableListOf<Int>()

        for (i in 1..3) {
            print("Insira um valor (${i} de 3): ")
            list.add(readln().toInt())
        }

        val maior = list.maxOrNull() ?: 0
        val menor = list.minOrNull() ?: 0
        val media = list.filter { it != maior && it != menor }.firstOrNull() ?: menor

        println("O maior valor é $maior")
        println("O menor valor é $menor")
        println("O valor do meio é $media")

        val soma = maior + media
        println("A soma dos dois maiores valores é $soma")
    }
    //Alterações realizadas:
    //Uso de Funções Padrão: Usei as funções maxOrNull e minOrNull para encontrar o maior e menor valores de forma mais concisa.
    //Correção do Valor do Meio: Usei filter para encontrar o valor do meio, garantindo que ele seja diferente do maior e do menor. Caso contrário, assume o valor do menor.
    //Mensagens de Entrada: Melhorei a mensagem para indicar o número da entrada atual no loop for, tornando a interação com o usuário mais clara.
    //Estrutura do Código: Melhorei a formatação e a legibilidade do código, tornando-o mais limpo e organizado.