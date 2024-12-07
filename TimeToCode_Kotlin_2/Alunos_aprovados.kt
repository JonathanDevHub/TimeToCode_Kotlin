fun main(){
    var list = mutableListOf<Double>()

    for (i in 1..4){
        println("Insira (quatro valores): ")
        list.add(readln().toDouble())
    }

    var numero1 = list.filter { it <= 10 }
    var numero2 = numero1.sum() / numero1.count()

    println(numero1)


    if(numero2 <= 5){
        println("A média é $numero1")
        println("Aluno reprovado! ")
    } else{
        println("A média é $numero2")
        println("Aluno Aprovado!")
    }
}
    //Aluno_aprovado - Versão Alternativa
    fun main() {
        val list = mutableListOf<Double>()

        for (i in 1..4) {
            print("Insira o valor $i de 4: ")
            list.add(readln().toDouble())
        }

        val notasValidas = list.filter { it <= 10 }
        val media = if (notasValidas.isNotEmpty()) notasValidas.sum() / notasValidas.size else 0.0

        println("Notas válidas: $notasValidas")

        if (media <= 5) {
            println("A média é $media")
            println("Aluno reprovado!")
        } else {
            println("A média é $media")
            println("Aluno aprovado!")
        }
    }
    //Alterações realizadas:
    //Mensagens de Entrada: Ajustei as mensagens para indicar qual valor está sendo inserido (ex: "Insira o valor 1 de 4").
    //Correção na Média: Certifiquei-me de que a média seja calculada apenas se houver notas válidas.
    //Mensagens de Saída: Corrigi a mensagem exibida no caso de reprovação para mostrar a média correta.