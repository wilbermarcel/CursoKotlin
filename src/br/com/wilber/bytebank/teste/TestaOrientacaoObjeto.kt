package br.com.wilber.bytebank.teste

import br.com.wilber.bytebank.modelo.Analista
import br.com.wilber.bytebank.modelo.CalculadoraBonificacao
import br.com.wilber.bytebank.modelo.Diretor
import br.com.wilber.bytebank.modelo.Gerente

fun testaOrientacaoObjeto() {
    val funcionario = Analista(nome = "Wilber", cpf = "371.399.118-94", salario = 1000.0)
    funcionario.imprime()

    val gerente =
        Gerente(nome = "Marcel", cpf = "222.222.222-22", salario = 2000.0, senha = 1234)
    if (gerente.autenticacao(1234) == true) {
        println("Autenticação sucedida")
        gerente.imprime()
    } else println("Falha na autenticação")

    val diretor = Diretor(
        nome = "Karina",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )
    if (diretor.autenticacao(4000) == true) {
        println("Autenticação sucedida")
        diretor.imprime()
    } else println("Falha na autenticação")

    val analista = Analista(nome = "WMK", cpf = "444.444.444-44", salario = 3000.0)
    analista.imprime()

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(funcionario)
    calculadora.registra(gerente)
    calculadora.registra(diretor)
    calculadora.registra(analista)
    calculadora.imprimeTotal()
}