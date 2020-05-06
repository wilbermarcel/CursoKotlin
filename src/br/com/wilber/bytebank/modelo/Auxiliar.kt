package br.com.wilber.bytebank.modelo

class Auxiliar(nome: String, cpf: String, salario: Double = 0.0) : Funcionario(nome = nome, salario = salario, cpf = cpf) {

    init {
        println("Cadastrando br.com.wilber.bytebank.modelo.Auxiliar $nome")
    }

    override fun getBonificacao() = this.salario * 0.05

    override fun imprime(tipo: String) {
        super.imprime(tipo = "br.com.wilber.bytebank.modelo.Auxiliar")
    }

}