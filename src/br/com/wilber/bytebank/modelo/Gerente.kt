package br.com.wilber.bytebank.modelo

//class br.com.wilber.bytebank.modelo.Gerente(nome: String, cpf: String, salario: Double = 0.0, val senha: Int) : br.com.wilber.bytebank.modelo.Funcionario(nome = nome, salario = salario, cpf = cpf) {
class Gerente : Funcionario {

    val senha: Int

    constructor(nome: String, cpf: String, salario: Double, senha: Int) : super(nome = nome, salario = salario, cpf = cpf) {
        this.senha = senha
    }

    init {
        println("Cadastrando br.com.wilber.bytebank.modelo.Gerente $nome")
    }

    override fun getBonificacao() = this.salario

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) return true
        return false
    }

    override fun imprime(tipo: String) {
        super.imprime(tipo = "br.com.wilber.bytebank.modelo.Gerente")
    }

}