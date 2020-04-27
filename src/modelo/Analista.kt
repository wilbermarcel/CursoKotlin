package modelo

import Funcionario

class Analista(nome: String, cpf: String, salario: Double = 0.0) : Funcionario(nome = nome, salario = salario, cpf = cpf) {

    init {
        println("Cadastrando modelo.Analista $nome")
    }

    override fun getBonificacao() = this.salario * 0.1

    override fun imprime(tipo: String) {
        super.imprime(tipo = "modelo.Analista")
    }

}