package br.com.wilber.bytebank.teste

import br.com.wilber.bytebank.modelo.Cliente
import br.com.wilber.bytebank.modelo.ContaCorrente
import br.com.wilber.bytebank.modelo.ContaPoupanca
import br.com.wilber.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente: ContaCorrente
    contaCorrente = ContaCorrente(
        Cliente(
            nome = "Wilber",
            cpf = "111.111.111-11",
            senha = 1234,
            endereco = Endereco("Grand Reserva")
        ), conta = 1000
    )

    val contaPoupanca =
        ContaPoupanca(
            titular = Cliente(
                nome = "Marcel",
                cpf = "222.222.222-22",
                senha = 1234,
                endereco = Endereco()
            ), conta = 1001
        )

    contaCorrente.deposita(valor = 100.0)
    contaPoupanca.deposita(valor = 100.0)

    contaCorrente.saca(valor = 10.0)
    contaPoupanca.saca(valor = 10.0)

    contaCorrente.transfere(valor = 10.0, contaDestino = contaPoupanca)
    contaPoupanca.transfere(valor = 8.0, contaDestino = contaCorrente)

    println("Endereco do ${contaCorrente.titular.nome}: ${contaCorrente.titular.endereco.logradouro}")
}
