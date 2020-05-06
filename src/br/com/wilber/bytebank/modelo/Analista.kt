package br.com.wilber.bytebank.modelo

class Analista(nome: String, cpf: String, salario: Double = 0.0) : Funcionario(nome = nome, salario = salario, cpf = cpf) {

    init {
        println("Cadastrando br.com.wilber.bytebank.modelo.Analista $nome")
    }

    override fun getBonificacao() = this.salario * 0.1

    override fun imprime(tipo: String) {
        super.imprime(tipo = "br.com.wilber.bytebank.modelo.Analista")
    }

}