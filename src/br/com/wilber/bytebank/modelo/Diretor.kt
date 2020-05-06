package br.com.wilber.bytebank.modelo

class Diretor(
        nome: String,
        cpf: String,
        salario: Double = 0.0,
        senha: Int,
        val plr: Double = 0.0
) : FuncionarioAdmin(
        nome = nome,
        salario = salario,
        cpf = cpf,
        senha = senha
) {

    init {
        println("Cadastrando br.com.wilber.bytebank.modelo.Diretor $nome")
    }

    override fun getBonificacao() = this.salario + this.plr

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) return true
        return false
    }

    override fun imprime(tipo: String) {
        super.imprime(tipo = "br.com.wilber.bytebank.modelo.Diretor")
        println("PLR: $plr")
    }

}