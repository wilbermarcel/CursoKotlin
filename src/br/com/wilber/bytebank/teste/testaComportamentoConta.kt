package br.com.wilber.bytebank.teste

import br.com.wilber.bytebank.modelo.Cliente
import br.com.wilber.bytebank.modelo.ContaCorrente
import br.com.wilber.bytebank.modelo.ContaPoupanca
import br.com.wilber.bytebank.modelo.Endereco

fun testaComportamentosConta() {
    val contaWil = ContaCorrente(
        Cliente(
            "Wilber",
            "111.111.111-11",
            1234,
            Endereco()
        ), 1000
    ).apply {
        deposita(300.0)
    }

    val contaMarcel = ContaPoupanca(
        Cliente(
            "Marcel",
            "222.222.222-22",
            1234,
            Endereco()

        ), 1001
    ).apply {
        deposita(200.0)
    }

    contaWil.deposita(50.0)
    contaWil.saca(100.0)

    contaMarcel.transfere(120.0, contaWil)

}

