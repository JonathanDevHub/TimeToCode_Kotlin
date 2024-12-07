var saldo = 100.5
val senhaCorreta = 3589
var extrato = mutableListOf("Depósito inicial: 100.5")
var continuar = true // Variável de controle para o loop principal

fun main() {
    println("Bem-vindo ao nosso banco! Qual o seu nome?")
    val nome = readLine() ?: "Cliente"
    println("Olá, $nome! É um prazer ter você por aqui!")

    while (continuar) { // Loop controlado pela variável continuar
        inicio(nome)
    }
}

fun inicio(nome: String) {
    if (!verificarSenha()) {
        println("Senha incorreta. Tente novamente.")
        return
    }

    println("\nEscolha uma opção:")
    println("1. Saldo")
    println("2. Extrato")
    println("3. Saque")
    println("4. Depósito")
    println("5. Transferência")
    println("6. Sair")

    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> verSaldo()
        2 -> verExtrato()
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> fazerTransferencia()
        6 -> sair(nome)
        else -> erro()
    }
}

fun verSaldo() {
    println("Seu saldo atual é: R$ $saldo")
}

fun fazerDeposito() {
    print("Qual o valor para depósito? R$ ")
    val deposito = readLine()?.toFloatOrNull() ?: 0.0f

    if (deposito <= 0) {
        println("Valor inválido. O valor do depósito deve ser maior que zero.")
    } else {
        saldo += deposito
        extrato.add("Depósito: R$ $deposito")
        verSaldo()
    }
}

fun fazerSaque() {
    print("Qual o valor para saque? R$ ")
    val saque = readLine()?.toFloatOrNull() ?: 0.0f

    if (saque <= 0) {
        println("Valor inválido. O valor do saque deve ser maior que zero.")
    } else if (saque > saldo) {
        println("Saldo insuficiente.")
    } else {
        saldo -= saque
        extrato.add("Saque: R$ -$saque")
        verSaldo()
    }
}

fun verExtrato() {
    println("Seu extrato:")
    extrato.forEach { println(it) }
}

fun fazerTransferencia() {
    print("Digite o número da conta de destino: ")
    val contaDestino = readLine()?.toIntOrNull() ?: 0

    print("Digite o valor a ser transferido: R$ ")
    val valorTransferido = readLine()?.toFloatOrNull() ?: 0.0f

    if (valorTransferido <= 0) {
        println("Valor inválido. O valor a ser transferido deve ser maior que zero.")
    } else if (valorTransferido > saldo) {
        println("Saldo insuficiente.")
    } else {
        saldo -= valorTransferido
        extrato.add("Transferência para a conta $contaDestino: R$ -$valorTransferido")
        verSaldo()
    }
}

fun erro() {
    println("Opção inválida. Por favor, escolha uma opção entre 1 e 6.")
}

fun sair(nome: String) {
    println("$nome, foi um prazer ter você por aqui!")
    continuar = false // Atualiza a variável para sair do loop principal
}

fun verificarSenha(): Boolean {
    print("Digite a senha: ")
    val senha = readLine()?.toIntOrNull() ?: 0
    return senha == senhaCorreta
}
    //Conta_bancaria - Versão Alternativa
    var saldo = 100.5
val senhaCorreta = 3589
val extrato = mutableListOf("Depósito inicial: R$ 100.5")
var continuar = true // Variável de controle para o loop principal

fun main() {
    println("Bem-vindo ao nosso banco! Qual o seu nome?")
    val nome = readLine() ?: "Cliente"
    println("Olá, $nome! É um prazer ter você por aqui!")

    while (continuar) { // Loop controlado pela variável continuar
        inicio(nome)
    }
}

fun inicio(nome: String) {
    if (!verificarSenha()) {
        println("Senha incorreta. Tente novamente.")
        return
    }

    println("\nEscolha uma opção:")
    println("1. Saldo")
    println("2. Extrato")
    println("3. Saque")
    println("4. Depósito")
    println("5. Transferência")
    println("6. Sair")

    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> verSaldo()
        2 -> verExtrato()
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> fazerTransferencia()
        6 -> sair(nome)
        else -> erro()
    }
}

fun verSaldo() {
    println("Seu saldo atual é: R$ $saldo")
}

fun fazerDeposito() {
    print("Qual o valor para depósito? R$ ")
    val deposito = readLine()?.toFloatOrNull() ?: 0.0f

    if (deposito <= 0) {
        println("Valor inválido. O valor do depósito deve ser maior que zero.")
    } else {
        saldo += deposito
        extrato.add("Depósito: R$ $deposito")
        verSaldo()
    }
}

fun fazerSaque() {
    print("Qual o valor para saque? R$ ")
    val saque = readLine()?.toFloatOrNull() ?: 0.0f

    if (saque <= 0) {
        println("Valor inválido. O valor do saque deve ser maior que zero.")
    } else if (saque > saldo) {
        println("Saldo insuficiente.")
    } else {
        saldo -= saque
        extrato.add("Saque: R$ -$saque")
        verSaldo()
    }
}

fun verExtrato() {
    println("Seu extrato:")
    extrato.forEach { println(it) }
}

fun fazerTransferencia() {
    print("Digite o número da conta de destino: ")
    val contaDestino = readLine()?.toIntOrNull() ?: 0

    print("Digite o valor a ser transferido: R$ ")
    val valorTransferido = readLine()?.toFloatOrNull() ?: 0.0f

    if (valorTransferido <= 0) {
        println("Valor inválido. O valor a ser transferido deve ser maior que zero.")
    } else if (valorTransferido > saldo) {
        println("Saldo insuficiente.")
    } else {
        saldo -= valorTransferido
        extrato.add("Transferência para a conta $contaDestino: R$ -$valorTransferido")
        verSaldo()
    }
}

fun erro() {
    println("Opção inválida. Por favor, escolha uma opção entre 1 e 6.")
}

fun sair(nome: String) {
    println("$nome, foi um prazer ter você por aqui!")
    continuar = false // Atualiza a variável para sair do loop principal
}

fun verificarSenha(): Boolean {
    print("Digite a senha: ")
    val senha = readLine()?.toIntOrNull() ?: 0
    return senha == senhaCorreta
}
    //Alterações realizadas:
    //Imutabilidade da lista extrato: Alterei para val pois não precisa ser mutável no contexto.
    //Formatação do valor inicial no extrato: Adicionei "R$" ao valor inicial para consistência.
    //Melhoria na Mensagem de Entrada de Dados: Assegurei que as mensagens de entrada de dados são claras e consistentes.