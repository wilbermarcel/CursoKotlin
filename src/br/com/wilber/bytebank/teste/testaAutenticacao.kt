package br.com.wilber.bytebank.teste

import br.com.wilber.bytebank.modelo.Cliente
import br.com.wilber.bytebank.modelo.Diretor
import br.com.wilber.bytebank.modelo.Endereco
import br.com.wilber.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val diretor = Diretor(
        nome = "Wilber",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )

    val sistema = SistemaInterno()
    sistema.entra(diretor, 1000)

    val cliente = Cliente(
        nome = "Wilber",
        cpf = "111.111.111-11",
        senha = 1234,
        endereco = Endereco()
    )
    sistema.entra(cliente, 1234)
}