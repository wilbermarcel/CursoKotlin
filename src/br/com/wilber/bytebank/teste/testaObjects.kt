package br.com.wilber.bytebank.teste

import br.com.wilber.bytebank.modelo.Autenticavel
import br.com.wilber.bytebank.modelo.Conta
import br.com.wilber.bytebank.modelo.SistemaInterno


fun testaObjects() {
    val wilber = object : Autenticavel {
        val nome: String = "Wilber"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(wilber, 1000)

    println("nome do cliente ${wilber.nome}")

    testaContasDiferentes()

    println("Total de Contas: ${Conta.total}")
}