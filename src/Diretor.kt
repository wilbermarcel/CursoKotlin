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
        println("Cadastrando Diretor $nome")
    }

    override fun getBonificacao() = this.salario + this.plr

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) return true
        return false
    }

    override fun imprime(tipo: String) {
        super.imprime(tipo = "Diretor")
        println("PLR: $plr")
    }

}